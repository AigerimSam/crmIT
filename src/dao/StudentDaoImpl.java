package dao;

import model.Manager;
import model.Student;

import javax.swing.text.Style;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
    private final String PATH_FILE = "C:\\Users\\Huawei\\IdeaProjects\\crmIT\\src\\lib\\Student.txt";
    private final File STUDENT_FILE = new File(PATH_FILE);

    public StudentDaoImpl() {
        boolean isCreated = false;
        if (!STUDENT_FILE.exists()) {
            try {
                isCreated = STUDENT_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }

    @Override
    public void save(Student student) {
        int count = getCount();
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(++count + " ");
            out.print(student.getName() + " ");
            out.print(student.getSurname() + " ");
            out.print(student.getGmail() + " ");
            out.print(student.getPhone() + " ");
            out.print(student.getDob() + " ");
            out.print(student.getDateCreated().toString().substring(0, 22));
            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student[] findAll() {
        Student[] students = new Student[100];

        try {
            Scanner scanner = new Scanner(STUDENT_FILE);

            for (int i = 0; scanner.hasNextLine(); i++) {
                Student student = new Student();

                student.setId(scanner.nextLong());
                student.setName(scanner.next());
                student.setSurname(scanner.next());
                student.setGmail(scanner.next());
                student.setPhone(scanner.next());
                student.setDob(LocalDate.from(LocalDateTime.parse(scanner.nextLine().substring(1))));
                student.setDateCreated(LocalDateTime.parse(scanner.nextLine().substring(1)));

                students[i] = student;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return students;
    }

    public int getCount() {
        int count = 0;
        try {

            Scanner scanner = new Scanner(STUDENT_FILE);
            while (scanner.hasNextLine()) {
                count++;
                scanner.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Student[] deleteAll() {
        return new Student[0];
    }

//    @Override
//    public Student[] deleteAll() {
//        Student[] students = new Student[10];
//        try {
//            Scanner scanner = new Scanner(STUDENT_FILE);
//            for (int i = 0; scanner.hasNextLine(); i++) {
//                Student student = new Student();
//
//                student.re
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//    }


}
