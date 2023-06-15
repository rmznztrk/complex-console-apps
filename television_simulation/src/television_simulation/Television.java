
package television_simulation;

import static television_simulation.Main.scan;
import java.util.ArrayList;


public class Television {

    private String trademark,size;
    private ArrayList<Channels> channel; // (a)
    private boolean stateOfTheTv; 
    private int volume=0;
    public boolean objectInitilazition;
    private int channelNo; 
    
    public Television(String trademark,String size){
        
        this.trademark = trademark;
        this.size = size;
        
        channel = new ArrayList<>();//channel referansli ArrayList imizi,Televizyon nesnemiz olusturulurken initialize ediyoruz.Yani ilklendirme islemini gerceklestiriyoruz.Diger bir soyleyisle bellekten yer(alan) tahsisi yapiyoruz.
        createChannel(); //Bir Televizyon nesnesi olusurken kanal veya kanallar nesnesi de olusacak.
   
        this.stateOfTheTv = false;
        
        volume=10;
        
        objectInitilazition=true;
        
        channelNo=1;
    }

    
    private void createChannel() { //Bu metodumuzu private tanimladik cunku;
                                   //Televizyon olusturulurken televizyondaki kanallarin da kendiliginden olusmasi gerekiyor.
/*(b)*/ NewsChannel cnn = new NewsChannel("CNN","1","Generic"); //Yani kanallari disardan bir kullanicinin olusturmasi normal degil ve sacma bir sey olurdu.
/*(b)*/ NewsChannel bbc = new NewsChannel("BBC","2","Generic");                
/*(b)*/ NewsChannel trtSpor = new NewsChannel("TRT SPOR","3","Spor");  

/*(c)*/ channel.add(cnn); //Channels tipinde referans yani channel(a) alan arraylistemize,NewsChannel tipinde referans(b) gonderebiliriz.
/*(c)*/ channel.add(bbc); //Yani alt sinif referanslarini,ust sinif referanslarina atayarak POLYMORPHIZM uyguladik.(c)
/*(c)*/ channel.add(trtSpor);//Boylelikle diger kanal turlerinin hepsini bu arraylistemize eklememiz mümkündür.
    
 
        MusicChannel kralMusic = new MusicChannel("KRAL MUZIK","4","Pop");                
        MusicChannel numberOne = new MusicChannel("NUMBER ONE","5","Yabancı Pop");                
        MusicChannel trtMusic = new MusicChannel("TRT MUZIK","6","Turk Sanat Muzigi");                

        channel.add(kralMusic);
        channel.add(numberOne);
        channel.add(trtMusic);
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
     
    public void turnOnTheTv(){
        
        if( stateOfTheTv == false ){
            
            stateOfTheTv = true;
            
            System.out.println("*TV acildi.✓");
        
        }
        else
            System.out.println("⚠ Tv zaten acik!");
    }
    
    public void turnOffTheTv(){
        
        if( stateOfTheTv == true ){
            
            stateOfTheTv = false;
            
            System.out.println("*TV kapandi. X");
        
        }
        else
            System.out.println("⚠ Tv zaten kapali!");
    
    }
    
    public void turnDownVolume(){
        
        if( volume>0 && stateOfTheTv == true ){
            
            volume--;
            
            if( volume==0 )
                System.out.println("Ses: "+volume+" 🔇");
            else
                System.out.println("Ses: "+volume+" 🔊");
        }
        else if( stateOfTheTv != true )
            System.out.println("⚠ Ilk once TV'yi aciniz!");
        else
            System.out.println("Ses:"+volume+" 🔇"+",ses minumum daha fazla azaltilamaz! ⚠");
        
    }
    public void turnUpVolume(){
        
        if( volume<20 && stateOfTheTv == true ){
            
            volume++;
            
            System.out.println("Ses: "+volume+" 🔊");
        }
        else if( stateOfTheTv != true )
            System.out.println("⚠ Ilk once TV'yi aciniz!");
        else
            System.out.println("Ses:"+volume+" 🔊"+",ses maksimum daha fazla arttirilamaz! ⚠");
        
    }
    
    void changeTvChannel() {
        
        if(stateOfTheTv){
            
            System.out.println("Kacinci kanali acmak istiyorsunuz: ");
            int changeChannel = scan.nextInt();
            
            
            if( changeChannel > 0 && changeChannel <= channel.size() && changeChannel != channelNo ){
                
                System.out.println("* "+changeChannel+". Kanal acildi. Kanal bilgileri -> "+channel.get(changeChannel-1)); 
                
                channelNo = changeChannel;
                
            }
            else if(changeChannel == channelNo)
                System.out.println("Zaten "+changeChannel+". kanaldasiniz!");
            
            else
                System.out.println("*Televizyondaki toplam kanal sayisi: "+channel.size()+"'dir.\n"
                             + "⚠ Lutfen gecerli kanal numarasi giriniz!");
        }
        else
            System.out.println("❗ Lutfen TV yi aciniz!");
    }
    
    
    void showChannelInfo() {
    
                
        if(stateOfTheTv){
      
            System.out.println("*TV'deki toplam kanal sayisi: "+channel.size());
            
            for(Channels channel : channel)
                System.out.println(channel);
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("*Suan bulundugunuz kanal bilgisi -> "+channel.get(channelNo-1));
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
        else
            System.out.println("❗ Lutfen TV yi aciniz!");
        
    }
    
    @Override
    public String toString() {
        return "* |Marka: "+trademark+" ve "+"Boyut: "+size+" olan televizyon olusturuldu.| ✓ *"; 
    }



    
}
