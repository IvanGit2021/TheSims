package academy.mindswap.sims;

import academy.mindswap.sims.divisions.*;

public class House {
    private int cleanlinessLevel;
    private Division[] divisions;

    private boolean isTooDirty;

    public House() {
        cleanlinessLevel = 100;
        divisions = new Division[5];
        isTooDirty = false;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel += cleanlinessLevel;
    }

    public void createDivisions() {
       divisions[0] = new BathRoom();
       divisions[1] = new DiningRoom();
       divisions[2] = new LivingRoom();
       divisions[3] = new OfficeRoom();
       divisions[4] = new SleepRoom();
    }

    public boolean getIsTooDirty() {
        return isTooDirty;
    }

    public void setIsTooDirty(boolean tooDirty) {
        isTooDirty = tooDirty;
    }

    public Division[] getDivisions() {
        return divisions;
    }
}
