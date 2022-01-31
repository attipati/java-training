package com.dxc.demoapp1.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.dxc.demoapp1.model.User;
import com.dxc.demoapp1.service.UserService;
import org.modelmapper.ModelMapper;
import com.dxc.demoapp1.dto.UserDTO;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import com.dxc.demoapp1.model.User;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;
    private static List<User> users= new ArrayList();

    @GetMapping({"","/"})
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @PostMapping({"","/"})
    public ResponseEntity<User> create(@RequestBody UserDTO userReqObj) {
        User user = modelMapper.map(userReqObj, User.class);
        user.setCreationDate(LocalDate.now());
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


    
}
