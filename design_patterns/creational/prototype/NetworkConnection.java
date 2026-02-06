package design_patterns.creational.prototype;

public class NetworkConnection implements Cloneable{    // implements Cloneable tells java that this class can be cloned

    private String ip;
    private String importData;

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

    public void loadVeryImportantData() throws InterruptedException {
        this.importData = "this is very important data";
        Thread.sleep(2000);
        // it will take 5 minutes to create important data
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importData='" + importData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
