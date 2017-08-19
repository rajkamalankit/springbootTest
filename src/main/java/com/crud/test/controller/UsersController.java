package com.crud.test.controller;

import com.crud.test.domain.fostergem.RecentVisitorsDomain;
import com.crud.test.domain.fostergem.UsersDomain;
import com.crud.test.services.interfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping
public class UsersController {
    private final IUsersService usersService;


    @Autowired
    public UsersController(IUsersService usersService)
    {
        this.usersService = usersService;
    }


    @PostMapping(path ="signup")
    @ResponseBody
    public UsersDomain signup (@RequestBody UsersDomain usersDomain){
        return usersService.signup(usersDomain);
    }
    @PostMapping(path = "saveRecentVisitors")
    @ResponseBody
    public RecentVisitorsDomain saveRecentVisitors(@RequestBody RecentVisitorsDomain recentVisitorsDomain)
    {
        return usersService.saveRecentVisitors(recentVisitorsDomain);
    }
    @RequestMapping(path = "login")
    @ResponseBody
    public UsersDomain login(@RequestBody UsersDomain usersDomain) throws Exception {
        return usersService.login(usersDomain);
    }

}
