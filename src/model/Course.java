package model;

public class Course  extends  BaseEntity{
    private String name;
    private double prise;
    private CourseFormat courseFormat;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }
}