package Homework1_10;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileHandler {
    private String filePath;

    public FileHandler(String file_put) {
        this.filePath = file_put;
    }

    public String[] readLines() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder izmen = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            izmen.append(line).append("\n");
        }
        reader.close();
        return izmen.toString().split("\n");
    }

}
