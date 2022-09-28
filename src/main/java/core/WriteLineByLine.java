package core;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class WriteLineByLine {

    public static void writeDataLineByLine(String filePath, List<String> data  ){
        File file = new File(filePath);

        try{
            FileWriter outputFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputFile);


            for(String line : data){
                writer.writeNext(new String[]{line});
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}