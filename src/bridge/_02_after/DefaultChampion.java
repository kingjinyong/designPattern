package bridge._02_after;

import bridge._01_before.Champion;

public class DefaultChampion implements Champion {
    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    private Skin skin;

    private String name;
    @Override
    public void move() {
        System.out.printf("%s %s move\n", skin.getName(), this.name);


    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s skillQ\n", skin.getName(), this.name);

    }

    @Override
    public void skillW() {
        System.out.printf("%s %s skillW\n", skin.getName(), this.name);

    }

    @Override
    public void skillE() {
        System.out.printf("%s %s skillE\n", skin.getName(), this.name);

    }

    @Override
    public void skillR() {
        System.out.printf("%s %s skillR\n", skin.getName(), this.name);

    }

    @Override
    public String getName() {
        return null;
    }
}
