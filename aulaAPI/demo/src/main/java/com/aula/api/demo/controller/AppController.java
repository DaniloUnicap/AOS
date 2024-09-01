package com.aula.api.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.api.demo.service.AppService;

@RestController
@RequestMapping("/api")
public class AppController {
    @Autowired
    private AppService appService;

     @GetMapping("/data")
        public ResponseEntity<String> getAllData() {
            String data = appService.getAllData();
            return ResponseEntity.ok(data);
        }
}
