package newtodoapp;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jirim
 */
public class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private Observable observable;
   
    
    public void addTask(Task task) {
        tasks.add(task);
        observable.OnUpdate();
    }
    
    public Task getTask(int index) {
        return tasks.get(index);
    }
    
    public int getTasksCount() {
        return tasks.size();
    }
    
    public void registerObservable(Observable o) {
        observable = o;
    }
   
}
