package App.controller;


import App.dto.ChatDto;
import App.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @GetMapping("/getMessages")
    public List getMessage(@Validated @RequestBody List<ChatDto> chatDtos){
        chatService.getMessage(chatDtos);

        return Collections.emptyList();
    }
}
