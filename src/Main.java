import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String slozka = "C:\\Users\\Honza\\IdeaProjects\\Zadani_2\\geo_coded_DM_jaro_2024.csv";
        List<String[]> data = CteniCSV.CSV(slozka);

        for (int i = 0; i < data.size(); i++) {
            CteniCSV.odebraniCizichZemi(data, i);
            System.out.println(data);

        }

    }
}
