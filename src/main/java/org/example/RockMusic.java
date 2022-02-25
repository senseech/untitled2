package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class RockMusic implements Music{
    ArrayList arrayList = new ArrayList();
    Random random = new Random();
    @Override
    public String getSong() {
        arrayList.add("Wind cries Mery");
        arrayList.add("Californication");
        arrayList.add("Road 66");

        return String.valueOf(arrayList.get(random.nextInt(3)));
    }
}
