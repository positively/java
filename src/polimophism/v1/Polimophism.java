package polimophism.v1;

import java.util.ArrayList;
import java.util.List;

public class Polimophism {
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("misha"));
        animals.add(new Dog("grut"));
        animals.forEach((Animal::voice));

        Animal a1 = new Cat("misha");
        Animal a2 = new Dog("grut");

    }
}
