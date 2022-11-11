import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {

        Random random = new Random();
        int max = 5000;
        int lowestNumber = 31;
        int highestNumber = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            System.out.println(random.nextInt(31));
            if(temp < lowestNumber) {
                lowestNumber = temp;
            }
            if(highestNumber < temp) {
                highestNumber = temp;
            }
            sum = sum + temp;
        }
        System.out.println("Najmniejsza wylosowana liczba to: " + lowestNumber);
        System.out.println("Największa wylosowana liczba to: " + highestNumber);
    }
}