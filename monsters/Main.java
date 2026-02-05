package monsters;

public class Main {
    public static void main(String[] args) {

        Monster m1 = new Cyclops();
        m1.setName("Globble");
        m1.setSpecialPower(SpecialPower.LASER);
        ((Cyclops)m1).setEyeballSize("large");

        Monster m2 = new Cyclops();
        m2.setName("Teeki");
        m2.setSpecialPower(SpecialPower.TELEPORT);
        ((Cyclops)m2).setEyeballSize("small");

        Monster m3 = new Kraken();
        m3.setName("Morot");
        m3.setSpecialPower(SpecialPower.STRENGTH);
        ((Kraken)m3).setTentacleLength("long");

        Monster m4 = new Minotaur();
        m4.setName("Loo");
        m4.setSpecialPower(SpecialPower.REGENERATION);
        ((Minotaur)m4).setHornSize("medium");

        Monster m5 = new Kraken();
        m5.setName("Winngle");
        m5.setSpecialPower(SpecialPower.INVISIBILITY);
        ((Kraken)m5).setTentacleLength("short");


        // prints everything using getters

        System.out.println(m1.getName() + " | Power: " + m1.getSpecialPower() +
                " | Eyeball Size: " + ((Cyclops)m1).getEyeballSize());

        System.out.println(m2.getName() + " | Power: " + m2.getSpecialPower() +
                " | Eyeball Size: " + ((Cyclops)m2).getEyeballSize());

        System.out.println(m3.getName() + " | Power: " + m3.getSpecialPower() +
                " | Tentacle Length: " + ((Kraken)m3).getTentacleLength());

        System.out.println(m4.getName() + " | Power: " + m4.getSpecialPower() +
                " | Horn Size: " + ((Minotaur)m4).getHornSize());

        System.out.println(m5.getName() + " | Power: " + m5.getSpecialPower() +
                " | Tentacle Length: " + ((Kraken)m5).getTentacleLength());
    }
}
