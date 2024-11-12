package io.mosaed.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MOSAED ALOTAIBI
 */

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
