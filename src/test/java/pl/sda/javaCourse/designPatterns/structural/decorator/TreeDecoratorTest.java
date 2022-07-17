package pl.sda.javaCourse.designPatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeDecoratorTest {

    @Test
    void shouldBeDecoratedWithGarland() {
        ChristmasTreeImp nakedTree = new ChristmasTreeImp();
        ChristmassTree treeWithGarland = new Garland(nakedTree);

        String decorate = treeWithGarland.decorate();

        System.out.println(decorate);

        assertEquals("Christmas treewith garland", decorate);
    }
}