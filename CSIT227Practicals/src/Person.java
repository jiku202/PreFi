public abstract class Person {
    // TODO implement Person and its subclasses in other Java files
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Hello, my name is "+getName()+".";
    }
}
