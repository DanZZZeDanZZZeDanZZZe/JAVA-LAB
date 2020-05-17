package appfuncs.funcs;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesFuncs {
    public static List<String> ReadFromFile(String fileName){
        return Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

    }

    public static void Sort(String sourceFileName, String resultFileName){
        List<String> drinkList = ReadFromFile(sourceFileName);
        drinkList.sort(String::compareTo);
        WriteToFile(resultFileName, drinkList);
    }

    public static void WriteToFile(String fileName, List<String> drinkList){
        try(FileWriter writer = new FileWriter(fileName, false)) {
            for (int i = 0; i < drinkList.size(); i++) {
                writer.write(drinkList.get(i) + "\n");
            } writer.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}