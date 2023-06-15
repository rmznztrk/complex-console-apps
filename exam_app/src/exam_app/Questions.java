
package exam_app;


public class Questions{
    private String soruMetni;
    private byte soruPuani;
    private String soruDerecesi;

   public Questions() {
		
		this.soruMetni = "";
        this.soruPuani=0;
        this.soruDerecesi="";
                   
   }   
        
    
    public void setSoruMetin(String soruMetni){
        this.soruMetni=soruMetni;
    }
    public String getSoruMetin(){
        return soruMetni;
    }
    
    public void setSoruPuani(byte soruPuani){
        this.soruPuani=soruPuani;
    }
    public byte getSoruPuani(){
        return soruPuani;
    }
    
    public void setSoruDerecesi(String soruDerecesi){
        this.soruDerecesi=soruDerecesi;
    }
    public String getSoruDerecesi(){
        return soruDerecesi;
    }
    
    
    
    
    @Override
    public String toString() {
		return "Soru Metni: " + soruMetni+", Soru Puani: "+soruPuani+", Soru Derecesi: "+soruDerecesi;
	}
    
    
    
}


