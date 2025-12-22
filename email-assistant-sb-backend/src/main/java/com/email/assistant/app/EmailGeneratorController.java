package com.email.assistant.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins="*") // THE REASON YOUR FRONTEND CAN CONNECT TO BACKEND
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        // Calling generateEmailReply() method coded in EmailGeneratorService.java
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response); /* Returning the generated email response */
    }
}
