package org.example.models;

public class DeluxeBurger extends Hamburger{
    private final String cips = "CURVY";
    private final String drink = "COKE";

    public DeluxeBurger(String name, String meat, String breadRolType) {
        super(name, meat, 19.10, breadRolType);

    }

    public DeluxeBurger() {
        super.setName("Deluxe Burger");
        super.setMeat("Double");
        super.setBreadRollType("Double Sandwich");
        super.setPrice(19.10);
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addName, double addPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addName, double addPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addName, double addPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addName, double addPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        System.out.println(
                "Name: " + getName() + '\n' +
                "Meat: " + getMeat() + '\n' +
                "BreadRollType: " + getBreadRollType()+'\n' +
                "Price: " + getPrice());
    }
}
