package com.markqt.spring4;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

    @GetMapping("/")
    String hello() {
        return "Hello, Spring 4! " + new Date();
    }
}
