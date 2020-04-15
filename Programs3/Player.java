public class Player {
    private String name = "";
    private int score = 0;
    public void setName(String text) {
        name = text;
    }
    public void setScore(int number) {
        score = number;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}