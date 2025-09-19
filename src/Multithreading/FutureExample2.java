package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample2 {
    public static void main(String[] args) throws ExecutionException ,InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> "Hello");
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("Task is done");
        }
        executorService.shutdown();
    }
}
