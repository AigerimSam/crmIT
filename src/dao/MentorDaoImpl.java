package dao;

import model.Manager;
import model.Mentor;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MentorDaoImpl implements MentorDao {
    private final String PATH_FILE = "C:\\Users\\Huawei\\IdeaProjects\\crmIT\\src\\lib\\Mentor.txt";

    private final File MENTOR_FILE = new File(PATH_FILE);

    public MentorDaoImpl() {
        boolean isCreated = false;
        if (!MENTOR_FILE.exists()) {
            try {
                isCreated = MENTOR_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }


    @Override
    public void save(Mentor mentor) {
        try {

            PrintWriter out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(mentor.getId() + " ");
            out.print(mentor.getName() + " ");
            out.print(mentor.getSurname() + " ");
            out.print(mentor.getGmail() + " ");
            out.print(mentor.getPhone() + " ");
            out.print(mentor.getSalaryForLesson() + " ");
            out.print(mentor.getDateCreated().toString().substring(0, 22));
            out.println();
            out.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("error");
        }
    }

    @Override
    public Mentor[] findAll() {
        Mentor [] mentors = new Mentor[100];
        try {
            Scanner scanner = new Scanner(MENTOR_FILE);

            for (int i = 0; scanner.hasNextLine() ; i++) {
                 Mentor mentor = new Mentor();
                mentor.setId(scanner.nextLong());
                mentor.setName(scanner.next());
                mentor.setGmail(scanner.next());
                mentor.setPhone(scanner.next());
                mentor.setSalaryForLesson(Double.parseDouble(scanner.next()));
                mentor.setSurname(scanner.next());
                mentor.setDateCreated(LocalDateTime.parse(scanner.nextLine().substring(1)));

                mentors[i] = mentor;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return  mentors;
    }

}
