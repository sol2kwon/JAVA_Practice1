package com.ex.api.user.controller;

import com.ex.api.user.domain.User;
import com.ex.api.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;
import java.util.Optional;

/**
 * packageName: com.ex.api.user.controller
 * fileName        : UserController.java
 * author          : solyikwon
 * date            : 2022-05-27
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-27         solyikwon      최초 생성
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/?")
public class UserController {
    private final UserService service;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return service.login(user);
    }
    @PostMapping("/logout")
    public  String logout(){
        return "";
    }
    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }
    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }
    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
    @GetMapping("/count")
    public long count() {
        return service.count();
    }
    @PutMapping("/update")
    public String update(@RequestBody User user) {
        service.update(user);
        return "";
    }
    @DeleteMapping("/delete")
    public String delete(User user) {
        service.delete(user);
        return "";

    }
    @PostMapping("/join")
    public String save(@RequestBody User user) {
        service.save(user);
        return "";
    }
    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }


}
