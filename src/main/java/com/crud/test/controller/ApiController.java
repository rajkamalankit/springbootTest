package com.crud.test.controller;

import com.crud.test.dao.DetailUserRepository;
import com.crud.test.dao.ToDoListRepository;
import com.crud.test.dao.UserNameRepository;
import com.crud.test.domain.DetailUserDomain;
import com.crud.test.domain.ToDoListDomain;
import com.crud.test.domain.UserNameDomain;
import com.crud.test.services.interfaces.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class ApiController {

    private final ToDoListRepository toDoListRepository;
    private final UserNameRepository userNameRepository;
    private final DetailUserRepository detailUserRepository;
    private final ITodoService apiServices;
    @Autowired
    public ApiController(ITodoService apiServices, ToDoListRepository toDoListRepository, UserNameRepository userNameRepository, DetailUserRepository detailUserRepository) {
        this.toDoListRepository = toDoListRepository;
        this.userNameRepository=userNameRepository;
        this.detailUserRepository=detailUserRepository;
        this.apiServices = apiServices;
    }




    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }

    @RequestMapping(value = "reverse/{str}", method = RequestMethod.GET)
    public String reverse(@PathVariable String str) {
        StringBuilder a = new StringBuilder();
        a.append(str);
        a = a.reverse();
        return a.toString();
    }

    @PostMapping(path = "addToDo")
    @ResponseBody
    public ToDoListDomain addToDo(@RequestBody ToDoListDomain toDoListDomain) {
       return apiServices.addToDoList(toDoListDomain);
    }
    // for user name table
    @PostMapping(path="addUser")
    @ResponseBody
    public UserNameDomain addUser(@RequestBody UserNameDomain userNameDomain){
        userNameRepository.save(userNameDomain);
        return userNameDomain;
    }
    //this function for detail user
    @PostMapping(path="detailuser")
    @ResponseBody
    public DetailUserDomain detailuser(@RequestBody DetailUserDomain detailUserDomain){
        detailUserRepository.save(detailUserDomain);
                return detailUserDomain;
    }

    @GetMapping(path = "getToDo")
    @ResponseBody
    public List<ToDoListDomain> getToDo() {
       return toDoListRepository.findAll();
    }

    // for user name table
    @GetMapping (path = "getUser")
    @ResponseBody
    public List<UserNameDomain> getUser(){return userNameRepository.findAll();}
    //for detail user
    @GetMapping(path = "getdetailuser")
    @ResponseBody
    public List<DetailUserDomain> getdetailuser(){return detailUserRepository.findAll();}

    @RequestMapping(value = "getToDoById/{id}", method = RequestMethod.GET)
    public ToDoListDomain getToDoById(@PathVariable Integer id) {
        return toDoListRepository.findOne(id);
    }

    //for detail user
    @RequestMapping(value ="getdetailuserById/{id}",method = RequestMethod.GET)
    public DetailUserDomain getdetailuserById(@PathVariable Integer id) {return detailUserRepository.findOne(id); }

    @RequestMapping(value="getUserById/{id}",method = RequestMethod.GET)
    public UserNameDomain getUserBYId(@PathVariable Integer id){return userNameRepository.findOne(id);}

    @RequestMapping(value = "calculater/{a}/{b}/{c}", method = RequestMethod.GET)
    public String calculater(@PathVariable Integer a, @PathVariable Integer b, @PathVariable Integer c) {
        if (c == 1) {
            Integer d = b + a;
            return "sum=" + d.toString();
        } else if (c == 2) {

            Integer d = b - a;
            return "sum=" + d.toString();
        } else if (c == 3) {
            Integer d = b * a;
            return "sum=" + d.toString();
        } else {
            Integer d = a / b;
            return "sum=" + d.toString();
        }

    }

    @RequestMapping(value = "plindrome/{str}", method = RequestMethod.GET)
    public String plindrome(@PathVariable String str) {
        StringBuilder a = new StringBuilder(str);
       // StringBuilder b = new StringBuilder();

       // a.append(str);
         a.reverse();

        String rev=a.toString();
       // return rev;
        if(str.equals(rev))
        return "Plindrome";
        else
            return "not a plindrome";
    }
    @RequestMapping(value = "sum/{num}", method = RequestMethod.GET)
    public Integer sum(@PathVariable Integer num) {
       int i=0;
        int b=0;
       for(i=1;i<=num;i++)
       {

                   b=i+b;
       }
            return b;
    }
    @RequestMapping(value = "lengthstring/{str}", method = RequestMethod.GET)
    public int lengthstring (@PathVariable String str) {
        int l=0;
        l=str.length();

        return l;



    }
    @RequestMapping(value = "lengtharr/arra[]}", method = RequestMethod.GET)
    public int lengtharr (@PathVariable int arra[]) {
        int l=0;
        for(l=0;l<10;l++)
        {

        }

        return l;



    }


    //@RequestMapping(value="num", method = RequestMethod.GET)
}

