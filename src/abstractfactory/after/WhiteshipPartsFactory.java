package abstractfactory.after;

import abstractfactory.before.WhiteAnchor;
import abstractfactory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
