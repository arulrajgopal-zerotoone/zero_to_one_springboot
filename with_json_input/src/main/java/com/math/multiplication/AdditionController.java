package com.math.multiplication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdditionController {

    // DTO class inside controller for simplicity
    public static class AdditionRequest {
        public int a;
        public int b;
    }

    @PostMapping("/add")
    public int addNumbers(@RequestBody AdditionRequest request) {
        return request.a  * request.b;
    }
}
