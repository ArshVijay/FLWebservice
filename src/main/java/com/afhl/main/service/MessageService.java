package com.afhl.main.service;

import java.util.ArrayList;
import java.util.List;

import com.afhl.main.model.Message;

public class MessageService {

	
	public List<Message> getAllMessages(){
		Message m1=new Message("1","vijay");
		Message m2=new Message("2","Ajay");
		List<Message> list=new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
}
