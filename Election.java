import java.util.ArrayList;
import java.util.List;

public class Election {
    private List<Candidate> candidates;
    private int[] votes;

    public Election(List<Candidate> candidates) {
        this.candidates = candidates;
        this.votes = new int[candidates.size()];
    }

    public void vote(int candidateId) {
        if (candidateId >= 0 && candidateId < candidates.size()) {
            votes[candidateId]++;
        } else {
            System.out.println("Invalid candidate ID.");
        }
    }

    public void displayResults() {
        System.out.println("Election Results:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(candidates.get(i).getName() + ": " + votes[i] + " votes");
        }
    }
}
