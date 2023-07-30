package com.thebengalichat.service;

import com.thebengalichat.exception.ChatException;
import com.thebengalichat.exception.UserException;
import com.thebengalichat.model.Chat;
import com.thebengalichat.model.User;
import com.thebengalichat.request.GroupChatRequest;

import java.util.List;

public interface ChatService {

    Chat createChat(User reqUser, Integer userId2) throws UserException;
    Chat findChatById(Integer chatId) throws ChatException;
    List<Chat> findAllChatByUserId(Integer userId) throws UserException;
    Chat createGroup(GroupChatRequest req, Integer reqUserId) throws UserException;
    Chat addUserToGroup (Integer userId, Integer chatId) throws UserException, ChatException;
    Chat renameGroup(Integer chatId, String groupName, Integer reqUserId) throws ChatException, UserException;
    Chat removeFromGroup(Integer chatId, Integer userId, Integer reqUser) throws UserException, ChatException;
    Chat deleteChat(Integer chatId, Integer userId) throws ChatException, UserException;


}
