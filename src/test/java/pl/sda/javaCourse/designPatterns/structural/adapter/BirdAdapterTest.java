package pl.sda.javaCourse.designPatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdAdapterTest {

    @Test
    void birdShouldBahaveLikeAToyDuck() {
        Bird sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        BirdAdapter birdAdapter = new BirdAdapter(sparrow);

        sparrow.makeSound();
        toyDuck.squek();
        birdAdapter.squek();

        assertEquals(sparrow.getSound(), birdAdapter.getSqueakSound());

    }
}