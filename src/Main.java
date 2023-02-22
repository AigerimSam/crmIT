import dao.ManagerDao;
import dao.ManagerDaoImpl;
import dao.MentorDao;
import dao.MentorDaoImpl;
import model.Course;
import model.CourseFormat;
import model.Manager;
import model.Mentor;

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
        managerDao.save(shablon.saveScannerManager());



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
    }
}