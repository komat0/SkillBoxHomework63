public class Main {
    public static void main(String[] args) {

        Client clientAccount = new LegalEntity();
        clientAccount.getAccountInfo();
        clientAccount.addMoney(900);
        clientAccount.addMoney(1000);
        clientAccount.withdrawMoney(100);
        clientAccount.withdrawMoney(1887);
    }
}