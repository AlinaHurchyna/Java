package User;
import java.util.Date;
public class Message {
    private User author;
    private String content;
    private Date sendDate;

    public Message(User author, String content, Date sendDate) {
        this.author = author;
        this.content = content;
        this.sendDate = sendDate;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getSendDate() {
        return sendDate;
    }
}
