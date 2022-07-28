package academy.mindswap.sims.exceptions;

public class NoEnergyException extends HouseException{
    public NoEnergyException() {
        super("Too tired, must take a nap before perform any action");
    }
}
