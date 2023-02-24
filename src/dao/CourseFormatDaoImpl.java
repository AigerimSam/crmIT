package dao;

import model.Course;
import model.CourseFormat;

import java.io.*;
import java.util.Scanner;

public class CourseFormatDaoImpl implements CourseFormatDao {
    private final String PATH_FILE = "C:\\Users\\Huawei\\IdeaProjects\\crmIT\\src\\lib\\CourseFormat.txt";
    private final File COURSEFORMAT_FILE = new File(PATH_FILE);

    public CourseFormatDaoImpl() {
        boolean isCreated = false;
        if (!COURSEFORMAT_FILE.exists()) {
            try {
                isCreated = COURSEFORMAT_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (isCreated) {
            System.out.println("Новый файл создан");
        }
    }

    @Override
    public void save(CourseFormat courseFormat) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(PATH_FILE, true));
            out.print(courseFormat.getId() + " ");
            out.print(courseFormat.getFormat() + " ");
            out.print(courseFormat.getDurationInWeek() + " ");
            out.print(courseFormat.isOnline() + " ");
            out.print(courseFormat.getLessonDuration() + " ");
            out.print(courseFormat.getGetLessonDurationPerWeek() + " ");
            out.print(courseFormat.getLessonCountPerWeek() + " ");
            out.print(courseFormat.getDateCreated().toString().substring(0, 22));
            out.println();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public CourseFormat[] findAll() {
        CourseFormat[] courseFormats = new CourseFormat[100];
        try {
            Scanner sc = new Scanner(COURSEFORMAT_FILE);
            for (int i = 0; sc.hasNextLine(); i++) {
                CourseFormat courseFormat = new CourseFormat();

                courseFormat.setId(sc.nextLong());
                courseFormat.setFormat(sc.next());
                courseFormat.setDurationInWeek(sc.nextInt());
                courseFormat.setOnline(sc.nextBoolean());
                courseFormat.setLessonDuration(sc.nextInt());
                courseFormat.setGetLessonDurationPerWeek(sc.nextInt());
                courseFormat.setLessonCountPerWeek(sc.nextInt());

                courseFormats[i] = courseFormat;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courseFormats;
    }
}
