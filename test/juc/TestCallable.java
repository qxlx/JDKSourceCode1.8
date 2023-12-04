package juc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author jiabaobao
 * @date 2023/12/4 9:49 PM
 */
public class TestCallable {

    public static void main(String[] args) {
        Callable<Integer> resultCallable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                return 1 + 1;
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        Future<Integer> resultTask = threadPool.submit(resultCallable);
        System.out.println(resultTask);
    }

}
