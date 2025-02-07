package lessons.oop.work_with_string_examples.ex3_read_csv_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CSVReader {
    String path = "src/main/java/lessons/oop/work_with_string_examples/ex3_read_csv_file/example.csv";

    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        List<String> tokens = reader.getTokensFromFile(reader.path, "|");
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public List<String> getTokensFromFile(String path, String delim) {
        List<String> tokens = new ArrayList<>();
        String currLine = "";
        StringTokenizer tokenizer;
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            while ((currLine = br.readLine()) != null) {
                tokenizer = new StringTokenizer(currLine, delim);
                while (tokenizer.hasMoreElements()) {
                    tokens.add(tokenizer.nextToken());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tokens;
    }
}
