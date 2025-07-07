package abstractfactory.after;

import abstractfactory.before.WhiteAnchor;
import abstractfactory.before.WhiteWheel;
import factorymethod.after.DefaultShipFactory;
import factorymethod.after.Ship;
import factorymethod.after.WhiteShipFactory;
import factorymethod.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsfactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsfactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsfactory.createAnchor());
        ship.setWheel(shipPartsfactory.createWheel());
        return ship;
    }
}
