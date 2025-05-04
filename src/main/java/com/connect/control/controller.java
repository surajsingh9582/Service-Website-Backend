package com.connect.control;

import com.connect.model.user;
import com.connect.repositary.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class controller {
    @Autowired
    repo r;

    @PostMapping
    public user addData(@RequestBody user users){
        return r.save(users);
    }
}
