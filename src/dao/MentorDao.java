package dao;

import model.Manager;
import model.Mentor;

public interface MentorDao {
    void save(Mentor mentor);

    Mentor[] findAll();
}
