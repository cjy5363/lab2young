package monsters;

public class Kraken extends Monster {

    private String TentacleLength; // short, medium, long

    public String getTentacleLength() { return TentacleLength; }
    public void setTentacleLength(String TentacleLength) { this.TentacleLength = TentacleLength; }

    @Override
    public void specialPowers() {
        System.out.println(getName());
    }
}
