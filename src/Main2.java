public class Main2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Rostik");

        Person person2 = new Person();
        person2.setName("Kostik");

        person1.sayMyName();
        person2.sayMyName();

        System.out.println(sayHello("lol"));

    }

    static String sayHello(String name){
        return "hello1111 " + name;
    }
}
