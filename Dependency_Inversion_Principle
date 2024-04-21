/**
 * An interface for sending messages.
 */
interface MessageSender {
    /**
     * Sends a message using the implemented medium (e.g., email, SMS).
     * 
     * @param message The message content to be sent.
     */
    void sendMessage(String message); 
}

/**
 * A class representing an email sender, implementing the MessageSender interface.
 */
class EmailSender implements MessageSender {
    /**
     * Sends an email message.
     * 
     * @param message The message content to be sent via email.
     */
    @Override
    public void sendMessage(String message) {
        // Code to send message via email
        System.out.println("Sending email: " + message); // Print message for email sending
    }
}

/**
 * A class representing an SMS sender, implementing the MessageSender interface.
 */
class SMSSender implements MessageSender {
    /**
     * Sends an SMS message.
     * 
     * @param message The message content to be sent via SMS.
     */
    @Override
    public void sendMessage(String message) {
        // Code to send message via SMS
        System.out.println("Sending SMS: " + message); // Print message for SMS sending
    }
}

/**
 * A high-level module for sending notifications using a MessageSender.
 */
class MessageService {
    private MessageSender messageSender; // Private field to hold a MessageSender

    /**
     * Constructs a MessageService with a specific MessageSender implementation.
     * 
     * @param messageSender The MessageSender implementation to be used for sending messages.
     */
    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender; // Constructor to inject a MessageSender
    }

    /**
     * Sends a notification using the injected MessageSender.
     * 
     * @param notification The notification content to be sent.
     */
    public void sendNotification(String notification) {
        // Business logic of sending a notification
        messageSender.sendMessage(notification); // Delegates message sending to MessageSender
    }
}

/**
 * A sample class to demonstrate Dependency Inversion Principle (DIP) usage.
 */
public class DIP {
    /**
     * The main method to run the DIP example.
     * 
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an EmailSender instance
        MessageSender emailSender = new EmailSender();
        // Create a MessageService instance with EmailSender injected
        MessageService emailService = new MessageService(emailSender);
        // Send an email notification using the MessageService
        emailService.sendNotification("This is an email notification");

        // Create an SMSSender instance
        MessageSender smsSender = new SMSSender();
        // Create a MessageService instance with SMSSender injected
        MessageService smsService = new MessageService(smsSender);
        // Send an SMS notification using the MessageService
        smsService.sendNotification("This is an SMS notification");
    }
}
/**
 * The Dependency Inversion Principle (DIP) states that high-level modules should
 * not depend on low-level modules, but both should depend on abstractions.
 * 
 * In this code:
 * - The MessageSender interface defines a contract for sending messages, allowing
 * for different message sending implementations.
 * - EmailSender and SMSSender are low-level modules that implement the MessageSender
 *  interface, focusing on specific message sending methods.
 * - MessageService, the high-level module, depends on the MessageSender interface
 *  rather than specific implementations. Thus this code adheres to DIP.
 */
