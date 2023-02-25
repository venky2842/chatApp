package com.venky.chatApp.mapper;

import com.venky.chatApp.db.dto.MessageDTO;
import com.venky.chatApp.db.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageMapper {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupMapper groupMapper;

    public MessageDTO toDTO(Message message) {
        MessageDTO messageDTO = new MessageDTO();
        messageDTO.setMessageText(message.getMessageText());
        messageDTO.setSender(userMapper.toDTO(message.getSender()));
        messageDTO.setGroup(groupMapper.toDTO(message.getGroup()));
        messageDTO.setCreatedAt(message.getCreatedAt());
        messageDTO.setUpdatedAt(message.getUpdatedAt());
        return messageDTO;
    }

    public Message toEntity(MessageDTO messageDTO) {
        Message message = new Message();
        message.setMessageText(messageDTO.getMessageText());
        message.setSender(userMapper.toEntity(messageDTO.getSender()));
        message.setGroup(groupMapper.toEntity(messageDTO.getGroup()));
        message.setCreatedAt(messageDTO.getCreatedAt());
        message.setUpdatedAt(messageDTO.getUpdatedAt());
        return message;
    }

}