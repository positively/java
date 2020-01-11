package polimophism.v1;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(
                String.format(
                        "polimophism.v1.Animal [%s] says: %s",
                        getName(), "MEOW-MEOW"));
    }
}
