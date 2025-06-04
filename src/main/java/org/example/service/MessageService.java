package org.example.service;



import org.example.model.Message;

import org.example.repository.MessageRepository;

import java.util.Optional;



public class MessageService {

    private MessageRepository messageRepository;



    public MessageService(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;

    }



    public Optional getMessageById(Long id) {

        return messageRepository.findById(id);

    }



    public Message createMessage(Message message) {

        return messageRepository.save(message);

    }

}

