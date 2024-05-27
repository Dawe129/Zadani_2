import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Zadejte alespoň zemi jako argument.");
            return;
        }


        String zeme = args[0];
        String firma = args.length > 1 ? args[1] : null;

        String cesta = "C:\\Users\\dpivo\\Documents\\GitHub\\Zadani_2\\geo_coded_DM_jaro_2024.csv";
        List<String[]> data = CteniCSV.nactiCSV(cesta);

        Filtrovani.odebraniCizichZemi(data, zeme);

        List<String[]> filtrovaneData = Filtrovani.filtrovatData(data, zeme, firma);

        for (String[] radek : filtrovaneData) {
            for (String hodnota : radek) {
                System.out.print(hodnota + " ");
            }
            System.out.println();
        }
    }
}