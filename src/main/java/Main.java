import comparatorer.AldersGruppeComparator;
import comparatorer.RegionComparator;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println(database);

        Collections.sort(database.getDataSet(), new RegionComparator());
        System.out.println(database);

        Collections.sort(database.getDataSet(), new AldersGruppeComparator());
        System.out.println(database);
    }
}
