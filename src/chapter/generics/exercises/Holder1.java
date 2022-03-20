package chapter.generics.exercises;

class Automobile {
}

public class Holder1 {
    private Automobile automobile;

    public Holder1(Automobile automobile) {
        this.automobile = automobile;
    }

    Automobile getAutomobile() {
        return this.automobile;
    }
}
