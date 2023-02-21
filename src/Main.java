import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Balance balance = new Balance();
        System.out.print("Эгер балансыңызга каражат кошууну кааласаңыз 1 ди басыңыз\nЭгер алууну кааласаңыз 0 ду басыңыз: ");
        byte num = new Scanner(System.in).nextByte();
        if (num == 1) {
            System.out.print("\nСиздин балансыңыз: " + balance.getBalance() + " сом\nБалансыңызга каражат кошуу үчүн сумманы жазыңыз: ");
            balance.deposit(new IslamBank(new Scanner(System.in).nextDouble()));
        } else {
            System.out.print("\nСиздин балансыңыз: " + balance.getBalance() + " сом\nБалансыңыздан каражат алуу үчүн сумманы жазыңыз: ");
            balance.wirthDraw(new IslamBank(new Scanner(System.in).nextDouble()));
        }
    }
}