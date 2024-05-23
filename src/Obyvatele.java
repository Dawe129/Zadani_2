import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Obyvatele {
    public static List<String[]> ObyvateleCSV(String csvObyvatel) {
        List<String[]> obyvatele = new ArrayList<>();
        String radek;
        String oddelovac = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvObyvatel))) {
            while ((radek = br.readLine()) != null) {
                String[] hodnoty = radek.split(oddelovac);
                obyvatele.add(hodnoty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obyvatele;
    }
}
