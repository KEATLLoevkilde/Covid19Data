package coviddata;

public class Covid19Data {
    private String region;
    private String aldersKlasse;
    private int tilfælde;
    private int døde;
    private int indlagtPåIntensiv;
    private int indlagtTotal;

    public Covid19Data(String region, String aldersKlasse, int tilfælde, int døde, int indlagtPåIntensiv, int indlagtTotal) {
        this.region = region;
        this.aldersKlasse = aldersKlasse;
        this.tilfælde = tilfælde;
        this.døde = døde;
        this.indlagtPåIntensiv = indlagtPåIntensiv;
        this.indlagtTotal = indlagtTotal;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersKlasse() {
        return aldersKlasse;
    }

    public int getTilfælde() {
        return tilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtPåIntensiv() {
        return indlagtPåIntensiv;
    }

    public int getIndlagtTotal() {
        return indlagtTotal;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        text.append("Region: " + region + "\n");
        text.append("AlderKlasse: " + aldersKlasse + "\n");
        text.append("Tilfælde: " + tilfælde + "\n");
        text.append("Døde: " + døde + "\n");
        text.append("Indlagt på intensiv: " + indlagtPåIntensiv + "\n");
        text.append("Indlagt total: " + indlagtTotal + "\n");
        return text.toString();
    }
}
