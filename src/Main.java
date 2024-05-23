import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String slozka = "C:\\Users\\dpivo\\Documents\\GitHub\\Zadani_2\\geo_coded_DM_jaro_2024.csv";
        List<String[]> data = CteniCSV.CSV(slozka);

        CteniCSV.odebraniCizichZemi(data);
        for (String[] radek : data) {
            for (String hodnota : radek) {
                System.out.print(hodnota + " ");
            }
            System.out.println();
        }
    }
}
