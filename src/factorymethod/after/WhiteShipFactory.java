package factorymethod.after;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
