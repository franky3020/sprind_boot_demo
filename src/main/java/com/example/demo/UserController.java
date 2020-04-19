package com.example.demo;
import com.example.db.UserDB;
import com.example.data.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserController {

    UserDB userDB = UserDB.getInstance();

    @GetMapping(value ="")
    public List<User> getUsers(){
        return userDB.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId){
        return userDB.getUser(userId);
    }

}
