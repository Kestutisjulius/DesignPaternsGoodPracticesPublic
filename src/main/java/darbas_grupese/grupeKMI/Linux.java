package darbas_grupese.grupeKMI;

public class Linux extends OS{

    private boolean openSource;
    private String linuxName;


    public Linux(String name, int price, boolean openSource, String linuxName) {
        super(name, price);
        this.openSource = openSource;
        this.linuxName = linuxName;
    }

    public boolean isOpenSource() {
        return openSource;
    }

    public void setOpenSource(boolean openSource) {
        this.openSource = openSource;
    }

    public String getLinuxName() {
        return linuxName;
    }

    public void setLinuxName(String linuxName) {
        this.linuxName = linuxName;
    }

    @Override
    public String toString() {
        return "Linux{" +
                "openSource=" + openSource +
                ", linuxName='" + linuxName + '\'' +
                "} " + super.toString();
    }
}
