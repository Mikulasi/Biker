package by.bsu.yakovlev.biker.hyerarchy;

public abstract class Ammunition implements Comparable {
    private int price;
    private double weight;
    private String companyName;
    private String color;


    Ammunition(int price, double weight, String companyName, String color) {
        if (price < 0) throw new RuntimeException("Price couldn't be less than zero!");
        this.price = price;
        this.weight = weight;
        this.companyName = companyName;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Price: " + getPrice() + ",Weight: " + getWeight() + ", Company name: " + getCompanyName() +
                ", Color: " + getColor();
    }

    @Override
    public int compareTo(Object obj) {
        Ammunition ammunition = (Ammunition) obj;
        int compare = Double.valueOf(weight).compareTo(Double.valueOf(ammunition.getWeight()));

        return compare;

    }
}
