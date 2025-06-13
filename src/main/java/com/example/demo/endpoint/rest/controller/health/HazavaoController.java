package com.example.demo.endpoint.rest.health;

import com.example.demo.service.HazavaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hazavao")
public class HazavaoController {

    @Autowired
    private HazavaoService hazavaoService;

    @GetMapping
    public ResponseEntity<String> hazavao(@RequestParam String teny) {
        String definition = hazavaoService.getDefinitionInMalagasy(teny);
        return ResponseEntity.ok(definition);
    }
}
