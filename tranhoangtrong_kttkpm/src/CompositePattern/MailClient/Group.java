package CompositePattern.MailClient;

import java.util.ArrayList;
import java.util.List;

public class Group implements IMailClient{
    private String groupName;
    private List<Profile> members = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }


    @Override
    public void sendMail(String message) {
        System.out.println("Sending this mail to "+groupName+" with message: "+message);
        for(IMailClient mem: members){
            mem.sendMail(message);
        }
    }

    public void addMember(IMailClient iMailClient)
    {
        members.remove(iMailClient);

    }
    public void removeMember(IMailClient iMailClient)
    {
        members.remove(iMailClient);
    }
}
