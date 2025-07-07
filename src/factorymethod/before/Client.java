package factorymethod.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "jinyong@mail.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "jinyong@mail.com");
        System.out.println(blackship);
    }

}
