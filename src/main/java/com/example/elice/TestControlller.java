package com.example.elice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestControlller {

//    private TestService testService;

    @GetMapping
    public String home() {
        return "Hello Elice";
    }

//    @GetMapping("/content")
//    public ResponseEntity<List<String>> getAllContents() {
//        return ResponseEntity.ok(testService.findAll());
//    }
//
//    @PostMapping("/content")
//    public ResponseEntity<TestEntity> postContent(@RequestBody String content) {
//        return ResponseEntity.ok(testService.createContent(content));
//    }
}
