package monsters;

public class Cyclops extends Monster {

    private String EyeballSize; // small, medium, large

    public String getEyeballSize() { return EyeballSize; }
    public void setEyeballSize(String EyeballSize) { this.EyeballSize = EyeballSize; }

    @Override
    public void specialPowers() {
        System.out.println(getName());
    }
}
