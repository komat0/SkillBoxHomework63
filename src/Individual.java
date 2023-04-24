public class Individual extends Client {

    double amount;

    @Override
    public void getAccountInfo() {
        System.out.println("""
                Счёт 'Индивидуальный'. Условия:
                Пополнение: Без комиссий.
                Снятие: Без комиссий.""");
    }

    @Override
    public void addMoney(double addAmount) {
        amount += addAmount;
        System.out.printf("Индивидуальный счет пополнен на %s. Сумма на счете: %s%n", addAmount, amount);
    }

    @Override
    public void withdrawMoney(double withdrawMoney) {
        if (amount >= withdrawMoney) {
            amount -= withdrawMoney;
            System.out.printf("Снятие средств с индивидуального счета на сумму: %s." +
                              "\nТеперь на счету %s%n", withdrawMoney, amount);
        } else {
            System.out.println("Недостаточно средст на счете");
        }
    }
}
