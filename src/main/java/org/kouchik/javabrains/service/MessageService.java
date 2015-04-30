package org.kouchik.javabrains.service;

import org.kouchik.javabrains.database.Database;
import org.kouchik.javabrains.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Wojtek on 2015-04-29.
 */
public class MessageService {

    private static Map<Long, Message> messages = Database.getMessages();
    private static long lastId;
    static{
        messages.put(new Long(1), new Message(1, "Wojtek","ms1"));
        messages.put(new Long(2), new Message(2, "Martaa","ms2"));
        lastId = 2;
    }



    public MessageService() {

    }

    public List<Message> getAllMessages() {

        return new ArrayList<Message>(messages.values());
    }


    public Message getMessage(long id){
        return messages.get(id);
    }

    public Message addMessage (Message message){
        message.setId(message.getId());
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message){
        if (message.getId() < 0)
            return null;
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(long id){
       return messages.remove(id);
    }

    public long getNewId(){
        return lastId++;
    }
}
