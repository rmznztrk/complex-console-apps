
package veterinary_simulation;

import java.util.ArrayList;



public class CityVeterinarians {
    
    private String city;
    private int totalNumberOfVeterinarians;
    private ArrayList<Veterinary> veterinariansInCity;

    public CityVeterinarians(String city) {
       
        this.city = city;
        veterinariansInCity = new ArrayList<>();
        this.totalNumberOfVeterinarians = 0;
        
    }
    
    
    void addVeterinaryInCity( Veterinary veterinary ){
    
        veterinariansInCity.add(veterinary);
        totalNumberOfVeterinarians++;
        
    }
    
    void listVeterinarysInCity(){
    
        System.out.println("\n" + '*' + this.city + " Sehir Veterinerleri: ");
        
        for (Veterinary veterinary : veterinariansInCity) {
            veterinary.introduceYourself();
        }
        
    }
    
    void totalVeterinaryNumberOfCities(){
    
        System.out.println("Sehirlerdeki toplam veteriner sayisi: " + totalNumberOfVeterinarians);
        
    }
    
    
}
