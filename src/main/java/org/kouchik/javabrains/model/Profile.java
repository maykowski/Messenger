package org.kouchik.javabrains.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Wojtek on 2015-04-29.
 */

@XmlRootElement
public class Profile {
    private long id;
    private String profileName;
    private String lastName;
    private String message;
    private Date created;

    public Profile(long id, String profileName, String lastName, String message) {
        this.id = id;
        this.profileName = profileName;
        this.lastName = lastName;
        this.message = message;
        this.created = new Date();
    }

    public Profile() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
