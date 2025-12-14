package SolidPrinciples.ocp;

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
        The open-closed principle states that software entities (classes, modules, functions, and so on)
        should be open for extension, but closed for modification.

        You are probably wondering why that statement sounds like a contradiction.
        Like why would something be opened and be closed at the same time?

        Well, in the land of software development, it’s possible for an item to be opened for
        extension and be closed for modification. It means you or your team members should be able to
        add new functionalities to an existing software system without changing the existing code.
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
