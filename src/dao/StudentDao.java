package dao;


import model.Mentor;
import model.Student;

public interface StudentDao {
    void save(Student student);

    Student[] findAll();

    Student[] deleteAll();


}
