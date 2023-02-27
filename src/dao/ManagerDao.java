package dao;

import model.Manager;

import java.io.IOException;

public interface ManagerDao extends CrudDao {

    void save(Manager manager) throws IOException;

    Manager[] findAll() throws IOException;
}
