import comparatorer.AldersGruppeComparator;
import comparatorer.RegionComparator;

import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    Database db = new Database();
    public  void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Vælg sorteringmetode:
                    1. Region
                    2. Aldersgruppe
                    3. Exit
                    """);
            int userChoise = sc.nextInt();
            switch (userChoise) {
                case 1 -> Collections.sort(db.getDataSet(), new RegionComparator());
                case 2 -> Collections.sort(db.getDataSet(), new AldersGruppeComparator());
                case 3 -> System.exit(0);
            }
            System.out.println(db);
        }

    }
}
