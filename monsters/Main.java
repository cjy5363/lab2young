package monsters;

/**
 * Project: Lab 2 Monsters
 *  Course: IST 242
 *  Author: Caiden Young
 * Description: 5 monsters all their characteristics.
 * Last Date Changed: Sunday Feb 9th, 2026
 **/

public class Main {
    public static void main(String[] args) {

        // Monster 1: Cyclops
        Cyclops monster1 = new Cyclops("Globble", SizeType.LARGE);
        monster1.setHealth(120);
        monster1.setLevel(5);
        monster1.setSpecialPower(SpecialPower.FIRE);
        monster1.setEyePower(50);
        monster1.specialPowers();

        // Monster 2: Cyclops
        Cyclops monster2 = new Cyclops("Teeki", SizeType.SMALL);
        monster2.setHealth(80);
        monster2.setLevel(3);
        monster2.setSpecialPower(SpecialPower.ICE);
        monster2.setEyePower(30);
        monster2.specialPowers();

        // Monster 3: Kraken
        Kraken monster3 = new Kraken("Morot", SizeType.LARGE);
        monster3.setHealth(150);
        monster3.setLevel(6);
        monster3.setSpecialPower(SpecialPower.POISON);
        monster3.setTentacleLength(40);
        monster3.specialPowers();

        // Monster 4: Minotaur
        Minotaur monster4 = new Minotaur("Loo", SizeType.MEDIUM);
        monster4.setHealth(130);
        monster4.setLevel(5);
        monster4.setSpecialPower(SpecialPower.LIGHTNING);
        monster4.setHornStrength(35);
        monster4.specialPowers();

        //Monster 5: Kraken
        Kraken monster5 = new Kraken("Winngle", SizeType.SMALL);
        monster5.setHealth(90);
        monster5.setLevel(2);
        monster5.setSpecialPower(SpecialPower.SHADOW);
        monster5.setTentacleLength(25);
        monster5.specialPowers();

        //Print all monster info using getters

        System.out.println("Name: " + monster1.getName());
        System.out.println("Size: " + monster1.getSizeType());
        System.out.println("Health: " + monster1.getHealth());
        System.out.println("Level: " + monster1.getLevel());
        System.out.println("Special Power: " + monster1.getSpecialPower());
        System.out.println("Eye Power: " + monster1.getEyePower());
        System.out.println();

        System.out.println("Name: " + monster2.getName());
        System.out.println("Size: " + monster2.getSizeType());
        System.out.println("Health: " + monster2.getHealth());
        System.out.println("Level: " + monster2.getLevel());
        System.out.println("Special Power: " + monster2.getSpecialPower());
        System.out.println("Eye Power: " + monster2.getEyePower());
        System.out.println();

        System.out.println("Name: " + monster3.getName());
        System.out.println("Size: " + monster3.getSizeType());
        System.out.println("Health: " + monster3.getHealth());
        System.out.println("Level: " + monster3.getLevel());
        System.out.println("Special Power: " + monster3.getSpecialPower());
        System.out.println("Tentacle Length: " + monster3.getTentacleLength());
        System.out.println();

        System.out.println("Name: " + monster4.getName());
        System.out.println("Size: " + monster4.getSizeType());
        System.out.println("Health: " + monster4.getHealth());
        System.out.println("Level: " + monster4.getLevel());
        System.out.println("Special Power: " + monster4.getSpecialPower());
        System.out.println("Horn Strength: " + monster4.getHornStrength());
        System.out.println();

        System.out.println("Name: " + monster5.getName());
        System.out.println("Size: " + monster5.getSizeType());
        System.out.println("Health: " + monster5.getHealth());
        System.out.println("Level: " + monster5.getLevel());
        System.out.println("Special Power: " + monster5.getSpecialPower());
        System.out.println("Tentacle Length: " + monster5.getTentacleLength());
        System.out.println();
    }
}
