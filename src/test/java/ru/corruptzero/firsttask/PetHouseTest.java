package ru.corruptzero.firsttask;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetHouseTest {

    @Test
    public void testTalkToAllPets() {
        PetHouse petHouse = new PetHouse();
        petHouse.addPet(new Cat());
        petHouse.addPet(new Dog());

        assertEquals("Meow! Woof!", petHouse.talkToAllPets());
    }
}

