package CreationalDP.prototype;

import java.util.Arrays;

public class TestPrototypeMain {
    public static void main(String ar[]){
        NetworkConnection networkConnection=new NetworkConnection("129.5.5.0","http://connectnetwork", Arrays.asList(2,4,3));
        NetworkConnection clonedConnection=networkConnection.clone();


        System.out.println("Main connection object:"+networkConnection.hashCode());
        System.out.println("Cloned connection object:"+clonedConnection.hashCode());

        networkConnection.showDetails();
        clonedConnection.showDetails();

    }
}
