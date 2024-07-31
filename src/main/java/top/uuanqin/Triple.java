package top.uuanqin;

public class Triple {
    // 这里的triple是静态字段。如果去掉static，调用getInstance时就会陷入无限循环
    private  Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };
    private int id;

    private Triple(int id) {
        System.out.println(
                "The instance " + id + " is created.");
        this.id = id;
    }

    public  Triple getInstance(int id) {
        return triple[id];
    }

    @Override
    public String toString() {
        return "[Triple id=" + id + "]";
    }
}