package com.thebengalichat.service;

import com.thebengalichat.model.Chat;

public interface ChatService {

    public Chat createChat(Integer reqUser, Integer userId2);
}
