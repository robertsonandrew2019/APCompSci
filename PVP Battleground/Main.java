import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PlayerCharacter> CharInventory = new ArrayList<PlayerCharacter>();

        Fighter chunLi = new Fighter("Chun-Li");
        CharInventory.add(chunLi);

        Mage tFue = new Mage("Tfue");
        CharInventory.add(tFue);

        Paladin prometheus = new Paladin("Prometheus");
        CharInventory.add(prometheus);

        Party andrew = new Party("Andrew", chunLi, prometheus, tFue);

        ArrayList<Spell> spellBook = new ArrayList<Spell>();
        spellBook.add(new Spell(10, 17, 20, 15, true, "Freeze"));

        ArrayList<Weapon> armory = new ArrayList<Weapon>();
        armory.add(new Weapon(3, 1, 6, false, "Dagger"));
    }


//protected chain ends with access: 'final'

}
