package ru.corruptzero.firsttask;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {

    @Test
    public void testCatTalkToOwner() {
        IPet cat = new Cat();
        assertEquals("Meow!", cat.talkToOwner());
    }

    @Test
    public void testDogTalkToOwner() {
        IPet dog = new Dog();
        assertEquals("Woof!", dog.talkToOwner());
    }
}

