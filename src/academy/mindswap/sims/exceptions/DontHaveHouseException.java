package academy.mindswap.sims.exceptions;

public class DontHaveHouseException extends HouseException{
    public DontHaveHouseException() {
        super("Please buy a house first...");
    }
}
