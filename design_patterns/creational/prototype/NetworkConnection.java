package design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{    // implements Cloneable tells java that this class can be cloned
    // bydefault clone() does shallow copy()


    private String ip;
    private String importData;
    private List<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportData() {
        return importData;
    }

    public void setImportData(String importData) {
        this.importData = importData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importData = "this is very important data";
        Thread.sleep(2000);
        // it will take 5 minutes to create important data

        domains.add("www.vishal.com");
        domains.add("www.google.com");
        domains.add("www.facebook.com");
        domains.add("www.twitter.com");

    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importData='" + importData + '\'' +
                ", domains='" + domains + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // logic for cloning as deep copy

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setImportData(this.getImportData());

        // this will fetch all domains and save it is a deep copy by creating new list and adding domains
        for(String d : this.getDomains()){
            networkConnection.getDomains().add(d);
        }


        return networkConnection;
    }
}
