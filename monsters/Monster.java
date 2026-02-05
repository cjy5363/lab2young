package monsters;

public abstract class Monster {
    //class variables
    private String name;
    private SpecialPower specialPower;

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public SpecialPower getSpecialPower() { return specialPower; }
    public void setSpecialPower(SpecialPower specialPower) { this.specialPower = specialPower; }

    // abstract behavior
    public abstract void specialPowers();
}
