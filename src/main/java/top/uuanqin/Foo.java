package top.uuanqin;

public class Foo<T> {
    private T name;
    public Foo(T name) {
        this.name = name;

    }

    public static <T> Foo<T> create(T name){
        return new Foo<>(name);
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}