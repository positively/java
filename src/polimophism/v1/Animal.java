package polimophism.v1;

public class Animal {
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;
    void voice(){
        System.out.println("Abstract animals doesn't have voice");
    }
}
