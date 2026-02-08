package monsters;

public class Kraken extends Monster {

    // Subclass-specific field
    private int tentacleLength;

    public Kraken(String name, SizeType size) {
        super(name, size);
    }

    public int getTentacleLength() {
        return tentacleLength;
    }

    public void setTentacleLength(int tentacleLength) {
        this.tentacleLength = tentacleLength;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " attacks with massive tentacles using " + getSpecialPower());
    }
}
