package ru.corruptzero.firsttask;

public class Dog implements IPet{
    @Override
    public String talkToOwner() {
        return "Woof!";
    }
}
