package org.example.attack.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OpenController {

    @GetMapping("/resource")
    public String getResource() {
        log.info("api called");
        return "resource";
    }
}
