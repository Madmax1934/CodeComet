package Collectionsprgrms;

public class Cricketers implements Comparable<Cricketers>{
    private String player;
    private int score;

    public Cricketers(String player,int score)
    {
        this.player=player;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Cricketers{" +
                "player='" + player + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Cricketers o) {
        return this.score>o.score?1:-1;
    }
}
