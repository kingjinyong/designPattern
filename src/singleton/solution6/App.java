package singleton.solution6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings setting = Settings.INSTANCE;

        Settings setting1 = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(setting);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            setting1 = (Settings) in.readObject();
        }
        System.out.println(setting == setting1);
    }
}
