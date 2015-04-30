package org.kouchik.javabrains.database;

import org.kouchik.javabrains.model.Message;
import org.kouchik.javabrains.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wojtek on 2015-04-29.
 */
public class Database {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<Long, Profile> profile = new HashMap<>();



    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfile() {
        return profile;
    }
}
