public class Fighter extends PlayerCharacter implements Tank {
    int constitution;

    Fighter(String newName) {
        name = newName;
        strength = 15 + Die.roll();
        intelligence = 7 + Die.roll();
        agility = 8 + Die.roll();
        constitution = 10 + Die.roll();
        maxHitPoints = hitPoints = (2 * strength) + (2 * constitution);
        maxMana = mana = 0;
        System.out.printf("A new fighter, %s, has been created!\n", name);
    }

    public void stats() {
        System.out.printf("%s | Strength: %d | Intelligence: %d | Agility: %d | Constitution: %d | Hit Points: %d / %d | Mana: %d / %d\n", name, strength, intelligence, agility, constitution, hitPoints, maxHitPoints, mana, maxMana);
    }

    public boolean LifeCheck() {
        if (hitPoints > 0) lifeCheck = true;
        else lifeCheck = false;
        return lifeCheck;
    }
}
