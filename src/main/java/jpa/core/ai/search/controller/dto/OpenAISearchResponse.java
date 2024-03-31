package jpa.core.ai.search.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(staticName = "of")
public class OpenAISearchResponse {
    String data;
    String Type;
}