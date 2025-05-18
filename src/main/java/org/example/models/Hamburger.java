package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger() {

    }

    public void addHamburgerAddition1(String addName, double addPrice){
        addition1Name = addName;
        addition1Price = addPrice;
        setPrice(price+addPrice);
    }
    public void addHamburgerAddition2(String addName, double addPrice){
        addition2Name = addName;
        addition2Price = addPrice;
        setPrice(price+addPrice);
    }
    public void addHamburgerAddition3(String addName, double addPrice){
        addition3Name = addName;
        addition3Price = addPrice;
        setPrice(price+addPrice);
    }
    public void addHamburgerAddition4(String addName, double addPrice){
        addition4Name = addName;
        addition4Price = addPrice;
        setPrice(price+addPrice);
    }

    public void itemizeHamburger() {
        System.out.println(
                "Name: " + name + '\n' +
                "Meat: " + meat + '\n' +
                "BreadRollType: " + breadRollType + '\n' +
                (addition1Name == null ? "" : "Addition1: " + addition1Name+'\n' )+
                (addition2Name == null ? "" : "Addition2: " + addition2Name+'\n' )+
                (addition3Name == null ? "" : "Addition3: " + addition3Name+'\n' ) +
                (addition4Name == null ? "" : "Addition4: " + addition4Name +'\n') +
                "Price: " + (price)
                );
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }
}
