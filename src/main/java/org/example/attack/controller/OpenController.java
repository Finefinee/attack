package org.example.attack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenController {

    @GetMapping("/resource")
    public String getResource() {
        return "resource";
    }
}
