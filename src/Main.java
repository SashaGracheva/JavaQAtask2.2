public class Main {
    public static void main(String[] args) {
        int accountBefore = 5000;
        int refill = 1550;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int accountAfter = accountBefore + refill + bonus;
        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Счет: " + accountAfter);

    }
}
