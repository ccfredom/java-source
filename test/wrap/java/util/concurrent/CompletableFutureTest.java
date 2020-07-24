package wrap.java.util.concurrent;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.CompletableFuture;

class CompletableFutureTest {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(String::new);
    }
}