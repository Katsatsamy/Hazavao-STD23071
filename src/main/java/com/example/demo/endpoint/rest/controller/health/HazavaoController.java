package com.example.demo.endpoint.rest.health;

import com.example.hazavao.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hazavao")
public class HazavaoController {

    @Autowired
    private HazavaoService openAiService;

    @GetMapping
    public ResponseEntity<String> hazavao(@RequestParam String teny) {
        String definition = openAiService.getDefinitionInMalagasy(teny);
        return ResponseEntity.ok(definition);
    }
}
