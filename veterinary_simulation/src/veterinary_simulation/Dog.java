
package veterinary_simulation;


public class Dog extends Animals{

    private String breedOfDog;
    
    private int numberOfVaccine;
    
    public Dog(String birthday,boolean registrationStatus,String breedOfDog,int numberOfVaccine) {
        
        super(birthday,registrationStatus);
        this.breedOfDog = breedOfDog;
        this.numberOfVaccine = numberOfVaccine;
    
    }
    
    public String getBreedOfCat() {
        return breedOfDog;
    }

    public void setBreedOfCat(String breedOfCat) {
        this.breedOfDog = breedOfDog;
    }
    
    public int getNumberOfVaccine() {
        return numberOfVaccine;
    }

    public void setNumberOfVaccine(int numberOfVaccine) {
        this.numberOfVaccine = numberOfVaccine;
    }
    
    @Override
    void showInformation() {
        System.out.println(toString() +" and "+ super.toString() );
    }
    
    @Override
    public String toString() {
        return "*Dog { " +"Kopegin Cinsi: "+breedOfDog+ ",Asi Sayisi:" + numberOfVaccine + '}';
    }


    
   

}
