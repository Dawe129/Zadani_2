import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CteniCSV {

    public static List<String[]> CSV(String slozka) {
        List<String[]> data = new ArrayList<>();
        String radek;
        String oddelovac = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(slozka))) {
            while ((radek = br.readLine()) != null) {
                String[] hodnoty = radek.split(oddelovac);
                data.add(hodnoty);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void odebraniCizichZemi(List<String[]> data) {
        Iterator<String[]> iterator = data.iterator();

        while (iterator.hasNext()) {
            String[] radek = iterator.next();
            boolean obsahujeCZorSK = false;

            for (String hodnota : radek) {
                if (hodnota.contains("CZ") || hodnota.contains("SK")) {
                    obsahujeCZorSK = true;
                    break;
                }
            }

            if (!obsahujeCZorSK) {
                iterator.remove();
            }
        }
    }
}