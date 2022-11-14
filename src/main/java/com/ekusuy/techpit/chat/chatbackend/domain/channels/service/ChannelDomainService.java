package com.ekusuy.techpit.chat.chatbackend.domain.channels.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ekusuy.techpit.chat.chatbackend.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChannelDomainService {

    public Channel create(Channel channel){
        Optional<Integer> currentMaxId = Optional.of(1);

        var newid = currentMaxId.orElse(0) + 1;
        channel.setId(newid);

        return channel;
    }

    public List<Channel> findAll(){
        return Collections.emptyList();
    }
}
