package television_simulation;

import java.util.Scanner;


public class Main {  //TELEVISION

    static Scanner scan = new Scanner(System.in);
    
    static Television myTV;

    public static void main(String[] args) {
    
        byte choice;
        
        showMenu();
                
        choice = takeChoice();
        
        evaluateTheChosen(choice);
        
        do{   
            
            if( choice != 8 && choice != 0 ){
                
                System.out.println("\n->>..press 8 for menu"); 
                
                System.out.println("->>..press 0 for exit");
                
                choice = takeChoice();
                
            }
            
            if( choice == 8 ){
                
                showMenu();
                
                choice = takeChoice();
        
                evaluateTheChosen(choice);
            }
          
            
        }while( choice != 0 );
        
        System.out.println("...See you in another life brothaa... :) \n"
                         + "-> *logged out.");
    }

    private static void showMenu() {
    
        System.out.println("\n***************|MENU|***************\n"
                            + "1-) Install the TV\n"
                            + "2-) Turn the volume down\n"
                            + "3-) Turn the volume up\n"
                            + "4-) Change TV channel\n"
                            + "5-) Show channel info\n"
                            + "6-) Turn on the Television\n"
                            + "7-) Turn of the Television\n"
                            + "8-) Refresh the menu\n"
                            + "0-) EXIT\n");
        //Kullanicinin kanal oluşturmasi eklenebilir.
        //Olusturulan kanal veya kanallari ve TV yi sil ozelligi eklenebilir.
      
        

    }

    private static byte takeChoice() {
    
        byte choice = scan.nextByte();
    
        return choice;
    }

    private static void evaluateTheChosen(byte choice){
        Channels myChannel0 = new Channels("Manolya","6");
        Channels myChannel1 = new MusicChannel("DREAM TURK","7","pop");
        Channels myChannel2 = new NewsChannel("FOX","8","Generic");
        switch(choice){
            
            case 0:
                break;
            
            case 1:
                System.out.println("\n |• Install the TV|  " 
                        + "\n--------------------");
                Installing();
                break;
            
            case 2:
                System.out.println("\n |• Turn the volume down| "
                        + "\n--------------------------");
                turnDownVolume();

                break;
            
            case 3:
                System.out.println("\n |• Turn the volume up| "
                        + "\n------------------------");
                turnUpVolume();
                break;
            
            case 4:
                System.out.println("\n |• Change TV channel| "
                        + "\n-----------------------");
                changeTvChannel();
                break;
            
            case 5:
                System.out.println("\n |• Show channel info| "
                        + "\n-----------------------");
                showChannelInfo();

                break;
            
            case 6:
                System.out.println("\n |• Turn on the Television| "
                        + "\n----------------------------");
                turnOnTheTv();
                break;
            
            case 7:
                System.out.println("\n |• Turn of the Television| "
                        + "\n----------------------------");
                turnOffTheTv();
                break;
            
            case 8:
                showMenu();
                System.out.println("Menu-Refreshed✓✓✓");
                break;
                
             default:
                 System.out.println("\nLutfen MENU'den 0-8 araliginda secim yapiniz! "
                         + "\n");
                 break;
        }
        
    }
    

    private static void Installing() {
        
        if( myTV == null ){
     
            scan.nextLine();
            
            System.out.println("Sahip olmak istediginiz TV nin markasini giriniz: ");
            String tvTrademark = scan.nextLine();
            
            System.out.println("Sahip olmak istediginiz TV nin boyutunu giriniz: ");
            String tvSize = scan.nextLine();

            myTV = new Television(tvTrademark,tvSize);
            System.out.println(myTV);
               
        }
        
        else{
            
            System.out.println("<!> Zaten bir tane TV olusturdunuz! Sadece bir tane TV olusturabilirsiniz!");
            System.out.println("Olusturulan TV: "+myTV);
        
        }
    
    }


    private static void turnOnTheTv() {
        
        //objectInitilazitionControl("turnOnTheTv"); Switch-case icin gerekliydi
        
        if( objectInitilazitionControl() )          
            myTV.turnOnTheTv();
    
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        
        
    }
    
    private static void turnOffTheTv() {
        /*
        objectInitilazitionControl("turnOffTheTv");  Switch-case icin gerekliydi.
        */
        if( objectInitilazitionControl() )                                           
            myTV.turnOffTheTv();
    
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        
    }

    private static void turnDownVolume() {
        
        //objectInitilazitionControl("turnDownVolume");  //Switch-case icin gerekliydi.
        
        if( objectInitilazitionControl() )         
            myTV.turnDownVolume();
    
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
    
    }

    private static void turnUpVolume() {
        
        //objectInitilazitionControl("turnUpVolume");  //Switch-case icin gerekliydi.
        
        if( objectInitilazitionControl() )         
            myTV.turnUpVolume();
    
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        
    }
    
    private static void changeTvChannel(){
        
        if( objectInitilazitionControl() ){
            
         
            myTV.changeTvChannel();
        }
        
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        
        
    }
    
    
    private static void showChannelInfo() {
     
        if( objectInitilazitionControl() ){
            
            myTV.showChannelInfo();
        
        }
        
        else
            System.out.println("❗ Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        
        
        
    }
    
    public static boolean objectInitilazitionControl(){
        
        boolean objectInitilazitionControl = ((myTV==null) ? false : true) ;
        
        return objectInitilazitionControl;
        
        /*
         if( myTV != null ){
         
             switch(methodName){
             
                 case "turnOnTheTv":
                     myTV.turnOnTheTv();
                        break;
                     
                 case "turnOffTheTv":
                     myTV.turnOffTheTv();
                        break;
                     
                 case "turnDownVolume":
                     myTV.turnDownVolume();
                        break;
                     
                 case "turnUpVolume":
                     myTV.turnUpVolume();
                        break;
                     
                 default: 
                     System.out.println(methodName+" isimli method bulunmamaktadir!");     
             
             }
         
         }
           
        else
            System.out.println("Henuz bir TV olusturmadiniz! Lutfen ilk once bir TV olusturunuz!");
        */
   
    }

    
    //bulundugu kanala geri gitmesini önle ve Tv nin açık olup olmadıgını anlamak için initializationobjectcontrol metodu gibi metot olustur.
}