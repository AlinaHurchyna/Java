package User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", new Date());
        User user2 = new User("Alice", new Date());
        User user3 = new User("Bob", new Date());

        Conversation conversation = new Conversation(List.of(user1, user2));

        conversation.addMessage(user1, "Hello!", new Date());
        conversation.addMessage(user2, "Hi!", new Date());
        conversation.addMessage(user3, "I'm not a participant.", new Date());

        System.out.println("Total messages: " + conversation.countMessages());
        System.out.println("Messages by user1: " + conversation.countMessagesByUser(user1));
        System.out.println("Messages by user2: " + conversation.countMessagesByUser(user2));
        System.out.println("Messages by user3: " + conversation.countMessagesByUser(user3));
    }
}