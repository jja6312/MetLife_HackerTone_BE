package jpa.core.ai.search.controller;

import jpa.core.ai.search.controller.dto.OpenAISearchResponse;
import jpa.core.ai.search.service.OpenAIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class OpenAIController {
    private final OpenAIService openAIService;

    public OpenAIController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @GetMapping("/ai/search")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<OpenAISearchResponse> query(@RequestParam String query) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(OpenAISearchResponse.of(openAIService.getOpenAIResponse(query), "text"));
    }
}
