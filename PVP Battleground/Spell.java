public class Spell {

    private int damage, mana, critical, intelligence;
    boolean frozen;
    String name;

    Spell (int newDamage, int newMana, int newCritical, int newIntelligence, boolean isFrozen, String newName) {
        int damage = newDamage;
        int mana = newMana;
        int critical = newCritical;
        int intelligence = newIntelligence;
        boolean frozen = isFrozen;
        String name = newName;

    }
}
