public class BmiService {
    public int calculate(int weightKg, double heightIntMeters) {
        return (int) (weightKg / (heightIntMeters * heightIntMeters ));
    }
}
