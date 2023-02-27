import dao.*;
import enums.CommandForDAO;
import enums.CommandForEntity;
import exeptions.WrongCommandEx;
import model.*;


import java.util.Arrays;
import java.util.Scanner;

import static enums.CommandForDAO.*;
import static enums.CommandForEntity.*;

public class Main {
    public static void main(String[] args) {

        Shablon shablon = new Shablon();

        Scanner sc = new Scanner(System.in);
        StudentDao studentDao = new StudentDaoImpl();
        ManagerDao managerDao = new ManagerDaoImpl();
        MentorDao mentorDao = new MentorDaoImpl();

        loop:
        while (true) {
            shablon.crudCommand();
            CommandForDAO command = null;

            try {
                command = CommandForDAO.valueOf(sc.nextLine());
            } catch (Exception e) {
                throw new WrongCommandEx("WRONG COMMAND");
            }
            if (command != null) {
                switch (command) {
                    case CLOSE:
                        shablon.closeProg();
                        break loop;
                    case SAVE:
                        shablon.saveEntity();
                        CommandForEntity command1 = CommandForEntity.valueOf(sc.nextLine());
                        switch (command1) {
                            case STUDENT:
                                studentDao.save(shablon.saveScannerStudent());
                                break loop;
                            case MENTOR:
                                mentorDao.save(shablon.saveScannerMentor());
                                break loop;
                            case MANAGER:
                                managerDao.save(shablon.saveScannerManager());
                                break loop;
                            case CLOSE:
                                shablon.closeProg();
                                break;
                        }
                    case FINDALL:
                        shablon.findAllEntity();
                        CommandForEntity command2 = CommandForEntity.valueOf(sc.nextLine());
                        switch (command2) {
                            case STUDENT:
                                System.out.println(Arrays.toString(studentDao.findAll()));
                                break loop;
                            case MANAGER:
                                managerDao.findAll();
                                break loop;
                            case MENTOR:
                                System.out.println(Arrays.toString(mentorDao.findAll()));
                                break loop;
                        }
                }
            }
        }
    }
}
