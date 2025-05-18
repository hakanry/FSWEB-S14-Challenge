package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRolType) {
        super(name, "Tofu", price, breadRolType);
    }
    public void addHealthyAddition1(String name, double price){
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        setPrice(getPrice()+price);
    }
    public void addHealthyAddition2(String name, double price){
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        setPrice(getPrice()+price);
    }




    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + getName() + '\n' +
                "Meat: " + getMeat() + '\n' +
                "BreadRollType: " + getBreadRollType()+'\n' +
                (getAddition1Name() == null ? "" : "Addition1: " + getAddition1Name()+'\n' )+
                (getAddition2Name() == null ? "" : "Addition2: " + getAddition2Name()+'\n' )+
                (getAddition3Name() == null ? "" : "Addition3: " + getAddition3Name()+'\n' )+
                (getAddition4Name() == null ? "" : "Addition4: " + getAddition4Name()+'\n' )+
                (healthyExtra1Name == null ? "" : "HealthyAddition1: " + healthyExtra1Name+'\n' )+
                (healthyExtra2Name == null ? "" : "HealthyAddition2: " + healthyExtra2Name+'\n' )+

                "Price: " + (getPrice()));
    }
}
