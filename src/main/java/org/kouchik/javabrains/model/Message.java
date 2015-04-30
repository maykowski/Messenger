package org.kouchik.javabrains.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Wojtek on 2015-04-29.
 */

@XmlRootElement
public class Message {
    private long id;
    private String author;
    private Date createDate;
    private String message;

    public Message(long id, String author, String message) {
        this.id = id;
        this.author = author;
        this.createDate = new Date();
        this.message = message;
    }

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

