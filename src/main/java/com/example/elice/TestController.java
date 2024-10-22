package com.example.elice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {

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
