package dao;

import model.CourseFormat;
import model.Group;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class GroupDaoImpl implements GroupDao {
    private final String PATH_FILE = "C:\\Users\\Huawei\\IdeaProjects\\crmIT\\src\\lib\\Group.txt";
    private final File GROUP_FILE = new File(PATH_FILE);

    public GroupDaoImpl() {
        boolean isCreated = false;
        if (!GROUP_FILE.exists()) {
            try {
                isCreated = GROUP_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }

    @Override
    public void save(Group group) throws IOException {
        int count = getCount();
        PrintWriter out = null;
        try {
             out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(++count + " ");
            out.print(group.getName() + " ");
            out.print(group.getRoom() + " ");
            out.print(group.getStartTime() + " ");
            out.print(group.getDateCreated().toString().substring(0, 22));
            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            close(out);
        }
    }

    @Override
    public Group[] findAll() throws IOException {
        Group[] groups = new Group[100];
        Scanner sc = null;
        try {
             sc = new Scanner(GROUP_FILE);
            for (int i = 0; sc.hasNextLine(); i++) {
                Group group = new Group();
                group.setId(sc.nextLong());
                group.setName(sc.next());
                group.setRoom(sc.next());
                group.setStartTime(LocalTime.parse(sc.next()));
                group.setDateCreated(LocalDateTime.parse(sc.nextLine().substring(1)));

                groups[i] = group;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            close(sc);
        }
        return groups;
    }

    public int getCount() {
        int count = 0;
        try {

            Scanner scanner = new Scanner(GROUP_FILE);
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
