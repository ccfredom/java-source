package wrap.java.util.concurrent;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class CompletableFutureTest {


    public static void main(String[] args) {
        CompletableFuture<String> c = CompletableFuture.supplyAsync(String::new);

        c.thenAccept((t) -> {
            System.out.println(t);
        });

    }
}