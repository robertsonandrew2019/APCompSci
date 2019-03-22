public class Party {
    protected Tank tank;
    protected Range range;
    protected Healer healer;
    public String teamName;
    protected boolean full;
    protected boolean check;

    Party (String teamName, Tank t, Healer h, Range r) {
        tank = t;
        healer = h;
        range = r;
    }

    public boolean check (PlayerCharacter pc) {
        if (pc.LifeCheck()) check = true;
        else check = false;
        return check;
    }
}

