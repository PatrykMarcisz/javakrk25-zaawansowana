package zadania.domowe.exceptions.ex3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigReader {

    private static final String CONFIGURATION_PATH = "src/main/resources/configuration/configuration.properties";

    public static void main(String[] args) {
        Map<String, String> config = readConfiguration();
        for (Map.Entry<String, String> property : config.entrySet()) {
            System.out.println(property.getKey() + " : " + property.getValue());
        }
    }

    private static Map<String, String> readConfiguration() {
        try {
            return readPropertiesToMap();
        } catch (IOException e) {
            return createAndReadDefaultConfiguration();
        }
    }

    static Map<String, String> readPropertiesToMap() throws IOException {
        Map<String, String> propertiesMap = new HashMap<>();
        List<String> properties = Files.readAllLines(Paths.get(CONFIGURATION_PATH), Charset.defaultCharset());
        for (String prop : properties) {
            int positionOfFirstEqual = prop.indexOf("=");
            String key = prop.substring(0, positionOfFirstEqual);
            String value = "";
            if (positionOfFirstEqual != prop.length()) {
                value = prop.substring(positionOfFirstEqual + 1);
            }
            propertiesMap.put(key, value);
        }
        return propertiesMap;
    }

    private static Map<String, String> createAndReadDefaultConfiguration() {
        try {
            List<String> defaultConfiguration = new ArrayList<>();
            defaultConfiguration.add("application.system.name".concat("=").concat(System.getProperty("os.name")));
            defaultConfiguration.add("application.user.name".concat("=").concat(System.getProperty("user.name")));
            defaultConfiguration.add("application.user.dir".concat("=").concat(System.getProperty("user.dir")));

            Files.write(Paths.get(CONFIGURATION_PATH), defaultConfiguration, Charset.defaultCharset());
            return readPropertiesToMap();
        } catch (IOException e) {
            throw new RuntimeException("cannot create default configuration file");
        }
    }

}
