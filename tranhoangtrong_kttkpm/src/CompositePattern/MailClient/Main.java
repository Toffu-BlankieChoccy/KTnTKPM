package CompositePattern.MailClient;

public class Main {
    public static void main(String[] args) {
        Group g1 = new Group("Team 1");
        Group g2 = new Group("Team 2");
        Group g3 = new Group("Team 3");

        IMailClient Peter = new Profile("Peter","room1","trnhoangtrong@gmail.com","123123123123");
        IMailClient Flynn = new Profile("Flynn","room2","flynn@gmail.com","222222");
        IMailClient Isabeu = new Profile("Isabeu","room3","isabeu@gmail.com","32341");
        IMailClient Peter1 = new Profile("Peter1","room1","trnhoangtrong@gmail.com","123123123123");
        IMailClient Flynn1 = new Profile("Flynn1","room2","flynn@gmail.com","222222");
        IMailClient Isabeu1 = new Profile("Isabeu1","room3","isabeu@gmail.com","32341");
        IMailClient Peter2 = new Profile("Peter2","room1","trnhoangtrong@gmail.com","123123123123");
        IMailClient Flynn2 = new Profile("Flynn2","room2","flynn@gmail.com","222222");
        IMailClient Isabeu2 = new Profile("Isabeu2","room3","isabeu@gmail.com","32341");

        g1.addMember(Peter);
        g1.addMember(Flynn);
        g1.addMember(Isabeu);
        g2.addMember(Peter1);
        g2.addMember(Flynn1);
        g2.addMember(Isabeu1);
        g3.addMember(Peter2);
        g3.addMember(Flynn2);
        g3.addMember(Isabeu2);

        g1.sendMail("Cum");
        Peter.sendMail("fuck");
    }
}
