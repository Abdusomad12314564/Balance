public class Balance {
    private double balance = 1000;
    private IslamBank islamBank;

    public IslamBank getIslamBank() {
        return islamBank;
    }

    public void setIslamBank(IslamBank islamBank) {
        this.islamBank = islamBank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(IslamBank islamBank) {
        balance += islamBank.getSumma();
        System.out.println("\nБалансыңызды ИсламБанк " + islamBank.getSumma() + " сомго толуктады\nЖалпы сумма: " + balance + " сом");
         System.out.println("Ислам банкта "+(Ушул жердин логикасын чыгара албайтам, банктагы акча азайыш керек)+" акча калды");
    }

    public void wirthDraw(IslamBank islamBank) {
        balance -= islamBank.getSumma();
        System.out.println("\nБалансыңыздан " + islamBank.getSumma() + " сом алынды\nКалган сумма: " + balance + " сом");
        System.out.println("Ислам банктын балансы "+(Бул жерде банктагы акча кобойуш керек)+" акчага көбөйдү"); //калганы иштеп атат ушул эки жер чыкпай атат
        if (balance == 0) {
            System.out.println("Балансыңыз түгөндү!");
        }
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balance=" + balance +
                ", islamBank=" + islamBank +
                '}';
    }
}
