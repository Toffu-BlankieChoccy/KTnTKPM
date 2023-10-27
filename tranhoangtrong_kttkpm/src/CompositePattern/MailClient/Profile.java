package CompositePattern.MailClient;

public class Profile implements IMailClient {
    private String name, department, email, phoneNumber;

    public Profile(String name, String department, String email, String phoneNumber) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMail(String message) {
        System.out.println("Sending email to " + name + " at " + email + ": " + message);
    }
}
