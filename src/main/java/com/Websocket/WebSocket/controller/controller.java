package com.Websocket.WebSocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.Websocket.WebSocket.model.Greeting;
import com.Websocket.WebSocket.model.Message;

@Controller
public class controller {

	
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(Message message) throws Exception {
		Thread.sleep(3000);
		System.out.println("hellooooo");
		return new Greeting("Hlleo ," + HtmlUtils.htmlEscape(message.getName()));
	}
}
