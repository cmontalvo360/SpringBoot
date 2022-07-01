package com.genspark.ToDo.Service;

import com.genspark.ToDo.Dao.ToDoDao;
import com.genspark.ToDo.Entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService{

    @Autowired
    private ToDoDao toDoDao;

    @Override
    public List<ToDo> getAllTasks() {
        return this.toDoDao.findAll();
    }

    @Override
    public ToDo getTaskById(int taskId) {
        Optional <ToDo> list = this.toDoDao.findById(taskId);
        ToDo toDo = null;
        if(list.isPresent()) {
            toDo = list.get();
        } else {
            throw new RuntimeException("Task not found for id: " + taskId);
        }

        return toDo;
    }

    @Override
    public ToDo addTask(ToDo toDo) {
        return this.toDoDao.save(toDo);
    }

    @Override
    public ToDo updateTask(ToDo toDo) {
        return this.toDoDao.save(toDo);
    }

    @Override
    public String deleteTask(int taskId) {
        this.toDoDao.deleteById(taskId);
        return "Task deleted!";
    }
}
