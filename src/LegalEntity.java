public class LegalEntity extends Client {

    double amount;

    @Override
    public void getAccountInfo() {
        System.out.println("""
                Счёт 'Юридическое лицо'. Условия:
                Пополнение: Без комиссий.
                Снятие: Комиссия 1%""");
    }

    @Override
    public void addMoney(double addAmount) {
        amount += addAmount;
        System.out.println("Предпринимательский счет пополнен на " + addAmount + ".\nТеперь на счету " + amount);
    }

    @Override
    public void withdrawMoney(double withdrawMoney) {
        double onePercent = (withdrawMoney) / 100.0;
        double withdrawWithPercent = withdrawMoney + onePercent;

        if (amount >= withdrawWithPercent) {
            amount -= withdrawWithPercent;
            System.out.printf("Снятие средств со счета юридического лица на сумму: %s." + "\nТеперь на счету %s%n", withdrawWithPercent, amount);
        } else {
            System.out.println("Недостаточно средст на счете");
        }
    }
}
