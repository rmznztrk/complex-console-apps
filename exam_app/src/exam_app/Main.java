package exam_app;

import java.util.Scanner;
import java.util.Vector;

//EXAM
public class Main{

    static Scanner klavye = new Scanner(System.in);
    
    enum Secenek{SORUEKLE,SORUCIKAR,SORULISTELE,SINAVOLUSTUR,GIRILMEDI,CIKIS} 
    //enum Secenek2{METİNDENARAMA,SIKTANARAMA,DOGRUSIKTANARAMA,PUANDANARAMA,DERECESİNDENARAMA,GIRILMEDI2}
    
    static Vector<Questions> SorularVector=null;
    static Vector<Answers>  SiklarVector=null;
    
    public static void main(String[] args) {
        System.out.println("Program suresince secim yapmak icin lutfen rakam tuslayiniz..! (1-5 arasi)");
        System.out.println("Programda kayitli soru yoktur! Islemleri gerceklestirmek icin lutfen soru ekleyiniz.");
        System.out.println("Sınav Olusturmak icin 10 tane soru eklenmelidir!");
        
        Secenek secim=Secenek.GIRILMEDI;
        
       SorularVector=new Vector<>();
       SiklarVector=new Vector<>();
       
       do{
        secimListesi1();
        secim=secimAl();
        secimiAnalizEt(secim);
       }while(secim != Secenek.CIKIS);
       
        System.out.println("Cikis yapildi...");
       
        
    }
    
    private static void secimListesi1(){
    
        System.out.println("***Sinav Hazirlik Uygulamasi***");
        System.out.println("1-) Soru Ekle");
        System.out.println("2-) Soru Cikar");
        System.out.println("3-) Soru Listele");
        System.out.println("4-) Sinav Olustur");
        System.out.println("5-) Cikis ->");
        
        
    }
    
    private static Secenek secimAl(){
        
        Secenek sectigim=Secenek.GIRILMEDI;
        int secimim=klavye.nextInt();
        
        switch(secimim){
            case 1:
                sectigim=Secenek.SORUEKLE;
                    break;
            case 2:
                sectigim=Secenek.SORUCIKAR;
                    break;
            case 3:
                sectigim=Secenek.SORULISTELE;
                    break;
            case 4:
                sectigim=Secenek.SINAVOLUSTUR;
                    break;
            case 5:
                sectigim=Secenek.CIKIS;
                    break;
            default:
                System.out.println("Lutfen listeden secim yapiniz([1,5] arasi,örn:3)");
                    break;
            }
            return sectigim;
    }
    private static void secimiAnalizEt(Secenek secim){
        switch (secim){
            case SORUEKLE:
                soruEkle();
                    break;
            case SORUCIKAR:
                soruCikar();
                    break;
            case SORULISTELE:
                secimListesi2();
                secimAl2();
                    break;
            case SINAVOLUSTUR:
                sinavOlustur();
                    break;
            default:   
                System.out.println("\n");
                    break;
                 
            
        }
    }
    
    
    
