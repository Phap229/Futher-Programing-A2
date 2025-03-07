package com.rental.models;

/**
 * @author <HN-Group6>
 */
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class User {
    protected String id;
    protected String fullName;


    public User(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
