package dao;


import model.Mentor;
import model.Student;

import java.io.IOException;

public interface StudentDao extends CrudDao {
    void save(Student student) throws IOException;

    Student[] findAll() throws IOException;

    Student[] deleteAll();


}
