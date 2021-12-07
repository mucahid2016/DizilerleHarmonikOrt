public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5,6};

        double sum = 0.0;
        for (double i : list) {
            sum += i / i;
        }

        double harmonikOrt = list.length / sum;
        System.out.println("Harmonik Ortalama : "+harmonikOrt);
    }
}
