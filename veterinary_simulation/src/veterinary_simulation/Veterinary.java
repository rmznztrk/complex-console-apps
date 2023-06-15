
package veterinary_simulation;

import java.util.ArrayList;


public class Veterinary extends Person{

    private String graduationSchool;
    private int totalWorkingTimeYears;
    private ArrayList<Customer> customersOfVeterinary;
    private int customersNumber;
    
    
    public Veterinary(String name,String id,String graduationSchool,int totalWorkingTimeYears) {
        
        super(name,id);
        this.graduationSchool = graduationSchool;
        this.totalWorkingTimeYears = totalWorkingTimeYears;
        customersOfVeterinary = new ArrayList<>();
        customersNumber = 0;
        
    }

    @Override
    void introduceYourself() {
        System.out.println( this.toString() + ",Ben bir veterinerim." );
    }

    public void addCustomer(Customer customer){
    
        customersOfVeterinary.add(customer);
        customersNumber++;
    }
    
    public void customerList(){
        
        System.out.println("\n"+'*' + this.getName() + " Veteriner'in Musterileri:" );
        for (Customer customer : customersOfVeterinary) {
            customer.introduceYourself();
            
        }
        
    }
 
    @Override
    public String toString() {
        return super.toString() + " Veterinary{" + "graduationSchool: " + graduationSchool + " , totalWorkingTime: " + totalWorkingTimeYears + '}';
    }
    
    
}
