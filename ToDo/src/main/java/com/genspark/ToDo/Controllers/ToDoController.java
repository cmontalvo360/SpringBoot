package com.genspark.ToDo.Controllers;

import com.genspark.ToDo.Entity.ToDo;
import com.genspark.ToDo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Hello World!</H1></HTML>";
    }

    @GetMapping("/tasks")
    public List<ToDo> getTasks() {
        return this.toDoService.getAllTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public ToDo getTask(@PathVariable String taskId) {
        return this.toDoService.getTaskById(Integer.parseInt(taskId));
    }

    @PostMapping("/tasks")
    public ToDo addTask(@RequestBody ToDo toDo) {
        return this.toDoService.addTask(toDo);
    }

    @PutMapping("/tasks")
    public ToDo updateTask(@RequestBody ToDo toDo) {
        return this.toDoService.updateTask(toDo);
    }

    @DeleteMapping("/tasks/{taskId}")
    public String deleteTask(@PathVariable String taskId) {
        return this.toDoService.deleteTask(Integer.parseInt(taskId));
    }
}
