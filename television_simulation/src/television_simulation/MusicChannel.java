
package television_simulation;



public class MusicChannel extends Channels{
    
    private String musicType;
    
    public MusicChannel(String name, String channelNo,String musicType) {
        super(name, channelNo);
        this.musicType = musicType;
    }
    
    @Override
    public String toString() {
        return "Name: " + getName() + " , ChannelNo: " + getChannelNo() +" , Music-Type: "+musicType ;
    }
    
}
