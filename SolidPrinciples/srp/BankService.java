package srp;

public class BankService {
    public long deposit(long amount, String accountNo){
        // deposit amount
        return 0;
    }
    public long withDraw(long amount, String accountNo){
        // withdraw amount
        return 0;
    }

    public static void main(String[] args) {
        /*
        This principle states that "A class should have only one reason to change"
         which means every class should have a single responsibility or single job
         or single purpose. In other words, a class should have only one job or purpose within the software system.
         */

        BankService bankService = new BankService();
        LoanService loanService = new LoanService();
        NotificationService notificationService = new NotificationService();
        PrinterService printerService = new PrinterService();

        bankService.deposit(10,"abc");
        loanService.getLoanInterestInfo("homeLoan");
        notificationService.sendOTP("email");
        printerService.printPassbook();
    }
}
