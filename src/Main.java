public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        double kilograms = 98;
        int index = service.calculate(meters, kilograms);
        System.out.println(index);
    }
}
