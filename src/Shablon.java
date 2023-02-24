import model.Manager;
import model.User;

import java.util.Scanner;

public class Shablon {
    public Manager saveScannerManager(){
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.println("vvedite id: ");
        manager.setId(sc.nextLong());
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


}
