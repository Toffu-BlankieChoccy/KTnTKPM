package SingleTonCLC.election;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private Election(){};
    private int trumpVotes=0, bidenVotes=0;
    private List<User> voters = new ArrayList<>();

    public static Election getInstance() {
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void vote(User user, Candidate candidate){
        if(voters.contains(user))
            return;

        if(candidate == Candidate.TRUMP)
            trumpVotes++;
        else if(candidate == Candidate.BIDEN)
            bidenVotes++;

        voters.add(user);
    }

    public int getTrumpVotes() {
        return trumpVotes;
    }

    public int getBidenVotes() {
        return bidenVotes;
    }
}
