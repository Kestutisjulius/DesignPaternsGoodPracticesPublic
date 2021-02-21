package darbas_grupese.grupeKMI;

public class OS implements Comparable<OS>{
    private String name;
    private int price;

    public OS(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(OS o) {
        if (o.getPrice() == this.getPrice()) {
        return 0;
        } else {
            return o.getPrice() > this.getPrice()? 1 : -1;
        }


    }
}
