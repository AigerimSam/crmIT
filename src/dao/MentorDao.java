package dao;

import model.Mentor;

import java.io.IOException;

public interface MentorDao extends CrudDao {
    void save(Mentor mentor) throws IOException;

    Mentor[] findAll() throws IOException;
}
