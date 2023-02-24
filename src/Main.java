import dao.*;
import enums.CommandForDAO;
import model.*;


import java.util.Scanner;

import static enums.CommandForDAO.*;

public class Main {
    public static void main(String[] args) {

        Shablon shablon = new Shablon();

        Scanner sc = new Scanner(System.in);
        StudentDao studentDao = new StudentDaoImpl();
        ManagerDao managerDao = new ManagerDaoImpl();
        MentorDao mentorDao = new MentorDaoImpl();

        boolean isAct = true;
        while (isAct) {
            System.out.println("choose: ");
            System.out.println(FINDALL);
            System.out.println(SAVE);
            System.out.println(CLOSE);
            CommandForDAO command = valueOf(sc.nextLine());
            switch (command) {
                case CLOSE:
                    System.out.println("вы вышли из программы");
                    isAct = false;
                    break;
                case SAVE:
                    System.out.println("кого хотите зарегистировать?");
                    System.out.println(STUDENT);
                    System.out.println(MANAGER);
                    System.out.println(MENTOR);
                    CommandForDAO command1 = valueOf(sc.nextLine());
                    switch (command1) {
                        case STUDENT:
                            System.out.println("сохранен");
                            studentDao.save(shablon.saveScannerStudent());
                            break;
                        case MANAGER:
                            System.out.println("сохранен");
                            managerDao.save(shablon.saveScannerManager());
                            break;
                        case MENTOR:
                            System.out.println("сохранен");
                            mentorDao.save(shablon.saveScannerMentor());
                            break;
                    }
                case FINDALL:
                    System.out.println("найти список : ");
                    System.out.println(STUDENT);
                    System.out.println(MANAGER);
                    System.out.println(MENTOR);
                case STUDENT:
                    studentDao.findAll();
                    break;
                case MANAGER:
                    managerDao.findAll();
                    break;
                case MENTOR:
                    mentorDao.findAll(); break;
            }
        }
    }
}
