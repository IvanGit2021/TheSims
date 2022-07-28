package academy.mindswap.sims.exceptions;

public class AlreadyGotHouseException extends HouseException{

    public AlreadyGotHouseException() {
        super("You already got a house, mate");
    }
}
