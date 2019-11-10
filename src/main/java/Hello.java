import java.util.concurrent.atomic.AtomicInteger;

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world!!!");
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();
    }
}
