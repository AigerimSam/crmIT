package dao;

import model.Course;
import model.CourseFormat;

public interface CourseFormatDao {
    void save(CourseFormat courseFormat);

    CourseFormat[] findAll();
}
