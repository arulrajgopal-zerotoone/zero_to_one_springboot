package com.math.addition;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SumController {

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}