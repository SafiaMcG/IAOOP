import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<List<Integer>> scores = new ArrayList<>();

    public void displayScores() {
        System.out.println(name + "'s scores:");
        System.out.println("Easy mode scores: " + scores.get(0));
        System.out.println("Medium mode scores: " + scores.get(1));
        System.out.println("Hard mode scores: " + scores.get(2));
    }

    public void insert(int score, List<Integer> scores) {
        boolean inserted = false;
        if (scores.isEmpty()) {
            scores.add(score);
            return;
        }
        int i = 0;
        while (i < scores.size() && !inserted) {
            if (scores.get(i) > score) {
                ++i;
            } else {
                scores.add(i, score);
                inserted =  true;
            }
        }
        if (!inserted) {
            scores.add(score);
        }
    }

    public void addScore(int score, int mode) {
        insert(score, scores.get(mode));
    }

    public void setName(String name){
        this.name = name;
    }

    public Player() {
        for (int i = 0; i < 3; i++) {
            scores.add(new ArrayList<>());
        }
    }

}

