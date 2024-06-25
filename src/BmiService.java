public class BmiService {
    public int calculate(double meters, double kilograms) {
        int index = (int) (kilograms / (meters * meters));
        return index;
    }
}
