package dao;

import model.Manager;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ManagerDaoImpl implements ManagerDao {

    private final String PATH_FILE = "C:\\Users\\Huawei\\IdeaProjects\\crmIT\\src\\lib\\Manager.txt";
    private final File MANAGER_FILE = new File(PATH_FILE);

    public ManagerDaoImpl() {
        boolean isCreated = false;
        if (!MANAGER_FILE.exists()) {
            try {
                isCreated = MANAGER_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }

    @Override
    public void save(Manager manager) throws IOException {
        int count = getCount();
        PrintWriter out = null;
        try {
             out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(++count + " ");
            out.print(manager.getName() + " ");
            out.print(manager.getSurname() + " ");
            out.print(manager.getGmail() + " ");
            out.print(manager.getPhone() + " ");
            out.print(manager.getSalary() + " ");
            out.print(manager.getDateCreated().toString().substring(0, 22));
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
    public Manager[] findAll() throws IOException {
//        int count = getCount();
        Manager[] managers = new Manager[getCount()];
        Scanner scanner = null;
        try {
             scanner = new Scanner(MANAGER_FILE);

            for (int i = 0; scanner.hasNextLine(); i++) {
                Manager manager = new Manager();

                manager.setId(scanner.nextLong());
                manager.setName(scanner.next());
                manager.setSurname(scanner.next());
                manager.setGmail(scanner.next());
                manager.setPhone(scanner.next());
                manager.setSalary(Double.parseDouble(scanner.next()));
                manager.setDateCreated(LocalDateTime.parse(scanner.nextLine().substring(1)));

                managers[i] = manager;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            close(scanner);
        }


        return managers;
    }

    public int getCount() {
        int count = 0;
        try {

            Scanner scanner = new Scanner(MANAGER_FILE);
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
