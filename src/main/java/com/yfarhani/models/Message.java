package com.yfarhani.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    private String id;

    private String message;

    private String friend;

    public String getId() {
        return id;
    }

    public Message setId(String id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getFriend() {
        return friend;
    }

    public Message setFriend(String friend) {
        this.friend = friend;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message1 = (Message) o;

        if (id != null ? !id.equals(message1.id) : message1.id != null) return false;
        if (message != null ? !message.equals(message1.message) : message1.message != null) return false;
        return friend != null ? friend.equals(message1.friend) : message1.friend == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (friend != null ? friend.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", friend='" + friend + '\'' +
                '}';
    }
}
