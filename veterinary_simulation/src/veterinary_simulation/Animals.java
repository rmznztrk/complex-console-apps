
package veterinary_simulation;


abstract public class Animals {

    private String birthday;
    private boolean registrationStatus;
   
    // Abstract classta constructor olmasinin nedeni:
    // Alt sinifin ust sinifin constructor ini kullanma gerekliligidir.
    public Animals(String birthday,boolean registrationStatus) { 
        this.birthday = birthday;
        this.registrationStatus = registrationStatus;
    }
    
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(boolean registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    

    
    abstract void showInformation();
    
    @Override
    public String toString() {
        return " Dogum Tarihi:" + birthday + " , Kayit Durumu:" + registrationStatus + '}';
    }

    
}
