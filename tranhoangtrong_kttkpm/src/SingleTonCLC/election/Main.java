package SingleTonCLC.election;

public class Main {
    public static void main(String[] args) {
        Election election = Election.getInstance();

        User user1 = new User("Not Biden");
        user1.vote(election, Candidate.BIDEN);
        user1.vote(election, Candidate.BIDEN);

        System.out.println("Joe Biden vote counts: "+election.getBidenVotes());
    }
}
