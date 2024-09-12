package br.edu.fatecfranca.exe1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    List<Message> messages = new ArrayList<Message>();

    public Forum(int id, String name, String url, int msgId, String msgText, Person msgPerson) {
        this.id = id;
        this.name = name;
        this.url = url;
        messages.add(new Message(msgId, msgText, msgPerson));
    }

    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessages(int msgId, String msgText, Person msgPerson) {
        this.messages.add(new Message(msgId, msgText, msgPerson));
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messages=\n" + messages +
                '}';
    }
}