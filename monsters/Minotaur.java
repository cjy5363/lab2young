package monsters;

public class Minotaur extends Monster {

    private String HornSize; // small, medium, large

    public String getHornSize() { return HornSize; }
    public void setHornSize(String HornSize) { this.HornSize = HornSize; }

    @Override
    public void specialPowers() {
        System.out.println(getName());
    }
}
