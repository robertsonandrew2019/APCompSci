public class Mage extends PlayerCharacter implements Range {
    int wisdom;

    Mage (String newName) {
        name = newName;
        strength = 7 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 8 + Die.roll();
        wisdom = 10 + Die.roll();
        maxHitPoints = hitPoints = strength;
        maxMana = mana = intelligence + (2 * wisdom);
        System.out.printf("A new Mage, %s, has been created!\n", name);
    }

    public void stats() {
        System.out.printf("%s | Strength: %d | Intelligence: %d | Agility: %d | Wisdom: %d | Hit Points: %d / %d | Mana: %d / %d\n\n", name, strength, intelligence, agility, wisdom, hitPoints, maxHitPoints, mana, maxMana);
    }
}
