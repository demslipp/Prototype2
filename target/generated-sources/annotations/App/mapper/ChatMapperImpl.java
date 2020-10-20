package App.mapper;

import App.domain.Chat;
import App.dto.ChatDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T00:34:48+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.8 (JetBrains s.r.o.)"
)
public class ChatMapperImpl implements ChatMapper {

    @Override
    public ChatDto chatToDto(Chat chat) {
        if ( chat == null ) {
            return null;
        }

        ChatDto chatDto = new ChatDto();

        chatDto.setPersonId( chat.getPersonId() );
        chatDto.setChat( chat.getChat() );
        chatDto.setLikes( chat.getLikes() );

        return chatDto;
    }

    @Override
    public Chat dtoToChat(ChatDto chatDto) {
        if ( chatDto == null ) {
            return null;
        }

        Chat chat = new Chat();

        chat.setPersonId( chatDto.getPersonId() );
        chat.setChat( chatDto.getChat() );
        chat.setLikes( chatDto.getLikes() );

        return chat;
    }

    @Override
    public List<ChatDto> chatToDto(List<Chat> chats) {
        if ( chats == null ) {
            return null;
        }

        List<ChatDto> list = new ArrayList<ChatDto>( chats.size() );
        for ( Chat chat : chats ) {
            list.add( chatToDto( chat ) );
        }

        return list;
    }

    @Override
    public List<Chat> dtoToChat(List<ChatDto> chatDtos) {
        if ( chatDtos == null ) {
            return null;
        }

        List<Chat> list = new ArrayList<Chat>( chatDtos.size() );
        for ( ChatDto chatDto : chatDtos ) {
            list.add( dtoToChat( chatDto ) );
        }

        return list;
    }
}
