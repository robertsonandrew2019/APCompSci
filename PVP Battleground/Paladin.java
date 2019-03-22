public class Paladin extends PlayerCharacter implements Tank, Healer {
    public int wisdom, constitution;

    Paladin(String newName) {
        name = newName;
        strength = 7 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 8 + Die.roll();
        wisdom = 10 + Die.roll();
        constitution = 10 + Die.roll();
        maxHitPoints = hitPoints = (strength) + (2 * constitution);
        maxMana = mana = intelligence + (2 * wisdom);
        System.out.printf("A new priest, %s, has been created!\n", name);
    }

    public void stats() {
        System.out.printf("%s | Strength: %d | Intelligence: %d | Wisdom: %d | Constitution %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, wisdom, constitution, hitPoints, maxHitPoints, mana, maxMana);
    }

    public boolean LifeCheck() {
        if (hitPoints > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }
}
