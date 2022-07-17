package pl.sda.javaCourse.designPatterns.structural.adapter;

public interface ToyDuck {

    String getSqueakSound();

    default void squek(){
        System.out.println(getSqueakSound());
    }

}


