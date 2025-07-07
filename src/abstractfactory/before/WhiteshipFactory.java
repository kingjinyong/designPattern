package abstractfactory.before;

import factorymethod.after.DefaultShipFactory;
import factorymethod.after.Ship;
import factorymethod.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
