package com.samar;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class PingToolService {

    @Tool(name = "ping", description = "Responds with 'pong' followed by the input message")
    public String ping(String message) {
        return "pong: " + message;
    }
}
