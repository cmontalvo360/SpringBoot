package com.genspark.ToDo.Dao;

import com.genspark.ToDo.Entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoDao extends JpaRepository<ToDo,Integer> {
}
