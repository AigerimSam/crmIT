import dao.*;
import model.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerDao managerDao = new ManagerDaoImpl();
        Course course = new Course();
        course.setId(1);
        course.setName("Java");
        course.setPrice(15000);

        CourseFormat bootcamp = new CourseFormat();
        bootcamp.setId(1);
        bootcamp.setOnline(true);
        bootcamp.setFormat("Bootcamp");
        bootcamp.setLessonCountPerWeek(5);
        bootcamp.setDurationInWeek(18);
        bootcamp.setLessonDuration(3);

        course.setCourseFormat(bootcamp);

        Shablon shablon = new Shablon();
        Manager manager = new Manager();
      //  managerDao.save(shablon.saveScannerManager());



        //Manager[] managers = managerDao.findAll();
       // System.out.println(Arrays.toString(managers));

        MentorDao mentorDao = new MentorDaoImpl();
        Mentor mentor = new Mentor();
        mentor.setId(1);
        mentor.setName("Aigerim");
        mentor.setSurname("Samidinova");
        mentor.setGmail("aigerimsam@gmail.com");
        mentor.setPhone("0501590992");
        mentor.setSalaryForLesson(1000);
        mentor.setExperience(3);
        mentorDao.save(mentor);


        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1);
        student.setName("aaa");
        student.setSurname("aaa");
        student.setGmail("fff");
        student.setPhone("dddd");

        studentDao.save(student);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("bbb");
        student1.setSurname("bbb");
        student1.setGmail("fff");
        student1.setPhone("dddd");

        studentDao.save(student1);

    }
}