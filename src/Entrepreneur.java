public class Entrepreneur extends Client {

    private double amount;

    @Override
    public void getAccountInfo() {
        System.out.println("""
                Счёт 'Предпринимательский'. Условия:
                Пополнение:\s
                C комиссией 1%, если сумма меньше 1000 рублей.\s
                С комиссией 0,5%, если сумма больше либо равна 1000 рублей.
                Снятие: Без комиссий.""");
    }

    @Override
    public void addMoney(double addAmount) {
        double onePercent = (addAmount) / 100.0;
        double halfPercent = (addAmount * 0.5) / 100.0;

        if (addAmount < 1000) {
            double addLess = addAmount - onePercent;
            amount += addLess;
            System.out.println("Предпринимательский счет пополнен на " + addLess +
                               ".\nТеперь на счету " + amount);
        } else {
            double addMore = addAmount - halfPercent;
            amount += addMore;
            System.out.println("Предпринимательский счет пополнен на " + addMore +
                               ".\nТеперь на счету " + amount);
        }
    }

    @Override
    public void withdrawMoney(double withdrawMoney) {
        if (amount >= withdrawMoney) {
            amount -= withdrawMoney;
            System.out.println("Снятие средств с предпринимательского счета на сумму: " + withdrawMoney +
                    ".\nТеперь на счету " + amount);
        } else {
            System.out.println("Недостаточно средст на счете");
        }
    }
}
