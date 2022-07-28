package academy.mindswap.sims.exceptions;

public class TheHouseIsCleanException extends HouseException{
    public TheHouseIsCleanException() {
        super("The House is already clean, call me when is dirty");
    }
}
