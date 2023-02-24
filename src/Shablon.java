import model.Manager;
import model.Mentor;
import model.Student;
import model.User;

import java.time.LocalDate;
import java.util.Scanner;

public class Shablon {
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
        student.setDob(LocalDate.parse(scanner.next()));
        return student;
    }
     public Mentor saveScannerMentor(){
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

}
