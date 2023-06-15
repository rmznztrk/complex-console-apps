
package veterinary_simulation;

import java.util.ArrayList;


public class Customer extends Person{
    
    private String address;
    
    private ArrayList<Animals> ownedAnimals;
    
    public Customer(String name,String id,String address){
        
        super(name,id);        
        this.address = address;
        ownedAnimals = new ArrayList<>();
    }
    
    public void customersAnimals(Animals animal){
    
        ownedAnimals.add(animal);
        System.out.println(animal+" -> "+super.getName()+" isimli musteriye eklendi.");
    }

    void listCustomersAnimals(){
        
        for (Animals ownedAnimal : ownedAnimals) {
            System.out.println(ownedAnimal);
        }
        
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    void introduceYourself(){
        System.out.println( this.toString() + ",Ben bir musteriyim." );
    }

    
    @Override
    public String toString(){
        return super.toString()+" Customer{" + "address=" + address + '}';
    }


    
}
