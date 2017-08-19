package com.crud.test.services;

import com.crud.test.dao.ToDoListRepository;
import com.crud.test.domain.ToDoListDomain;
import com.crud.test.services.interfaces.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ITodoService")
public class TodoService implements ITodoService {
    private final ToDoListRepository toDoListRepository;


    @Autowired
    public TodoService(ToDoListRepository toDoListRepository)
    {
        this.toDoListRepository = toDoListRepository;
    }

    @Override
    public ToDoListDomain addToDoList(ToDoListDomain toDoListDomain) {
        return toDoListRepository.save(toDoListDomain);
    }
}
