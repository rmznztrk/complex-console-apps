
package veterinary_simulation;
//VETERİNARY

public class Main {
 
    public static void main(String[] args) {
        
        createFirstObjects();
        
    }

    private static void createFirstObjects() {
        
        Cat vanKedisi = new Cat("2014",true,"Van Kedisi");
        Cat farsKedisi = new Cat("2015",false,"Fars Kedisi");
        Cat siyamKedisi = new Cat("2017",true,"Siyam Kedisi");
        System.out.println(vanKedisi); // *Cat sinifinin toString i cagrilir ve calistirilir.
        vanKedisi.showInformation();
        farsKedisi.showInformation();
        siyamKedisi.showInformation();
        
        Dog wolf = new Dog("2013",true,"Kurt",3);
        System.out.println(wolf); // *Dog sinifinin toString i cagrilir ve calistirilir.
        wolf.showInformation();
        
        Customer customer1 = new Customer("Ramazan","17569842168","Kutahya/Tavsanli");
        System.out.println(customer1); // *Customer sinifinin toString i cagrilir ve calistirilir.
        customer1.introduceYourself();
        customer1.customersAnimals(vanKedisi); 
        customer1.customersAnimals(wolf); 
        Customer customer2 = new Customer("Hilal","94785261347","Ankara");
        
        Veterinary veterinary1 = new Veterinary("Doruk","25765712584","ITU",7);
        Veterinary veterinary2 = new Veterinary("Urungu","73940395154","ITU",7);
        System.out.println(veterinary1);
        veterinary1.introduceYourself();
        System.out.println(veterinary2);
        veterinary2.introduceYourself();
        
        
        veterinary1.addCustomer(customer1);
        veterinary1.customerList();
        veterinary2.addCustomer(customer2);
        veterinary2.addCustomer(customer1);
        veterinary2.customerList();
        
        CityVeterinarians sehirdekiVeteriner1 = new CityVeterinarians("Istanbul");
        sehirdekiVeteriner1.addVeterinaryInCity(veterinary1);    
        sehirdekiVeteriner1.listVeterinarysInCity();
        
        
        
        ManagementPanel<Customer> customerMP = new ManagementPanel<>();
        customerMP.showOwnedAnimals(customer1);
        ManagementPanel<Animals> animalsMP = new ManagementPanel<>();
        animalsMP.showInformation(wolf);
        
        
    }
    
}
