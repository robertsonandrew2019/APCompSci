public class Weapon {
    private int damage, strength, agility, critical;
    private boolean range;
    String name;

    Weapon(int d, int s, int c, boolean r, String n) {
        int damage = d;
        int critical = c;
        boolean range = r;
        if (r) {agility = s; strength = 0;}
        else {agility = 0; strength = s;}
        String name = n;
    }

}
