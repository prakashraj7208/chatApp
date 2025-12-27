package com.chat.chatApp.Controller;

import com.chat.chatApp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/message")
    public ChatMessage chatMessage(ChatMessage message){
        return message;
    }

    @GetMapping("/")
    public String home(){
        return "chat";
    }
}
