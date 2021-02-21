package darbas_grupese.grupeKMI;

public class Windows extends OS{

    private String version;

    public Windows(String name, int price, String version) {
        super(name, price);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "version='" + version + '\'' +
                "} " + super.toString();
    }
}
