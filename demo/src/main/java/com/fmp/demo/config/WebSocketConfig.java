package com.fmp.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.fmp.demo.handler.ChatHandler;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer{

	private final ChatHandler chatHandler;
    private final SocketInterceptor socketInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // /chat 엔드포인트로 연결할 때만 SocketInterceptor 적용
        registry.addHandler(chatHandler, "/chat")
                .addInterceptors(socketInterceptor)
                .setAllowedOrigins("*");
    }
	
}
