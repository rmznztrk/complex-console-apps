    
package rational_number_project;
    
import java.util.Arrays;

//RATIONAL
    
public class Main {
    
    public static void main(String[] args) {
        
        
        RationalNumber rNumber1 = new RationalNumber(1,4);
        System.out.println(rNumber1);
        
        RationalNumber rNumber2 = new RationalNumber(2,4);
        System.out.println(rNumber2);
        
        RationalNumber rNumber3 = new RationalNumber(3,4);
        System.out.println(rNumber3);
        
        RationalNumber rNumber4 = new RationalNumber(4,4);
        System.out.println(rNumber4);
        
        RationalNumber rNumber5 = new RationalNumber(5,4);
        System.out.println(rNumber5);
        
        RationalNumber toplam = rNumber1.addition(rNumber5);
        System.out.println(toplam);
        
        RationalNumber fark = rNumber1.substraction(rNumber5);
        System.out.println(fark);
        
        RationalNumber carpim = rNumber1.multiplication(rNumber5);
        System.out.println(carpim);
        
        RationalNumber bolum = rNumber1.division(rNumber5);
        System.out.println(bolum);
        
        
        
        RationalNumber[] kesirliSayilar = { rNumber1 , rNumber5 };
        Arrays.sort(kesirliSayilar);
        
        for(RationalNumber temp : kesirliSayilar){
            System.out.println(temp);
        }
        
        
    }

    
}
