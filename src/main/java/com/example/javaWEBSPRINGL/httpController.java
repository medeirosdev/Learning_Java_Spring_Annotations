package com.example.javaWEBSPRINGL;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/methodd") // Ele usará essa rota para todos
public class httpController {
    @GetMapping
    public String get(){
        return "http : GET";
    }
    @PostMapping
    public String post(){
        return "http: POST";
    }
    @PutMapping
    public String put(){
        return "http: PUT";
    }
    @PatchMapping
    public String patch(){
        return "http: PATCH";
    }
    @DeleteMapping
    public String delete(){
        return "http: DELETE";
    }

}
