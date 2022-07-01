package com.genspark.ToDo.Service;

import com.genspark.ToDo.Entity.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> getAllTasks();
    ToDo getTaskById(int taskId);
    ToDo addTask(ToDo toDo);
    ToDo updateTask(ToDo toDo);
    String deleteTask(int taskId);
}
