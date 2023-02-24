package dao;

import model.Group;

import java.io.File;

public interface GroupDao {

    void save (Group group );

    Group[] findAll();
}
