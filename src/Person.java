import com.sun.deploy.util.StringUtils;

public class Person {
    Person(){
        name = "NoName";
    }



    String name;
    private Integer age;


    void sayMyName(){
        System.out.println("My name is = "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null && name.length() < 0){
            throw new RuntimeException("Cant set empty name");
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}