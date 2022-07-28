package academy.mindswap.sims.exceptions;

public class MustPayForHouseKeeperException extends HouseException{
    public MustPayForHouseKeeperException() {
        super("You must pay before I can clean the House");
    }
}
