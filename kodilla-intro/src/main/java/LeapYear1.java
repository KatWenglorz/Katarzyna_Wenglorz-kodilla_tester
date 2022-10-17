public class LeapYear1 {
    public static void main(String[] args) {

        int year = 2022;

        if ((year%400 == 0) || (year%4 == 0 && year%100 > 0)) {
            System.out.println(year + " jest rokiem przestępnym.");
        } else {
            System.out.println(year + " nie jest rokiem przestępnym.");
        }
    }
}
