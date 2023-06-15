
package television_simulation;


public class NewsChannel extends Channels{
    
    private String newsChannelType;
    
    public NewsChannel(String name,String channelNo,String newsChannelType) {
        
        super(name, channelNo);
        this.newsChannelType = newsChannelType;
    
    }
    
        @Override
    public String toString() {
        return "Name: " + getName() + " , ChannelNo: " + getChannelNo() +" , News-Type: "+newsChannelType;
    }
    
}
