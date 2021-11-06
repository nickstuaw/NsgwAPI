package xyz.nsgw.NsgwAPI;

public class Cat {

    private String name;
    private int age;
    private boolean fast;

    public Cat(String name, int age, boolean fast) {
        this.name = name;
        this.age = age;
        this.fast = fast;
    }

    public void print() {
        System.out.println(this.name + " is a cat, age " + this.age + " and " + (this.fast?"is":"is not") + " fast.");
    }

}