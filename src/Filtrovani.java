import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Filtrovani {

    public static void odebraniCizichZemi(List<String[]> data, String zeme) {
        Iterator<String[]> iterator = data.iterator();

        while (iterator.hasNext()) {
            String[] radek = iterator.next();
            boolean obsahujeZemi = false;

            for (String hodnota : radek) {
                if (hodnota.contains(zeme)) {
                    obsahujeZemi = true;
                    break;
                }
            }

            if (!obsahujeZemi) {
                iterator.remove();
            }
        }
    }

    public static List<String[]> filtrovatData(List<String[]> data, String zeme, String firma) {
        List<String[]> filtrovaneData = new ArrayList<>();
        for (String[] radek : data) {
            boolean vyhovujeZeme = false;
            boolean vyhovujeFirma = (firma == null || firma.isEmpty());

            for (String hodnota : radek) {
                if (hodnota.contains(zeme)) {
                    vyhovujeZeme = true;
                }
                if (vyhovujeZeme && hodnota.contains(firma)) {
                    vyhovujeFirma = true;
                    break;
                }
            }

            if (vyhovujeZeme && vyhovujeFirma) {
                filtrovaneData.add(radek);
            }
        }
        return filtrovaneData;
    }
}