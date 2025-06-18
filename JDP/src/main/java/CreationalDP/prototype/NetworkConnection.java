package CreationalDP.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NetworkConnection implements Cloneable{
    String ipAddress;
    String url;
    List<Integer> packetList=new ArrayList<>();

    public NetworkConnection(String ipAddress, String url,List<Integer> packetList) {
        this.ipAddress=ipAddress;
        this.url=url;
        this.packetList=packetList;
    }
    @Override
    public NetworkConnection clone(){
        return new NetworkConnection(this.ipAddress,this.url,this.packetList);
    }
    public void showDetails(){
        System.out.println("ipAddress: "+this.ipAddress+", url: "+this.url+", packetList: "+this.packetList);
    }
}
