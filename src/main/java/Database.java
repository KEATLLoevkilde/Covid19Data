import java.util.ArrayList;

public class Database {
    private FileHandler fileHandler;
    private ArrayList<Covid19Data> dataSet;

    public Database() {
        fileHandler = new FileHandler();
        dataSet = fileHandler.hentData();

    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Covid19Data c: dataSet) {
            text.append(c + "\n");
        }
        return text.toString();
    }
}
