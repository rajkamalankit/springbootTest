package com.crud.test.services;

import com.crud.test.dao.UserNameRepository;
import com.crud.test.domain.UserNameDomain;
import com.crud.test.services.interfaces.IUserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class UserNameService implements IUserNameService{

    private  final UserNameRepository userNameRepository;
    @Autowired
    public UserNameService (UserNameRepository userNameRepository)
    {
        this.userNameRepository=userNameRepository;
    }
    @Override
    public UserNameDomain addusername(UserNameDomain userNameDomain) {
        return userNameRepository.save(userNameDomain);
    }
    //user table
    @PostMapping(path="addUser")
    @ResponseBody
    public UserNameDomain addUser(@RequestBody UserNameDomain userNameDomain){
        userNameRepository.save(userNameDomain);
        return userNameDomain;
    }

    @GetMapping(path = "getUser")
    @ResponseBody
    public List<UserNameDomain> getUser(){return userNameRepository.findAll();}


    @RequestMapping(value="getUserById/{id}",method = RequestMethod.GET)
    public UserNameDomain getUserBYId(@PathVariable Integer id){return userNameRepository.findOne(id);}
}
