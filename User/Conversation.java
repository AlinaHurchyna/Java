package User;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
public class Conversation {
    private List<User> participants;
    private List<Message> messages;

    public Conversation(List<User> participants) {
        this.participants = participants;
        this.messages = new ArrayList<>();
}
    public void addMessage(User author, String content, Date sendDate) {
        if (participants.contains(author)) {
            Message message = new Message(author, content, sendDate);
            messages.add(message);
        } else {
            System.out.println("This user is not a participant of the conversation.");
        }
    }
    public int countMessages() {
        return messages.size();
    }

    public int countMessagesByUser(User user) {
        int count = 0;
        for (Message message : messages) {
            if (message.getAuthor().equals(user)) {
                count++;
            }
        }
        return count;
    }
}