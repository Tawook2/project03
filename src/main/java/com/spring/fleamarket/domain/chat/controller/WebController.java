package com.spring.fleamarket.domain.chat.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fleamarket.domain.account.service.AccountFindService;
import com.spring.fleamarket.domain.chat.service.ReportService;
import com.spring.fleamarket.domain.model.Account;
import com.spring.fleamarket.domain.model.Report;

import lombok.extern.log4j.Log4j;

@Log4j
@RestController
public class WebController {
	
	@Autowired
	ReportService service;

	@Autowired
	AccountFindService serviceAF;
	
	@GetMapping("/chat")
	public List<Account> bringUpChatUser() {
		
		//현재의 아이디와 채팅한 유저만 불어오기(수정필요)
		List<Account> result = serviceAF.selectAll(); 
	
		return result;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/report", method = RequestMethod.POST)
	public void saveReportInfo(@RequestBody Report rp) {
			
		log.info(rp.toString());
	
		service.saveReport(rp);
		
	}
	
}
