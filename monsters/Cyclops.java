package monsters;

public class Cyclops extends Monster {

    // Subclass-specific field
    private int eyePower;

    public Cyclops(String name, SizeType size) {
        super(name, size);
    }

    public int getEyePower() {
        return eyePower;
    }

    public void setEyePower(int eyePower) {
        this.eyePower = eyePower;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " fires a powerful beam from its single eye using " + getSpecialPower());
    }
}
