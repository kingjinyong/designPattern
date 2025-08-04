package command.before;

public class Button {

    private Game game;

    public Button(Game game) {
        this.game = game;
    }

    public void press() {
        game.start();
    }

    public static void main(String[] args) {
        Button button = new Button(new Game());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
