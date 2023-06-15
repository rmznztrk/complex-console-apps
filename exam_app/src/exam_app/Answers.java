
package exam_app;


public class Answers{

    private String a,b,c,d,e;
    private String soruCevabi;

    public Answers() {
        
    }
    
    public void setA(String a){
        this.a=a;
    }
    public String getA(){
        return a;
    }
    
    public void setB(String b){
        this.b=b;
    }
    
    public String getB(){
        return b;
    }
    
    public void setC(String c){
        this.c=c;
    }
    public String getC(){
        return c;
    }
    
    public void setD(String d){
        this.d=d;
    }
    public String getD(){
        return d;
    }
    
    public void setE(String e){
        this.e=e;
    }
    public String getE(){
        return e;
    }
    
    public void setSoruCevabi(String soruCevabi){
        this.soruCevabi=soruCevabi;
    }
    public String getSoruCevabi(){
        return soruCevabi;
    }
    
    @Override
    public String toString() {
		return " |a sikki: " +a +"| |b sikki: "+b+"| |c sikki: "+c+"| |d sikkiı: "+d+"| |e sikki: "+e+"| ve ***CEVAP: "+soruCevabi;
	}
        
   }

