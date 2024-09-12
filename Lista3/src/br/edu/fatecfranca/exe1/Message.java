package br.edu.fatecfranca.exe1;

public class Message {
    private int id;
    private String text;
    private Person person;

    public Message(int id, String text, Person person) {
        this.id = id;
        this.text = text;
        this.person = person;
    }

    public Message() {}

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}