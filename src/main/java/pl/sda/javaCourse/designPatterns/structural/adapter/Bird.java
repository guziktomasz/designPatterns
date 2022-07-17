package pl.sda.javaCourse.designPatterns.structural.adapter;

public interface Bird {
    void fly();
    String getSound();

    default void makeSound() {
        System.out.println(getSound());
    }
}
