package com.fotoable.jkens.controller;

import com.fotoable.jkens.pojo.Bag;
import com.fotoable.jkens.pojo.User;
import com.fotoable.jkens.service.IBagService;
import com.fotoable.jkens.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
private IBagService bagService;
    @RequestMapping("info")
    @ResponseBody
    public List<User> userInfor(){
        System.out.println( userService.getUser().size());
        return userService.getUser();
    }

    @RequestMapping("info2")
    @ResponseBody
    public int userInfor2(){
        System.out.println( userService.GetCount());

        return userService.GetCount();
    }

    @RequestMapping("info3")
    @ResponseBody
    public void userInfor3(){
        bagService.InsertNewBag();
    }

    @RequestMapping("info4")
    @ResponseBody
    public List<Bag> GetAllBags()
    {
        return bagService.GetAllBags();
    }
}