    private static void soruEkle(){
        Answers cevap = new Answers();
        Questions soru = new Questions();
        
        System.out.println("Eklemek istediginiz soru metnini giriniz: ");
        String soruMetni=klavye.next().trim();
        soruMetni+=klavye.nextLine();
        soru.setSoruMetin(soruMetni);
        
        System.out.println("Sorunun puanini giriniz: (5 veya 10)");
        byte soruPuani=klavye.nextByte();
        soru.setSoruPuani(soruPuani);
        
        System.out.println("Sorunun duzeyini HARF olarak giriniz: (K:kolay,O:orta,Z:zor)  *orn:Z");
        String soruDerecesi=klavye.next().trim();
        soruDerecesi+=klavye.nextLine();
        soru.setSoruDerecesi(soruDerecesi);
        
        
        SorularVector.add(soru);                                                
        System.out.println("*Simdi Siklara Gecelim: --->");
        
        
        //
        
        
        System.out.println("Eklemek istediginiz siklari giriniz: ");
        
        System.out.print("A sikkini giriniz: ");
        String a=klavye.next().trim();
        a+=klavye.nextLine();
        cevap.setA(a);      
        
        System.out.print("B sikkini giriniz: ");
        String b=klavye.next().trim();
        b+=klavye.nextLine();
        cevap.setB(b);
        
        System.out.print("C sikkini giriniz: ");
        String c=klavye.next().trim();
        c+=klavye.nextLine();
        cevap.setC(c);
        
        System.out.print("D sikkini giriniz: ");
        String d=klavye.next().trim();
        d+=klavye.nextLine();
        cevap.setD(d);
        
        System.out.print("E sikkini giriniz: ");
        String e=klavye.next().trim();
        e+=klavye.nextLine();
        cevap.setE(e);      
        
        System.out.println("Dogru cevabi HARF olarak giriniz:  *örn:A");
        String soruCevabi=klavye.next().trim();
        soruCevabi+=klavye.nextLine();
        cevap.setSoruCevabi(soruCevabi);
        
        
        
        
        
        
        SiklarVector.add(cevap);
        System.out.println("*Cevaplariniz eklendi. \n");     
        } 
    
    
    
    
    private static void secimListesi2(){
        System.out.println();
        System.out.println("1-) Soru metni icinde arama");
        System.out.println("2-) Soru siklarinin metinleri icinde arama");
        System.out.println("3-) Dogru siklarin uzerinden arama (ornegin cevabi A sikki olanlari listele gibi)");
        System.out.println("4-) Puan uzerinden arama (ornegin puani 10 olan sorulari listele gibi)");
        System.out.println("5-) Zorluk derecesi uzerinden listeleme (ornegin zor sorulari listele gibi)");
        System.out.println("6-) Genel listeleme");
    
    }
    
    
    private static void secimAl2(){
        
        int secimim2=klavye.nextInt();
        switch(secimim2){
            case 1:
                metinIcindeArama();
                    break;
            case 2:
                sIkIcindeArama();
                    break;
            case 3:
                dogruSIkIcindeArama();
                    break;
            case 4:
                puanUzerindenArama();
                    break;
            case 5:
                dereceUzerindenArama();
                    break;
            case 6:
                genelListeleme();
                    break;
            default:
                System.out.println("Lutfen listeden secim yapiniz([1,5] arasi,  *orn:2)");
                    break;
            }
            
    
    }
          
    
    
