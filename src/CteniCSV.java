import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    public static void odebraniCizichZemi(List<String[]> data, int index) throws IOException {
        if (index < 0 || index > data.size()) {
            throw new IOException("Hodnota nemuze byt mimo csv") {
            };
        }

        String[] radek = data.get(index);
        if (radek[12].contains("CZ") && radek[12].contains("SK")){
            System.out.println(radek);
        } else {
            data.remove(radek);
        }
    }
}
