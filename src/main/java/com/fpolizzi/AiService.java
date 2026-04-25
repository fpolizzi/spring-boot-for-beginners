package com.fpolizzi;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

/**
 * Created by fpolizzi on 25.04.26
 */
@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {

        chatClient = builder.build();
    }

    public String chat(String prompt) {

        return chatClient
                .prompt(prompt)
                .call()
                .content();
    }
}
