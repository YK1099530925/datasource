package datasuorcetwo.datasource.threadpool;

import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池对象，交给spring的IOC容器
 */
@Component
public class ThreadPoolComponent {
    final static BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);
    private ThreadPoolExecutor executor;
    /**
     * 既然spring管理此bean，那么直接在构造函数中创建线程池用于使用
     */
    public ThreadPoolComponent(){
        executor = new ThreadPoolExecutor(50, 100, 10, TimeUnit.SECONDS,workQueue);
    }

    public ThreadPoolExecutor getExecutor() {
        return executor;
    }
}
