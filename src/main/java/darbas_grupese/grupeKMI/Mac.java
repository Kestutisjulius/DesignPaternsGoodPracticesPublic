package darbas_grupese.grupeKMI;

public class Mac extends OS {

    private boolean haveSecurity;
    private boolean haveCloud;




    public Mac(String name, int price, boolean haveSecurity, boolean haveCloud) {
        super(name, price);
        this.haveSecurity = haveSecurity;
        this.haveCloud = haveCloud;

    }

    public boolean isHaveSecurity() {
        return haveSecurity;
    }

    public void setHaveSecurity(boolean haveSecurity) {
        this.haveSecurity = haveSecurity;
    }

    public boolean isHaveCloud() {
        return haveCloud;
    }

    public void setHaveCloud(boolean haveCloud) {
        this.haveCloud = haveCloud;
    }

    @Override
    public String toString() {
        return "Mac{" +
                "haveSecurity=" + haveSecurity +
                ", haveCloud=" + haveCloud +
                "} " + super.toString();
    }
}
