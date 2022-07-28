package academy.mindswap.sims;

import academy.mindswap.sims.divisions.Division;
import academy.mindswap.sims.exceptions.*;

public class Sim {

    private int energyLevel;
    private House myHouse;
    private boolean didPayTheHouseKeeper;
    private boolean didGoToTheBathroom;


    public Sim() {
        this.energyLevel = 100;
        didPayTheHouseKeeper = false;
        didGoToTheBathroom = true;
    }

    public void buyHouse(House house) throws HouseException {
        if (myHouse != null) {
            throw new AlreadyGotHouseException();
        }
        this.myHouse = house;
    }

    public void performAction() throws HouseException {
        if(myHouse == null) {
            throw new DontHaveHouseException();
        }
        if(checkIfHouseIsTooDirty()) {
            throw new HouseIsTooDirtyException();
        }
        if (getEnergyLevel() <= 0) {
            throw new NoEnergyException();
        }
        if(!didGoToTheBathroom) {
            throw new MustGoToBathroomException();
        }
        myHouse.setCleanlinessLevel(myHouse.getDivisions()[(int) Math.random() * 5].dirtGenerator());
        setEnergyLevel(-20);
        System.out.println(myHouse.getCleanlinessLevel());

    }
    private boolean checkIfHouseIsTooDirty() {
        if (myHouse.getCleanlinessLevel() <= 0) {
            myHouse.setIsTooDirty(true);
            return true;
        }
        return false;
    }

    public void callTheHouseKeeper() throws HouseException{
        if (myHouse.getIsTooDirty() != true) {
            throw new TheHouseIsCleanException();
        }
        if (didPayTheHouseKeeper == false) {
            throw new MustPayForHouseKeeperException();
        }
        myHouse.setIsTooDirty(false);
        myHouse.setCleanlinessLevel(100);
        didPayTheHouseKeeper = false;
    }

    public void payTheHouseKeeper() {
        didPayTheHouseKeeper = true;
    }

    public void eat () throws HouseException{
        if(myHouse == null) {
            throw new DontHaveHouseException();
        }
        if(checkIfHouseIsTooDirty()) {
            throw new HouseIsTooDirtyException();
        }
        didGoToTheBathroom = false;
        myHouse.setCleanlinessLevel(30);
    }

    public void goToTheBathroom() throws HouseException{
        if(myHouse == null) {
            throw new DontHaveHouseException();
        }
        if(checkIfHouseIsTooDirty()) {
            throw new HouseIsTooDirtyException();
        }
        myHouse.setCleanlinessLevel(30);
        didGoToTheBathroom = true;
    }

    public void sleep(int hours) {
        if (hours >= 10) {
            hours = 10;
        }
        int energyGenerated = hours * 10;
        setEnergyLevel(energyGenerated);
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel += energyLevel;
    }



}