    //
    private static void metinIcindeArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelime=klavye.next();
            for(int i=0;i<SorularVector.size();i++){
                
                System.out.println((i+1)+". soru: "+SorularVector.get(i).getSoruMetin());
                System.out.print((i+1)+". soruda  ''"+aranacakKelime+"'' ifadesi: ");
                String deger= SorularVector.get(i).getSoruMetin().indexOf(aranacakKelime)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);

            }
    }
    
    
    
    
    //
    private static void sIkIcindeArama(){
        System.out.println("Hangi sik üzerinde arama yapmak istiyorsunuz:  1-5 arası seciniz, *orn:2 ");
        System.out.println("1-) A sikki uzerinde arama yap");
        System.out.println("2-) B sikki uzerinde arama yap");
        System.out.println("3-) C sikki uzerinde arama yap");
        System.out.println("4-) D sikki uzerinde arama yap");
        System.out.println("5-) E sikki uzerinde arama yap");
        
        int secim=klavye.nextInt();
        switch(secim){
            case 1:
                aSikkiArama();
                    break;
            case 2:
                bSikkiArama();
                    break;
            case 3:
                cSikkiArama();
                    break;    
            case 4:
                dSikkiArama();
                    break;    
            case 5:
                eSikkiArama();
                    break; 
            default:
                System.out.println("Lutfen listeden secim yapiniz([1,5] arasi,örn:1)");
                    break;    
        }
    }
    private static void aSikkiArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelimeA=klavye.next();
            for(int i=0;i<SiklarVector.size();i++){
                System.out.println((i+1)+". sorunun A sikki: "+SiklarVector.get(i).getA());
                System.out.print((i+1)+". sorunun a sikkinda  ''"+aranacakKelimeA+"'' ifadesi: ");
                String deger=SiklarVector.get(i).getA().indexOf(aranacakKelimeA)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);
            }
    }
    private static void bSikkiArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelimeB=klavye.next();
            for(int i=0;i<SiklarVector.size();i++){
                System.out.println((i+1)+". sorunun B sikki: "+SiklarVector.get(i).getB());
                System.out.print((i+1)+". sorunun b sikkinda  ''"+aranacakKelimeB+"'' ifadesi: ");
                String deger=SiklarVector.get(i).getB().indexOf(aranacakKelimeB)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);
            }
    }
    private static void cSikkiArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelimeC=klavye.next();
            for(int i=0;i<SiklarVector.size();i++){
                System.out.println((i+1)+". sorunun C sikki : "+SiklarVector.get(i).getC());
                System.out.print((i+1)+". sorunun c sikkinda  ''"+aranacakKelimeC+"'' ifadesi: ");
                String deger=SiklarVector.get(i).getC().indexOf(aranacakKelimeC)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);
            }    
    }
    private static void dSikkiArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelimeD=klavye.next();
            for(int i=0;i<SiklarVector.size();i++){
                System.out.println((i+1)+". sorunun D sikki: "+SiklarVector.get(i).getD());
                System.out.print((i+1)+". sorunun d sikkinda  ''"+aranacakKelimeD+"'' ifadesi: ");
                String deger=SiklarVector.get(i).getD().indexOf(aranacakKelimeD)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);
            }
    }        
    private static void eSikkiArama(){
        System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
        String aranacakKelimeE=klavye.next();
            for(int i=0;i<SiklarVector.size();i++){
                System.out.println((i+1)+". sorunun E sikki: "+SiklarVector.get(i).getE());
                System.out.print((i+1)+". sorunun e sikkinda  ''"+aranacakKelimeE+"'' ifadesi: ");
                String deger=SiklarVector.get(i).getE().indexOf(aranacakKelimeE)!= -1 ? "VAR." : "YOK." ;   
                System.out.println(deger);
            }    
    }
    
    
    
    
    
    //
    private static void dogruSIkIcindeArama(){
        System.out.println("_______Dogru sik üzerinden arama_______");
        System.out.println("1-)Cevabi A sikki olanlari listele");
        System.out.println("2-)Cevabi B sikki olanlari listele");
        System.out.println("3-)Cevabi C sikki olanlari listele");
        System.out.println("4-)Cevabi D sikki olanlari listele");
        System.out.println("5-)Cevabi E sikki olanlari listele");
        System.out.println("1-5 arasi tuslama yapiniz!");
        System.out.println("Hangi sik uzerinden arama yapacaksiniz:  *Orn:1");
        int secim=klavye.nextInt();
        
            switch(secim){
                case 1:
                    aSikki();
                        break;
                case 2:
                    bSikki();
                        break;
                case 3:
                    cSikki();
                        break;
                case 4:
                    dSikki();
                        break;
                case 5:
                    eSikki();
                        break;
                default:
                    System.out.println("Lutfen listeden secim yapiniz([1,5] arasi,orn:1)");
                        break;
            }
    }
    
    private static void aSikki(){
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SiklarVector.get(i).getSoruCevabi().equals("a") || SiklarVector.get(i).getSoruCevabi().equals("A")){
                System.out.println((i+1)+". sorunun "+" cevabi: "+SiklarVector.get(i).getSoruCevabi());
            }
            
            }
    }
    private static void bSikki(){
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SiklarVector.get(i).getSoruCevabi().equals("b") || SiklarVector.get(i).getSoruCevabi().equals("B")){
                System.out.println((i+1)+". sorunun "+" cevabi: "+SiklarVector.get(i).getSoruCevabi());
            }
            
            }
    }
    private static void cSikki(){
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SiklarVector.get(i).getSoruCevabi().equals("c") || SiklarVector.get(i).getSoruCevabi().equals("C")){
                System.out.println((i+1)+". sorunun "+" cevabi: "+SiklarVector.get(i).getSoruCevabi());
            }
            
            }
    }
    private static void dSikki(){
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SiklarVector.get(i).getSoruCevabi().equals("d") || SiklarVector.get(i).getSoruCevabi().equals("D")){
                System.out.println((i+1)+". sorunun "+" cevabi: "+SiklarVector.get(i).getSoruCevabi());
            }
            
            }
    }
    private static void eSikki(){
                    for(int i=0;i<SiklarVector.size();i++){
            
            if(SiklarVector.get(i).getSoruCevabi().equals("d") || SiklarVector.get(i).getSoruCevabi().equals("D")){
                System.out.println((i+1)+". sorunun "+" cevabi: "+SiklarVector.get(i).getSoruCevabi());
            }
            
            } 
    }
    
    
    
    
    
    
   // 
    private static void puanUzerindenArama(){
        System.out.println("Puan");
        System.out.println("Kac puanlik sorulari listelemek istiyorsunuz: (secim icin 1 veya 2 tuslayiniz..)");
        System.out.println("1-) 5 Puanlik Sorulari Listele");
        System.out.println("2-) 10 Puanlik Sorulari Listele");
        int secim=klavye.nextInt();
            switch(secim){
                case 1:
                    besPuan();
                        break;
                case 2:
                    onPuan();
                        break;
                default:
                    System.out.println("Lutfen [1,2] aralığında tuşlama yapınız.  *örn:1");
                        break;
            }
    }
    private static void besPuan(){
        System.out.println("_______5 Puan'lik Sorular:_______ ");
        
        for(int i=0;i<SorularVector.size();i++){
            if(SorularVector.get(i).getSoruPuani()==5){
                System.out.println((i+1)+". Soru");
            }
        }
        System.out.println("");
    }
    private static void onPuan(){
        System.out.println("_______10 Puan'lik Sorular:_______ ");
        
        for(int i=0;i<SorularVector.size();i++){
            if(SorularVector.get(i).getSoruPuani()==10){
                System.out.println((i+1)+". Soru");
            }
        }
        System.out.println("");
    }
    
    
    
    
    
    //
    private static void dereceUzerindenArama(){
        System.out.println("Hangi duzeydeki sorulari listelemek istiyorsunuz:  *orn:1");
        System.out.println("1-) Kolay Dereceli Sorular");
        System.out.println("2-) Orta Dereceli Sorular");
        System.out.println("3-) Zor Dereceli Sorular");
        int secim=klavye.nextInt();
            switch(secim){
                case 1:
                    kolayDereceliSorular();
                        break;
                case 2:
                    ortaDereceliSorular();
                        break;
                case 3:
                    zorDereceliSorular();
                        break;
                default:
                    System.out.println("Lutfen [1,3] araliginda tuslama yapiniz.  *orn:3");
                        break;
            }
        
        
    }
    private static void kolayDereceliSorular(){
    System.out.println("_______Kolay Dereceli Sorular_______");
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SorularVector.get(i).getSoruDerecesi().equals("K") || SorularVector.get(i).getSoruDerecesi().equals("k")){
                System.out.println((i+1)+". Soru ");
            }
            
            }
            System.out.println();
    }
    private static void ortaDereceliSorular(){
    System.out.println("_______Orta Dereceli Sorular_______");    
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SorularVector.get(i).getSoruDerecesi().equals("O") || SorularVector.get(i).getSoruDerecesi().equals("o")){
                System.out.println((i+1)+". Soru ");
            }
            
            }
            System.out.println();
    }
    private static void zorDereceliSorular(){
    System.out.println("_______Zor Dereceli Sorular_______");    
        for(int i=0;i<SiklarVector.size();i++){
            
            if(SorularVector.get(i).getSoruDerecesi().equals("Z") || SorularVector.get(i).getSoruDerecesi().equals("z")){
                System.out.println((i+1)+". Soru ");
            }
            
            }
            System.out.println();
    }
    
    
 
    private static void genelListeleme(){
        int i = 1, j = 1;
            for(Questions soru:SorularVector){
                System.out.println(i+". soru: "+soru);
                i++;
            }
            
            for(Answers cevaplar:SiklarVector){
                System.out.println(j+".cevap: "+cevaplar);
                j++;
            }
                System.out.println("");
           
    }
    
    
    //Soru çıkarma
    
    
    private static void soruCikar(){
        System.out.println("_______Soru Cikartma_______");
        System.out.println("Tek secim hakkiniz vardir.");
        System.out.println("1-) Soru metni uzerinden arama yap");
        int secim=klavye.nextInt();
               if(secim==1){
                   System.out.println("Aranacak kelimeyi giriniz: (BUYUK/KUCUK HARF 'e DUYARLIDIR!)");
                   String aranacakKelime=klavye.next();
                        for(int i=0;i<SorularVector.size();i++){
                            System.out.print((i+1)+". soruda  ''"+aranacakKelime+"'' ifadesi: ");
                            String deger= SorularVector.get(i).getSoruMetin().indexOf(aranacakKelime)!= -1 ? "VAR." : "YOK." ;   
                            System.out.println(deger);
                        }
                        System.out.println("Kacinci soruyu cikarmak istiyorsunuz: ");
                        int secim1=klavye.nextInt();
                        int soruNumarasi=secim1;
                        secim1--;
                        SorularVector.remove(secim1);
                        SiklarVector.remove(secim1);
                        System.out.println(soruNumarasi+". soru basariyla cikarildi..");
                }
           
    
   
}

    private static void sinavOlustur(){
        System.out.println("Lutfen soru eklemediyseniz 10 adet soru ekleyiniz! Ve test basladiginda Cevaplari BUYUK Harf giriniz!  *orn:A ");
        System.out.println("Sinava baslamak icin 9' u tuslayiniz: \n \n \n");
        int secim=klavye.nextInt();
        if(secim==9){
            System.out.println("Cevaplari Buyuk Harf giriniz!  *orn:A");
            sinavaBasla();
        }
    }
    private static void sinavaBasla(){/*
        int rastgele,i=1;
            for(int toplam=0;toplam<=5;){*/
                int toplamPuan=0,toplam=0,puan=0,puan1,i=1;
                    for(toplamPuan=0;toplamPuan<=100;){
                        int rastgele=(int)(Math.random()*10);   //  10 için --> 0,1,2,....,9 rakamlarını rastgele üretir ve bu rakamlar index değerlerimiz olur.Sonra SorularVector ve SiklarVektör içindeki nesneleri bu rakamlar ile rastgele seçip üzerinde işlemler yaparız.
                        System.out.println();

                        String metin=SorularVector.get(rastgele).getSoruMetin();
                        System.out.println(i+". soru:"+metin);
                        String cevapA=SiklarVector.get(rastgele).getA();
                        String cevapB=SiklarVector.get(rastgele).getB();
                        String cevapC=SiklarVector.get(rastgele).getC();
                        String cevapD=SiklarVector.get(rastgele).getD();
                        String cevapE=SiklarVector.get(rastgele).getE();
                        System.out.println("| A: "+cevapA+"| B: "+cevapB+"| C: "+cevapC+"| D: "+cevapD+"| E: "+cevapE);
                        i++;

                        puan=SorularVector.get(rastgele).getSoruPuani();
                        toplamPuan+=puan;
                        System.out.println("*Cevabinizi giriniz:  *orn:A ");
                        String cevap=klavye.next();
                            if(cevap.equals(SiklarVector.get(rastgele).getSoruCevabi())){
                                //puan=SorularVector.get(rastgele).getSoruPuani();
                                System.out.println("Dogru ve +"+puan);
                                puan1=SorularVector.get(rastgele).getSoruPuani();
                                toplam=toplam+puan1;


                            }
                            else{
                                System.out.println("Yanlis");
                            }

                    
                }    
                System.out.println("*** Toplam puan: "+toplam+"\n ***_______SinavBitti..._______");
                
            }   
    }

