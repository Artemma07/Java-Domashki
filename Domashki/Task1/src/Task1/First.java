package Task1;

public class First {
    public static void main(String[] args) {
        int[] array = {1, 4, 21, 74, 23, 12};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double srednee = (double) sum / array.length;
        System.out.println("Summa =" + sum);
        System.out.println("srednee =" + srednee);
    }
}
