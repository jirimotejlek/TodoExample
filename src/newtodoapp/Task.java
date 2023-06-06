package newtodoapp;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jirim
 */
public class Task {
    private boolean completed;
    private boolean completenessLevel;
    private String name;
    private Date dueDate;
    private Date creationDate;
    private Date completionDate;
    
    public void setName(String value) {
        name = value;
    }
    
    public void setCompleted(boolean value) {
        completed = value;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean getCompleted() {
        return completed;
    }
    
    
}
