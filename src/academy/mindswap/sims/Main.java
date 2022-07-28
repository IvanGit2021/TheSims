package academy.mindswap.sims;

import academy.mindswap.sims.exceptions.HouseException;

public class Main {
    public static void main(String[] args) {

        House house = new House();
        Sim sim = new Sim();
        house.createDivisions();

        try {
            sim.buyHouse(house);
        } catch (HouseException e) {
            e.printStackTrace();
        }

        try {
            sim.performAction();
        } catch (HouseException e) {
            e.printStackTrace();
        }
        try {
            sim.performAction();
        } catch (HouseException e) {
            e.printStackTrace();
        }

        try {
            sim.eat();
        } catch (HouseException e) {
            e.printStackTrace();
        }
        try {
            sim.goToTheBathroom();
        } catch (HouseException e) {
            e.printStackTrace();
        }
        try {
            sim.performAction();
        } catch (HouseException e) {
            e.printStackTrace();
        }




    }
}
