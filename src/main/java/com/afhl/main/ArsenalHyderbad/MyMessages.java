package com.afhl.main.ArsenalHyderbad;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.afhl.main.model.Message;
import com.afhl.main.service.MessageService;

@Path("/messages")
public class MyMessages {
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	} 

}
