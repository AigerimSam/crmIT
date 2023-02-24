package dao;

import model.Mentor;

public interface MentorDao {
    void save(Mentor mentor);

    Mentor[] findAll();
}
