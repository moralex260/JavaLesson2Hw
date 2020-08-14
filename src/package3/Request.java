package package3;

import java.util.Date;

public class Request {
   private int id;
   private Date date;
   private String type;
   private Client client;

    public Request(int id,  Date date, String type, Client client) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", date=" + date +
                ", type=" + type +
                ", client=" + client +
                '}';
    }
}
