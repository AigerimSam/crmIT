package model;

import java.time.LocalDateTime;

public  abstract class BaseEntity {
    private long id;
    private LocalDateTime dateCreated = LocalDateTime.now();


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
