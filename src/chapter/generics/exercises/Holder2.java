package chapter.generics.exercises;

public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return this.a;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile) holder2.get();
        holder2.set("Not an automobile");
        String s = (String) holder2.get();
        holder2.set(2);
        Integer x = (Integer) holder2.get();
    }

}
