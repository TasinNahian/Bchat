package com.thebengalichat.service.impl;

import com.thebengalichat.exception.ChatException;
import com.thebengalichat.exception.UserException;
import com.thebengalichat.model.Chat;
import com.thebengalichat.model.User;
import com.thebengalichat.repository.ChatRepository;
import com.thebengalichat.request.GroupChatRequest;
import com.thebengalichat.service.ChatService;
import com.thebengalichat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatServiceImplementation implements ChatService {

    private final ChatRepository chatRepository;
    private final UserService userService;

    @Override
    public Chat createChat(User reqUser, Integer userId2) throws UserException {
        User user = userService.findUserById(userId2);

//        2:52:06 / 4:30:58
        return null;
    }

    @Override
    public Chat findChatById(Integer chatId) throws ChatException {
        return null;
    }

    @Override
    public List<Chat> findAllChatByUserId(Integer userId) throws UserException {
        return null;
    }

    @Override
    public Chat createGroup(GroupChatRequest req, Integer reqUserId) throws UserException {
        return null;
    }

    @Override
    public Chat addUserToGroup(Integer userId, Integer chatId) throws UserException, ChatException {
        return null;
    }

    @Override
    public Chat renameGroup(Integer chatId, String groupName, Integer reqUserId) throws ChatException, UserException {
        return null;
    }

    @Override
    public Chat removeFromGroup(Integer chatId, Integer userId, Integer reqUser) throws UserException, ChatException {
        return null;
    }

    @Override
    public Chat deleteChat(Integer chatId, Integer userId) throws ChatException, UserException {
        return null;
    }
}
