package ru.corruptzero.firsttask;

import java.util.ArrayList;
import java.util.List;

public class PetHouse {
    private final List<IPet> pets;

    public PetHouse() {
        pets = new ArrayList<>();
    }

    public void addPet(IPet pet) {
        pets.add(pet);
    }

    public String talkToAllPets() {
        StringBuilder sb = new StringBuilder();
        for (IPet pet : pets) {
            sb.append(pet.talkToOwner()).append(" ");
        }
        return sb.toString().trim();
    }
}

