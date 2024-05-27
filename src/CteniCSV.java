import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CteniCSV {
    public static List<String[]> nactiCSV(String cesta) {
        List<String[]> data = new ArrayList<>();
        String radek;
        String oddelovac = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(cesta))) {
            while ((radek = br.readLine()) != null) {
                String[] hodnoty = radek.split(oddelovac);
                data.add(hodnoty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}