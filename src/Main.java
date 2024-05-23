import java.util.List;

public class Main {
    public static void main(String[] args) {

        String slozka = "C:\\Users\\dpivo\\Documents\\GitHub\\Zadani_2\\geo_coded_DM_jaro_2024.csv";
        List<String[]> data = CteniCSV.CSV(slozka);

        String csvObyvatel = "C:\\Users\\dpivo\\Documents\\GitHub\\Zadani_2\\Obyvatele";
        List<String[]> data1 = Obyvatele.ObyvateleCSV(csvObyvatel);

        /*
        CteniCSV.odebraniCizichZemi(data);
        for (String[] radek : data) {
            for (String hodnota : radek) {
                System.out.print(hodnota + " ");
            }
            System.out.println();
        }
        */

        Obyvatele.ObyvateleCSV(csvObyvatel);
        for (String[] radek : data1) {
            for (String hodnota : radek) {
                System.out.print(hodnota + " ");
            }
            System.out.println();
        }
    }
}
