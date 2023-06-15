
package veterinary_simulation;


public class Cat extends Animals{
    
    private String breedOfCat;

    
    public Cat(String birthday, boolean registrationStatus,String breedOfCat) {
        
        super(birthday,registrationStatus);
        this.breedOfCat = breedOfCat;
        
    }

    public String getBreedOfCat() {
        return breedOfCat;
    }

    public void setBreedOfCat(String breedOfCat) {
        this.breedOfCat = breedOfCat;
    }

    @Override
    void showInformation(){
    
        System.out.println(toString() +" and "+ super.toString() );
        
    }
   
    
    @Override
    public String toString() {
        return "*Cat { "+"Kedinin Cinsi: " + breedOfCat +" }";
    }

    
}
