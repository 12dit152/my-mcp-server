package com.samar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;

@Configuration
public class ToolConfig {
	@Bean
	public ToolCallbackProvider pingTools(PingToolService pingToolService) {
		return MethodToolCallbackProvider.builder().toolObjects(pingToolService).build();
	}
}