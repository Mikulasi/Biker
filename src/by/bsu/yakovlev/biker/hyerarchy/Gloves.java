package by.bsu.yakovlev.biker.hyerarchy;

    public class Gloves extends Ammunition {
    private boolean isProtected;
    private AmmunitionMaterial ammunitionMaterial;
    public Gloves(int price, double weight, String companyName, String color,
                  AmmunitionMaterial ammunitionMaterial, boolean isProtected){
        super(price,weight,companyName,color);
        this.isProtected = isProtected;
        this.ammunitionMaterial = ammunitionMaterial;
    }

    public boolean getIsProtected(){
        return isProtected;
    }
    public void setIsProtected(boolean isProtected){
        this.isProtected = isProtected;
    }
    public AmmunitionMaterial getAmmunitionMaterial(){
        return ammunitionMaterial;
    }
    public String toString(){
        return "Gloves price: " + getPrice()+ ",Gloves weight: "+ getWeight() + ",Gloves company name: "+ getCompanyName()+
                ",Gloves color: " +getColor()+ "Gloves material: " + getAmmunitionMaterial()+
                ",Gloves protect availability " + getIsProtected();
    }
}
