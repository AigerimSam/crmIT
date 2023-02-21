package model;

public class CourseFormat extends BaseEntity {
    private String format;
    private  int durationInBeek;
    private  boolean isOnline;
    private  int lessonDurationPerHour;
    private  int getLessonDurationPerWeek;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getDurationInBeek() {
        return durationInBeek;
    }

    public void setDurationInBeek(int durationInBeek) {
        this.durationInBeek = durationInBeek;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public int getLessonDurationPerHour() {
        return lessonDurationPerHour;
    }

    public void setLessonDurationPerHour(int lessonDurationPerHour) {
        this.lessonDurationPerHour = lessonDurationPerHour;
    }

    public int getGetLessonDurationPerWeek() {
        return getLessonDurationPerWeek;
    }

    public void setGetLessonDurationPerWeek(int getLessonDurationPerWeek) {
        this.getLessonDurationPerWeek = getLessonDurationPerWeek;
    }
}
