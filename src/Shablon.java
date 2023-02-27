import dao.*;
import enums.CommandForEntity;
import enums.Format;
import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import static enums.CommandForDAO.*;
import static enums.CommandForEntity.*;

public class Shablon {
    StudentDao studentDao = new StudentDaoImpl();
    MentorDao mentorDao = new MentorDaoImpl();
    ManagerDao managerDao = new ManagerDaoImpl();


    public Manager saveScannerManager() {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        manager.setName(sc.next());
        System.out.println("surname: ");
        manager.setSurname(sc.next());
        System.out.println("email: ");
        manager.setGmail(sc.next());
        System.out.println("phone: ");
        manager.setPhone(sc.next());
        System.out.println("salary: ");
        manager.setSalary(sc.nextDouble());
        return manager;
    }

    public Student saveScannerStudent() {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        System.out.println("введите имя: ");
        student.setName(scanner.nextLine());
        System.out.println("введите фамилию: ");
        student.setSurname(scanner.nextLine());
        System.out.println("введите почту: ");
        student.setGmail(scanner.nextLine());
        System.out.println("введите номер: ");
        student.setPhone(scanner.nextLine());
        System.out.println("введите ДР (гггг-мм-дд) ");
        student.setDob(LocalDateTime
                .parse(scanner.next()));
        return student;
    }

    public Mentor saveScannerMentor() {
        Scanner scanner = new Scanner(System.in);

        Mentor mentor = new Mentor();
        System.out.println("введите имя: ");
        mentor.setName(scanner.nextLine());
        System.out.println("введите фамилию: ");
        mentor.setSurname(scanner.nextLine());
        System.out.println("введите эл почту: ");
        mentor.setGmail(scanner.nextLine());
        System.out.println(" введите номер: ");
        mentor.setPhone(scanner.nextLine());
        System.out.println("введите оплату за урок");
        mentor.setSalaryForLesson(scanner.nextInt());
        System.out.println("введите ваш стаж: ");
        mentor.setExperience(scanner.nextInt());
        return mentor;
    }

    public CourseFormat saveScannerCourseFormat() {
        Scanner scanner = new Scanner(System.in);

        CourseFormat format = new CourseFormat();
        System.out.println("выберите формат: ");
        format.setFormat(Format.valueOf(scanner.nextLine()));
        System.out.println("введите количество уроков в неделю: ");
        format.setDurationInWeek(scanner.nextInt());
        System.out.println(" online ofline ");
        format.setOnline(scanner.nextBoolean());
        System.out.println("введите продолжительность урока ");
        format.setLessonDuration(scanner.nextInt());
        System.out.println("введите продолжительнсть в неделях ");
        format.setLessonCountPerWeek(scanner.nextInt());
        return format;
    }

    public Course saveGroupScanner() {

        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
//        System.out.println("выберите формат: ");
//        format.setFormat(Format.valueOf(scanner.nextLine()));
//        System.out.println("введите количество уроков в неделю: ");
//        format.setDurationInWeek(scanner.nextInt());
//        System.out.println(" online ofline ");
//        format.setOnline(scanner.nextBoolean());
//        System.out.println("введите продолжительность урока ");
//        format.setLessonDuration(scanner.nextInt());
//        System.out.println("введите продолжительнсть в неделях ");
//        format.setLessonCountPerWeek(scanner.nextInt());
        return course;

    }

    public void crudCommand() {
        System.out.println("choose: ");
        System.out.println(FINDALL);
        System.out.println(SAVE);
        System.out.println(CommandForEntity.CLOSE);
    }

    public void findAllEntity() {
        System.out.println(STUDENT);
        System.out.println(MANAGER);
        System.out.println(MENTOR);
        System.out.println(COURSE);
        System.out.println(GROUP);
        System.out.println(COURSE_FORMAT);
    }

    public void saveEntity() {
        System.out.println(STUDENT);
        System.out.println(MANAGER);
        System.out.println(MENTOR);
        System.out.println(COURSE);
        System.out.println(GROUP);
        System.out.println(COURSE_FORMAT);
    }


    public void closeProg() {
        boolean isActive = false;
    }


}
