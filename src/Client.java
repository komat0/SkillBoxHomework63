abstract public class Client {
//    У каждого клиента есть сумма денег на счету (число).
//    Деньги можно положить на счёт, снять и вернуть остаток на счёте.
//    Каждый класс должен содержать метод, который выводит информацию в консоль о счёте:
//    условие пополнения, условие снятия и баланс.

    private double amount;

    public void getAmount(){
        System.out.println(amount);
    }
    abstract public void getAccountInfo();

    abstract public void addMoney(double addAmount);

    abstract public void withdrawMoney(double withdrawMoney);
}
