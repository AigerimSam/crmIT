package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends User {
    private LocalDateTime dob;

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return
                surname +
                        " " + name +
                        " " + dob +
                        " " + phone +
                        " " + gmail +
                        " " + id +
                        " " + dateCreated;
    }
}
