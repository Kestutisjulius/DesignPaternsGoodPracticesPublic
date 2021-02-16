package home_work.colors_list;

public class Raktas {
    private String name;
    private int doorNr;

    public Raktas(String name, int doorNr) {
        this.name = name;
        this.doorNr = doorNr;
    }
    public Raktas (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoorNr() {
        return doorNr;
    }

    public void setDoorNr(int doorNr) {
        this.doorNr = doorNr;
    }

    @Override
    public String toString() {
        return "Raktas{" +
                "name='" + name + '\'' +
                ", doorNr=" + doorNr +
                '}';
    }
}
