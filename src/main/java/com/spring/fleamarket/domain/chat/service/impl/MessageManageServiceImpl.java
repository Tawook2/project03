package com.spring.fleamarket.domain.chat.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fleamarket.domain.chat.mapper.MessageManageMapper;
import com.spring.fleamarket.domain.chat.model.MessageModel;
import com.spring.fleamarket.domain.chat.service.MessageManageService;

@Service
public class MessageManageServiceImpl implements MessageManageService{

	@Autowired
	MessageManageMapper mapper;
	
	@Override
	public void saveMessage(MessageModel msgModel) {
		
		mapper.saveMessage(msgModel);
	}

	@Override
	public List<MessageModel> recallChat(MessageModel msgModel) {
			
		return mapper.recallChat(msgModel);
	}

	@Override
	public Date checkTime(int messageNo) {
		
		return mapper.checkTime(messageNo);
	}

}
