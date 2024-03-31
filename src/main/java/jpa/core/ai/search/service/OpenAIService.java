package jpa.core.ai.search.service;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.*;
import com.azure.core.credential.AzureKeyCredential;
import jpa.core.products.domain.Product;
import jpa.core.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OpenAIService {

    private final ProductService productService;

    public OpenAIService(ProductService productService) {
        this.productService = productService;
    }

    public String getOpenAIResponse(String query) {
        final String prompt1 = "너는 보험 전문가야 무조건 답변하고 애매모호한 답변을 하지마! 그리고 아래 나오는 보험 상품에 대해서만 답변해줘!";
        final String prompt2 = "무조건 한국어로 답변해줘!";

        OpenAIClient client = new OpenAIClientBuilder()
                .credential(new AzureKeyCredential("97fa0872f4d14b7f8be23d9b3357b217"))
                .endpoint("https://oai-metlife-team006.openai.azure.com/")
                .buildClient();

        List<Product> allProducts = productService.findAll();
        String allProductNames = allProducts.stream()
                .map(Product::getName)
                .collect(Collectors.joining("\n"));

        List<ChatRequestMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatRequestSystemMessage(prompt1));
        chatMessages.add(new ChatRequestSystemMessage(allProductNames));
        chatMessages.add(new ChatRequestSystemMessage(prompt2));
        chatMessages.add(new ChatRequestUserMessage(query));

        ChatCompletions chatCompletions = client.getChatCompletions("gpt4-metlife-team06",
                new ChatCompletionsOptions(chatMessages));

        String answer = chatCompletions.getChoices().stream()
                .map(choice -> choice.getMessage().getContent())
                .collect(Collectors.joining(" "));
        return answer;
    }
}
