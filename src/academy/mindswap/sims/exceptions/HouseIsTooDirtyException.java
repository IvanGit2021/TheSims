package academy.mindswap.sims.exceptions;

public class HouseIsTooDirtyException extends HouseException{
    public HouseIsTooDirtyException() {
        super("Please call the HouseKeeper, the house is too dirty");
    }
}
