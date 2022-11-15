package com.ekusuy.techpit.chat.chatbackend.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ekusuy.techpit.chat.chatbackend.domain.messages.model.Message;
import com.ekusuy.techpit.chat.chatbackend.domain.messages.service.MessageDomainService;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {
    private final MessageDomainService messageDomainService;

    public Message post(Message message){
        var username = "guest";
        message.setUsername(username);
        return messageDomainService.post(message);
    }
}
