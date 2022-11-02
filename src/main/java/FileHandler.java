import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {


    public ArrayList<Covid19Data> hentData(){
        ArrayList<Covid19Data> dataSet = new ArrayList<>();
        File data = new File("11_noegletal_pr_region_pr_aldersgruppeSCRUBBED.csv");
        try
        {
            Scanner sc = new Scanner(data, StandardCharsets.ISO_8859_1);
            while(sc.hasNextLine()){
                String[] dataSplit = sc.nextLine().split(";");
                Covid19Data covid19Data = new Covid19Data(
                        dataSplit[0],
                        dataSplit[1],
                        Integer.parseInt(dataSplit[2]),
                        Integer.parseInt(dataSplit[3]),
                        Integer.parseInt(dataSplit[4]),
                        Integer.parseInt(dataSplit[5])
                );
                dataSet.add(covid19Data);
            }
            return dataSet;

        } catch (IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }


}
