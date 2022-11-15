package com.ekusuy.techpit.chat.chatbackend.domain.messages.service;

import com.ekusuy.techpit.chat.chatbackend.domain.messages.model.Message;

public interface MessageRepository {
    void insert(Message message);
}
