public class BonusRuble {
    public static void main(String[] args) {
        int balance = 100; //first balance
        int balanceNew = 500; //money for balance
        if (balanceNew > 1000) {
            int bonus = balance + balanceNew + balanceNew / 100; //bonus
            System.out.println(bonus);
        } else {
            int bonus = balance + balanceNew;
            System.out.println(bonus);
        }
    }
}

