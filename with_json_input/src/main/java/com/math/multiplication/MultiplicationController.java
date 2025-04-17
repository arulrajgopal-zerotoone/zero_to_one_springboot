package com.math.multiplication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MultiplicationController {

    // DTO class inside controller for simplicity
    public static class MultiplicationRequest {
        public int a;
        public int b;
    }

    @PostMapping("/mul")
    public int MultiplyNumbers(@RequestBody MultiplicationRequest request) {
        return request.a  * request.b;
    }
}
