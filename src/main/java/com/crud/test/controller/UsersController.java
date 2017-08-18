package com.crud.test.controller;
import com.crud.test.domain.fostergem.RecentVisitorsDomain;
import com.crud.test.domain.fostergem.UsersDomain;
import com.crud.test.services.interfaces.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
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

}
