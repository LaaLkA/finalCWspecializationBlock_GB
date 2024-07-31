package util;

public class Counter implements AutoCloseable {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void add() {
        count++;
    }

    public void showCounter(){
        System.out.println(String.format("%d",count));
    }

    @Override
    public void close() {
        if (count == 0) {
            throw new IllegalStateException("Resource not closed properly");
        }
    }
}
