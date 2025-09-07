class Bank {
    private void showBalance() {
        System.out.println("Balance is confidential");
    }

    void accessBalance() {
        System.out.println("Accessing balance through public method...");
        showBalance();
    }
}

public class MakingMethodPrivate {
    public static void main(String[] args) {
        Bank b = new Bank();
        // b.showBalance(); // ❌ Not allowed, private method
        b.accessBalance();   // ✅ Allowed via public method
    }
}
