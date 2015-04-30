package org.kouchik.javabrains.resources;

import org.kouchik.javabrains.model.Message;
import org.kouchik.javabrains.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Wojtek on 2015-04-29.
 */

@Path("/messages")
public class MessageResource {

    MessageService ms = new MessageService();

    @GET
    @Produces("application/json")
    public List<Message> getMessage() {
        return ms.getAllMessages();
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)

    public Message addMessage(@PathParam("messageId") long messageId) {
        return ms.getMessage(messageId);
    }

    @POST
    @Path("/addMessage")
    @Consumes (MediaType.APPLICATION_JSON)
    public Response addMessage(Message message) {
        Message newMessage = new Message(ms.getNewId(), message.getAuthor(), message.getMessage());
        ms.addMessage(newMessage);
        System.out.println("new message added: " + message.getAuthor() + " " + message.getMessage());
        return Response.ok("Message saved").build();
    }

    @PUT
    @Path("/updateMessage")
    @Consumes (MediaType.APPLICATION_JSON)
    public Response updateMessage(Message message) {
        ms.updateMessage(message);
        System.out.println("new message added: " + message.getAuthor() + " " + message.getMessage());
        return Response.ok("Message saved").build();
    }


    @DELETE
    @Path("/delete/{messageId}")
    public Response deleteMessage(@PathParam("messageId") long messageId) {
        ms.removeMessage(messageId);
        return Response.ok("Message deleted").build();
    }

}
