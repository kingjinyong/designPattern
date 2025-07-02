package singleton.solution2;

public class App {
    public static void main(String[] args) {

        Settings setting = Settings.getInstance();
        Settings setting1 = Settings.getInstance();

        System.out.println(setting == setting1);
    }
}
