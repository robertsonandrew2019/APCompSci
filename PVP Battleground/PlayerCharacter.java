public abstract class PlayerCharacter {
    public String name;
    public int strength, intelligence, agility, maxHitPoints, hitPoints, maxMana, mana;
    private static int count;
    public boolean lifeCheck;

    PlayerCharacter() {
        System.out.println("A new character has been created!");
        count++;
    }

    public void stats() {}

    public boolean LifeCheck() {
        if (hitPoints > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }

    public static int numCharacters() {return count;}
}

