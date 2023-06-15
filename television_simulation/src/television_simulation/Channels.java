package television_simulation;


class Channels {
    
    private String name,channelNo;

    public Channels(String name, String channelNo) {
        this.name = name;
        this.channelNo = channelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " , ChannelNo: " + channelNo +" niteliklerine sahip olan kanal oluşturuldu."+ '}';
    }
    
    
}
