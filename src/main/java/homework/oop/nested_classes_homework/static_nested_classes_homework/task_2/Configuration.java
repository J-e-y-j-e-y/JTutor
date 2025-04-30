package homework.oop.nested_classes_homework.static_nested_classes_homework.task_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Configuration {
    enum ConfigParamType {
        STRING,
        INTEGER,
        BOOLEAN
    }

    static class ConfigParameter {
        String name;
        Object value;
        ConfigParamType type;

        @Override
        public String toString() {
            return "ConfigParameter{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    ", type=" + type +
                    '}';
        }
    }

    static class ConfigLoader {
        static List<ConfigParameter> load(String filename) throws IOException {
            List<String> lines = Files.readAllLines(
                    Paths.get(filename), UTF_8);

            List<ConfigParameter> list = new ArrayList<>();

            for (String str : lines) {
                ConfigParameter cp = new ConfigParameter();

                String[] s = str.split("=");
                cp.name = s[0];

                cp.value = s[1];
                cp.type = ConfigParamType.STRING;

                int i;

                try {
                    i = Integer.parseInt(s[1]);
                    cp.value = i;
                    cp.type = ConfigParamType.INTEGER;
                } catch (Exception e) {
                    System.out.println();
                }

                if ("true".equals(s[1]) || "false".equals(s[1]) ) {
                    cp.value = s[1];
                    cp.type = ConfigParamType.BOOLEAN;
                }

                list.add(cp);
            }

            return list;
        }
    }
}
