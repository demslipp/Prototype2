package App.mapper;

import App.domain.Account;
import App.domain.Chat;
import App.dto.AccountDto;
import App.dto.ChatDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    ChatDto chatToDto(Chat chat);

    Chat dtoToChat(ChatDto chatDto);

    List<ChatDto> chatToDto(List<Chat> chats);

    List<Chat> dtoToChat(List<ChatDto> chatDtos);

}
