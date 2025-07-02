package singleton.solution3;

import java.io.IOException;

public class SettingsException {
    private static final SettingsException INSTANCE;

    static {
        try {
            INSTANCE = new SettingsException();
        } catch (IOException e) {
            throw new RuntimeException("인스턴스 생성 실패!", e);
        }
    }

    private SettingsException() throws IOException {}

    public static SettingsException getInstance(){
        return INSTANCE;
    }
}
