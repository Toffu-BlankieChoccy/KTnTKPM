package SingleTonCLC.election;

public class User {
    private String name;
    private boolean voted = false;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void vote(Election election, Candidate candidate)
    {
        election.vote(this,candidate);
        voted=true;
    }

}
