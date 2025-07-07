package factorymethod.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "jinyong@mail.com");
        client.print(new BlackShipFactory(), "blackship", "jinyong@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }

}
