
package veterinary_simulation;



public class ManagementPanel<T> {
    
    {
        System.out.println("");
                }
    
    public void showInformation(T object){
        System.out.println(object);
    }
    
    // showOwnedAnimals methodu Customer sinifinin tum alt siniflarini isleyebilir.
    public <T extends Customer> void showOwnedAnimals(T customer){
        customer.listCustomersAnimals();
    }
    
    
}
