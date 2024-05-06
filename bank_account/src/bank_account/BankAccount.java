package bank_account;

public class BankAccount {
    
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[43m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String RESET = "\033[0m";  // Text Reset 
    
    private  String name="";
    private int accountNo, balance;
    private static int totalBalance, totalAccountNumber, countDepositingMoney, countWithdrawingMoney;
    
    public BankAccount(String name,int accountNo,int balance) {
        this.name=name;
        this.accountNo = accountNo;
        this.balance = balance;
        totalBalance+=balance;
        totalAccountNumber++;
    }
    
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getAccountNo() {
        return accountNo;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    
    
    
   public void depositingMoney(int balance){
       this.balance += balance;
       totalBalance += balance;
       countDepositingMoney++;
   }
        
    public void withdrawingMoney(int balance){
        
        if(this.balance>=balance){
            this.balance -= balance;
            totalBalance -= balance;       
            countWithdrawingMoney++;    
        }
        else 
            System.out.println(BankAccount.ANSI_RED+"ParaCekme islemi basarisiz!!!\n"
                    +BankAccount.ANSI_RED+"Hesabinizda yeterli bakiye bulunmamaktadir! ***BAKIYENIZ: "+this.balance);
    }
    
    
    public void compareAccountBalances(BankAccount accountToCompare){
    
        System.out.println("");
        System.out.println(BankAccount.ANSI_WHITE + BankAccount.ANSI_BLUE_BACKGROUND+"                      -_-_-_-___Account Comparison___-_-_-_-                                                      ");
        
        if(this.balance>accountToCompare.balance)
            System.out.println(BankAccount.ANSI_BLACK + BankAccount.ANSI_GREEN_BACKGROUND+"•"+this.getName()+" isimli hesap(bakiye:"+this.balance+"TL) ile , "+accountToCompare.getName()+" isimli hesaptan(bakiye:"+accountToCompare.balance+"TL) 'den daha fazla bakiyeye sahiptir");
        else if(this.getBalance() == accountToCompare.getBalance())
            System.out.println(BankAccount.ANSI_BLACK+BankAccount.ANSI_GREEN_BACKGROUND+"•"+accountToCompare.getName()+" isimli hesap(bakiye:"+accountToCompare.balance+"TL) ile , "+this.getName()+" isimli hesap(bakiye:"+this.balance+"TL) 'in BAKIYELERI ESITTIR");
        else
            System.out.println(BankAccount.ANSI_BLACK+BankAccount.ANSI_GREEN_BACKGROUND+"•"+accountToCompare.getName()+" isimli hesap"+accountToCompare.balance+"[TL(bakiye)] ile , "+this.getName()+" isimli hesaptan(bakiye:"+this.balance+"TL) 'den daha fazla bakiyeye sahiptir");
    }
    
    
    public void personelAccountAbstract(){
    
        System.out.println("-------------------------------------------------------");
        System.out.println(BankAccount.ANSI_WHITE+BankAccount.ANSI_BLUE_BACKGROUND+"     |||_____/*/*/Personal Information/*/*/_____|||  "+BankAccount.RESET);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"*Name :                                        "+this.getName());
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Hesap numarasi :                             "+accountNo);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Bakiye :                                       "+this.balance);
    }
    
    public static void bankAccountAbstract(){
    
        System.out.println("-------------------------------------------------------");
        System.out.println(BankAccount.ANSI_WHITE+BankAccount.ANSI_BLUE_BACKGROUND+"    |||_____/*/*/OZTURK&BANK/*/*/_____|||           "+BankAccount.RESET);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Bankadaki toplam kayitli hesap sayisi:          "+totalAccountNumber);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Banka hesaplarindaki toplam para miktari:     "+totalBalance);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Banka hesaplarina toplam para yatirma islemi:   "+countDepositingMoney);
        System.out.println(BankAccount.ANSI_GREEN_BACKGROUND+"**Banka hesaplarindan toplam para cekme islemi:   "+countWithdrawingMoney);
    
    }
}
