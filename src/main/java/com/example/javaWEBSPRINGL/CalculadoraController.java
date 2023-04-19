package com.example.javaWEBSPRINGL;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {
    @GetMapping(path="/somar/{a}/{b}")
    public int Somar(@PathVariable int a, @PathVariable int b)
    {
        return a + b;
    }
    @GetMapping("/subtrair")
    public int subtrair(
            @RequestParam(name = "a") int a,
            @RequestParam(name = "b") int b){
        return a-b;
    }
}
