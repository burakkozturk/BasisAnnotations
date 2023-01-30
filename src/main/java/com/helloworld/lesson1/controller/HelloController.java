package com.helloworld.lesson1.controller;

import com.helloworld.lesson1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class HelloController {



    /*
     * @GetMapping : Veri Getirirken
     * @PostMapping : Veri Kaydedilirken
     * @PutMapping : Veri Güncellenirken
     * @PatchMapping : Verinin Bir Bölümü Güncellenirken Örn: password değişicek
     * @DeleteMapping : Veri Silinirken
     * */


//    @GetMapping(path="/hello")
//    @RequestMapping(path = "/hello",method = RequestMethod.GET)
//    public String sayHello(){
//        return "Hello World";
//    }
//
//    @PostMapping(path = "/save")
//    public String saved() {
//        return "Kaydedildi";
//    }
//
//    @DeleteMapping(path = "/save")
//    public String deleted() {
//        return "Silindi";
//    }

//    @GetMapping(path = "/message/{m}")
//    public String getMessage(@PathVariable("m") String message){
//        return "Your message is : " + message;
//    }
//    @GetMapping(path = {"/message/{m}","/message"})// Birden fazla path verme kullanımı
//    public String getMessage(@PathVariable(name= "message",required = false) String message){ // Boş bırakılabilirlik için required
//        return "Your message is : " + message;
//
//    }

//    @PostMapping(path = "/saved")
//    public User saveUser(@RequestBody User user){
//        System.out.println("User saved");
//        user.setPassword("****");
//        return user;
//    }
//
//    public List<User> saveAllUser(@RequestBody List<User> users){
//        System.out.println("All user saved");
//        users.forEach(user -> user.setPassword("****"));
//        return users;
//    }

//    @GetMapping(path = "/header")
//    public String getHeader(@RequestHeader("My Header") String myHeader){
//        return "Your header is : "+ myHeader;
//    }
}



