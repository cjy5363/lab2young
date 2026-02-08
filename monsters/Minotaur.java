package monsters;

public class Minotaur extends Monster {

    // Subclass-specific field
    private int hornStrength;

    public Minotaur(String name, SizeType size) {
        super(name, size);
    }

    public int getHornStrength() {
        return hornStrength;
    }

    public void setHornStrength(int hornStrength) {
        this.hornStrength = hornStrength;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " charges with unstoppable strength using " + getSpecialPower());
    }
}
