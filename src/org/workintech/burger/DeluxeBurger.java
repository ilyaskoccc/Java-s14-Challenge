package org.workintech.burger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe Burger", 19.10, "Double Sandwich");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.25);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("Name: " + this.name);
        System.out.println("Meat: Double");
        System.out.println("BreadRollType: Double Sandwich");
        System.out.println("Price: " + super.itemizeHamburger());
        return super.itemizeHamburger();
    }
}
