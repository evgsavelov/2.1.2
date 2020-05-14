public class BonusRuble {
    public static void main(String[] args) {
        int balance = 100; //first balance
        int balanceNew = 1100; //money for balance
        int bonus = balance + balanceNew + balanceNew / 100; //bonus
        System.out.println(bonus);
    }
}
