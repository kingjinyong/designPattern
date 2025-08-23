package strategy.before;

public class BlueLightRedLight {
    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무 궁 화 꽃 이");
        } else if (speed == 2) {
            System.out.println("무궁화꽃이");
        } else {
            System.out.println("mgch");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("p aut seaup ni da");
        } else if (speed == 2) {
            System.out.println("pautseaupnida");
        } else {
            System.out.println("pasd");
        }
    }
}
