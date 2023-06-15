package bank_account;	//BANK

public class Main {
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[48m";
    
    public static void main(String[] args) {  
        
    	BankAccount ahmet=new BankAccount(" Ahmet",2001,100);
        ahmet.depositingMoney(70);
        ahmet.withdrawingMoney(20);//150
        ahmet.getAccountNo();
        System.out.println(Main.ANSI_PURPLE_BACKGROUND+"Ahmet Balance: "+ahmet.getBalance()+"TL");
        
        BankAccount mehmet=new BankAccount("Mehmet",1234,180);
        mehmet.depositingMoney(20);
        mehmet.withdrawingMoney(50);//150
        mehmet.withdrawingMoney(100);//50
        System.out.println(Main.ANSI_RED_BACKGROUND+"Mehmet Balance: "+mehmet.getBalance()+"TL");
        
        BankAccount ayse=new BankAccount("  Ayse",1919,500);
        ayse.depositingMoney(300);
        ayse.depositingMoney(200);
        ayse.withdrawingMoney(950);
        System.out.println(Main.ANSI_GREEN_BACKGROUND+"Ayse Balance: "+ayse.getBalance()+"TL");    
        
        
        BankAccount zeynep=new BankAccount("Zeynep",1210,200);
        System.out.println(Main.ANSI_CYAN_BACKGROUND+"Zeynep Balance: "+zeynep.getBalance()+"TL");
        zeynep.withdrawingMoney(100);
        zeynep.withdrawingMoney(50);
        zeynep.depositingMoney(50);
        zeynep.depositingMoney(500); 
        zeynep.depositingMoney(400);
        
        BankAccount ramazan = new BankAccount("Ramazan",2032,1000);
        System.out.println(Main.ANSI_WHITE_BACKGROUND+"Ramazan Balance: "+ramazan.getBalance()+"TL");
        
        mehmet.personelAccountAbstract();
        ahmet.personelAccountAbstract();
        ayse.personelAccountAbstract();
        zeynep.personelAccountAbstract();
        ramazan.personelAccountAbstract();
        
        BankAccount.bankAccountAbstract();
        
        ahmet.compareAccountBalances(mehmet);
        ahmet.compareAccountBalances(ayse);
        mehmet.compareAccountBalances(ayse);
        zeynep.compareAccountBalances(ahmet);
        ramazan.compareAccountBalances(zeynep); 
        
    }
}
