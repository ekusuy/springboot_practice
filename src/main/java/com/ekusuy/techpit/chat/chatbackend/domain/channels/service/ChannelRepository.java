package com.ekusuy.techpit.chat.chatbackend.domain.channels.service;

import java.util.List;
import java.util.Optional;

import com.ekusuy.techpit.chat.chatbackend.domain.channels.model.Channel;

public interface ChannelRepository {
    void insert(Channel channel);
    List<Channel> findAll();
    Optional<Integer> getMaxId();
}