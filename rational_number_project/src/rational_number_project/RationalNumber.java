
package rational_number_project;


public class RationalNumber implements Comparable<RationalNumber>{ 
    
    private int numerator;
    private int denominator;
    
    int ebob;
    String sadelestir;
    
    public RationalNumber( int numerator , int denominator ){
        
        System.out.println(" "+ numerator + '/' + denominator);

        ebob = calculateEbob( numerator , denominator );
        
        sadelestir = sadelestir( numerator , denominator , ebob );     
        
        
        int numeratorInt=0, denominatorInt=0;
        int slash = sadelestir.indexOf("/");      
        int length = sadelestir.length();
        
        if( slash != -1 ){
            numeratorInt = Integer.parseInt(sadelestir.substring(0,slash)); 
            denominatorInt= Integer.parseInt(sadelestir.substring(slash+1,length)); 
        }
        
        else{
            System.out.println("Pay:" + sadelestir);
        }
        
        this.numerator = numeratorInt;
        this.denominator = denominatorInt;

        
    }


    
    
    private int calculateEbob( int numerator , int denominator) {
        int ebob=0;

        int smallNumber = (numerator<denominator) ? numerator : denominator ;

        smallNumber = (smallNumber > 0) ? smallNumber : -smallNumber;
        
        for( int i=1 ; i <= smallNumber ; i++ ){
            
            if( numerator % i == 0 && denominator % i == 0 ){
            
                int temp = i;
                
                ebob = ( i > temp ) ? i : temp ;
            
            }
                     
        }
        
        if( ebob == 1 ){
            System.out.println("*Pay ve Payda 'Aralarinda Asaldir' Sadelestirme Yapilamaz!");
        }
        return ebob;
        
        
    }
        
    
    
    
    private String sadelestir( int numerator , int denominator , int ebob ) {
        
        
        int numeratorSade =  numerator / ebob;
        int denominatorSade = denominator / ebob;
        
            if( denominatorSade == 1 )
                return Integer.toString(numeratorSade);
            

        String sadeHali = Integer.toString(numeratorSade) + "/" + Integer.toString(denominatorSade);
        
            if( numeratorSade<0 && denominator<0 )
                return Integer.toString( Math.abs(numeratorSade) ) + "/" + Integer.toString( Math.abs(denominatorSade) );  
        
        return sadeHali;
        
    }
    
    
    
    
    public RationalNumber addition(RationalNumber toplanacakSayi){
        
        System.out.println("_____Kesirlerle Toplama Islemi:_____");
        System.out.println(this.numerator+"/"+this.denominator + " + " + toplanacakSayi.numerator + "/" + toplanacakSayi.denominator+" = ?");
        int numeratorT = ( this.numerator*toplanacakSayi.denominator ) + ( this.denominator*toplanacakSayi.numerator );
        int denominatorT = this.denominator*toplanacakSayi.denominator;
        
        RationalNumber toplam = new RationalNumber(numeratorT,denominatorT);
        
        
        return toplam;
    }
    
    public RationalNumber substraction(RationalNumber cikarilacakSayi){
        
        System.out.println("_____Kesirlerle Cikarma Islemi:_____");
        System.out.println(this.numerator+"/"+this.denominator + " - " + cikarilacakSayi.numerator + "/" + cikarilacakSayi.denominator+" = ?");
        int numeratorCkr = ( this.numerator*cikarilacakSayi.denominator ) - ( this.denominator*cikarilacakSayi.numerator );
        int denominatorCkr = this.denominator*cikarilacakSayi.denominator;
        
        RationalNumber fark = new RationalNumber(numeratorCkr,denominatorCkr);
        
        
        return fark;
    }
    
    public RationalNumber multiplication(RationalNumber carpilacakSayi){
        
        System.out.println("_____Kesirlerle Carpma Islemi:_____");
        System.out.println(this.numerator+"/"+this.denominator + " * " + carpilacakSayi.numerator + "/" + carpilacakSayi.denominator+" = ?");
        int numeratorCrp =  this.numerator * carpilacakSayi.numerator ;
        int denominatorCrp = this.denominator * carpilacakSayi.denominator;
        
        RationalNumber carpim = new RationalNumber(numeratorCrp,denominatorCrp);
        
        
        return carpim;
    }
    
    public RationalNumber division(RationalNumber bolunecekSayi){
        
        System.out.println("_____Kesirlerle Bolme Islemi:_____");
        System.out.println("("+this.numerator+"/"+this.denominator + ") / (" + bolunecekSayi.numerator + "/" + bolunecekSayi.denominator+") = ?");
        int numeratorB =  this.numerator * bolunecekSayi.denominator ;
        int denominatorB = this.denominator * bolunecekSayi.numerator;
        
        RationalNumber bolum = new RationalNumber(numeratorB,denominatorB);
        
        
        return bolum;
    }

    @Override
    public String toString() {
        
        return        
            "En Sade Hali: " + sadelestir + "\n" +
            "Ebob: " + ebob + "\n";    
        
    }

    @Override
    public int compareTo(RationalNumber o) {
        
        if( this.substraction(o).numerator > 0 ){
            return 1;
        }
        else if( this.substraction(o).numerator < 0 ){
            return -1;
        }
        else{
            return 0;
        }
        

    }
    
    
    
}
