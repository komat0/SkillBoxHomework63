public class Main {
    public static void main(String[] args) {

        Client clientAccount = new LegalEntity(100);
        clientAccount.getAccountInfo();
        clientAccount.addMoney(900);
//        clientAccount.addMoney(1000);
//        clientAccount.withdrawMoney(100);
//        clientAccount.withdrawMoney(1887);

        Entrepreneur entrepreneurAccount = new Entrepreneur(200);
        entrepreneurAccount.getAccountInfo();
        entrepreneurAccount.addMoney(900);
        entrepreneurAccount.withdrawMoney(1000);
    }
}