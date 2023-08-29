import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineVotingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate(1, "Candidate A"));
        candidates.add(new Candidate(2, "Candidate B"));
        candidates.add(new Candidate(3, "Candidate C"));

        Election election = new Election(candidates);

        while (true) {
            System.out.println("Available candidates:");
            for (Candidate candidate : candidates) {
                System.out.println(candidate.getId() + ". " + candidate.getName());
            }

            System.out.print("Enter the candidate ID you want to vote for (or -1 to exit): ");
            int candidateId = scanner.nextInt();

            if (candidateId == -1) {
                break;
            }

            election.vote(candidateId - 1);
            System.out.println("Vote cast for " + candidates.get(candidateId - 1).getName());
        }

        election.displayResults();

        scanner.close();
    }
}
