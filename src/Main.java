import java.util.zip.DeflaterOutputStream;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98; //килограмм
        double heightIntMeters = 1.87; //метров
        double index = service.calculate((int) weightKg, heightIntMeters);

        System.out.println(index);

    }
}