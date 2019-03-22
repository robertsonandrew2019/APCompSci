public class Priest extends PlayerCharacter implements Healer {
    int charisma;

    Priest(String newName) {
        name = newName;
        strength = 7 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 8 + Die.roll();
        charisma = 10 + Die.roll();
        maxHitPoints = hitPoints = (strength);
        maxMana = mana = intelligence + (2 * charisma);
        System.out.printf("A new priest, %s, has been created!\n", name);
    }

    public void stats() {
        System.out.printf("%s | Strength: %d | Intelligence: %d | Charisma: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, charisma, hitPoints, maxHitPoints, mana, maxMana);
    }

    public boolean LifeCheck() {
        if (hitPoints > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }
}
