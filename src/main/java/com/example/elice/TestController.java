package com.example.elice;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {

//    private TestService testService;

    @GetMapping
    public String home() {
        return "Hello Elice";
    }

    @GetMapping("/content")
    public ResponseEntity<List<String>> getAllContents() {
        List<String> contents = new ArrayList<>();
        contents.add("Hello Elice");
        contents.add("Hello World");
        return ResponseEntity.ok(contents);
//        return ResponseEntity.ok(testService.findAll());
    }
//
    @PostMapping("/content")
//    public ResponseEntity<TestEntity> postContent(@RequestBody String content) {
    public ResponseEntity<String> postContent(@RequestBody String content) { // 이후 삭제 필요
        return ResponseEntity.ok("POSTED : " + content);
//        return ResponseEntity.ok(testService.createContent(content));
    }
}
