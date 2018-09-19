package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class AbstractTest {
    public Properties prop = new Properties();

    public void ReadFile(String path) throws IOException {
        try {
            FileInputStream fs = new FileInputStream(path); // para leeer un file
            prop.load(fs);
        } catch (IOException e) {
            System.out.println("The file doesnt exist");
        }
    }

    public String ReadProperty(String key) {

        return prop.getProperty(key);
    }
}
