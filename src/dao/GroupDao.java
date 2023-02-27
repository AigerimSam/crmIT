package dao;

import model.Group;

import java.io.File;
import java.io.IOException;

public interface GroupDao extends CrudDao {

    void save (Group group ) throws IOException;

    Group[] findAll() throws IOException;
}
