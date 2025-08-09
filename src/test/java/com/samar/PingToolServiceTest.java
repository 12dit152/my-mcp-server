package com.samar;

import org.junit.jupiter.api.Test;

import com.samar.service.PingToolService;

public class PingToolServiceTest {

    @Test
    public void testPingToolService() {
        PingToolService pingToolService = new PingToolService();
        String response = pingToolService.ping("Hello");
        assert response.equals("pong: Hello");
    }

}
