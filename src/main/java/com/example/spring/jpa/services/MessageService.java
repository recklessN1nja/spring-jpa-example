package com.example.spring.jpa.services;

import com.example.spring.jpa.models.UserMessage;

import java.util.List;
import java.util.Optional;

public interface MessageService {

	Optional<UserMessage> findById(long id);

	List<UserMessage> findAllMessages();

	void saveMessage(UserMessage userMessage);

	void updateMessage(long id, UserMessage userMessage);

	void deleteMessageById(long id);

	boolean isPresent(long id);

}
