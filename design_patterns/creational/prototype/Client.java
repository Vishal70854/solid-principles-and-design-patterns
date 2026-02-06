package design_patterns.creational.prototype;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using Prototype Design Pattern");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.163.1.2");
        networkConnection.loadVeryImportantData();


        // we want clone object of NetworkConnection
        try {
            // by default networkConnection.clone() will do a shallow copy() cloning
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();

            System.out.println(networkConnection);
            // lets try removing something from networkConnection alon
            networkConnection.getDomains().remove(0);
            System.out.println("removed 1st domain from domains for implementing deep copy \n" + networkConnection);

            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
       } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


/*
* Prototype Design Pattern
* The concept is to copy an existing object rather than creating a new instance from scratch because creating new object may be costly
* The approach saves costly resources and time, especially when object creating is a heavy process.
*
 */