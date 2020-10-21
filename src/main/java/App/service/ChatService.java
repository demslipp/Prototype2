package App.service;

import App.dto.ChatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    public List getMessage(List<ChatDto> chatDtos) {
    return Collections.emptyList();
    }
}
