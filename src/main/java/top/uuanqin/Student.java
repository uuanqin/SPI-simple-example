package top.uuanqin;

public class Student {
    public String name;

    private Integer id;

    public Student() {
        this("unset", 0);
    }

    public Student(String name, Integer id) {
        super();
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void sayHello() {
        System.out.println("hello my name is " + this.name);
    }

    public void sayLocation(String location, int num) {
        System.out.println("I am in " + location + " " + num);
    }
}
