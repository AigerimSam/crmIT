package model;

import java.time.LocalDateTime;

public abstract class User  extends  BaseEntity{

    protected String surname;
    protected String name;
    protected String phone;
    protected String gmail;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
