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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatServiceImplementation implements ChatService {

    private final ChatRepository chatRepository;
    private final UserService userService;

    @Override
    public Chat createChat(User reqUser, Integer userId2) throws UserException {
        User user = userService.findUserById(userId2);
        Chat isChatExist  =chatRepository.findSingleChatByUsers(user, reqUser);
        if(isChatExist != null){
            return isChatExist;
        }
        Chat chat  = new Chat();
        chat.setCreatedBy(reqUser);
        chat.getUsers().add(user);
        chat.getUsers().add(reqUser);
        chat.setGroup(false);

        return chat;
    }

    @Override
    public Chat findChatById(Integer chatId) throws ChatException {
        Optional<Chat> chat = chatRepository.findById(chatId);
        if(chat.isPresent()){
            return chat.get();
        }
        throw new ChatException("Chat not found with id "+chatId);
    }

    @Override
    public List<Chat> findAllChatByUserId(Integer userId) throws UserException {
        User user = userService.findUserById(userId);
        List<Chat> chats = chatRepository.findChatByUserId(userId);
        return chats;
    }

    @Override
    public Chat createGroup(GroupChatRequest req, User reqUser) throws UserException {
        Chat group = new Chat();
        group.setGroup(true);
        group.setChatImage(req.getChatImage());
        group.setChatName(req.getChatName());
        group.setCreatedBy(reqUser);
        group.getAdmins().add(reqUser);
        for(Integer userId : req.getUserIds()){
            User user = userService.findUserById(userId);
            group.getUsers().add(user);
        }
        return group;
    }

    @Override
    public Chat addUserToGroup(Integer userId, Integer chatId, User reqUser) throws UserException, ChatException {
        Optional<Chat> opt = chatRepository.findById(chatId);
        User user = userService.findUserById(userId);
        if(opt.isPresent()){
            Chat chat = opt.get();
            if(chat.getAdmins().contains(reqUser)){
                chat.getUsers().add(user);
                return chat;
            }else{
                throw new UserException("You don't have access as admin");
            }
        }
        throw new ChatException("Chat not found with id: "+chatId);

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
