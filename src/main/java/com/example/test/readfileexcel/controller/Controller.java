package com.example.test.readfileexcel.controller;

import com.example.test.readfileexcel.service.Service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Mhosein-abbasi 11/9/21
 */
@RestController
@RequestMapping("/file")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping("/upload")
    public String upload(
            @RequestParam MultipartFile file,
            @RequestParam Integer numberOfSheet)
            throws Exception {
        return service.upload(file, numberOfSheet);
    }
}
