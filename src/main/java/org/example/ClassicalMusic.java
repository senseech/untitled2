package org.example;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit() { System.out.println("Doing my init"); }

    public void doMyDestroy(){
        System.out.println("Doing my destr");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
