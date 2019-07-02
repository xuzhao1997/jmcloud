package com.kzdata.jmcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * 异步多线程配置
 * @author zhouqi
 * @date 2019-06-26 14:25
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2019-06-26 14:25     zhouqi          v1.0.0           Created
 *
 */
//@Configuration
//@EnableAsync
public class AsyncConfig implements AsyncConfigurer {


    /**
     * 自定义线程池核心线程数
     */
    @Value("${spring.async.threadpool.corePoolSize}")
    private int corePoolSize;

    /**
     * 自定义线程池最大线程数
     */
    @Value("${spring.async.threadpool.maxPoolSize}")
    private int maxPoolSize;

    /**
     * 自定义线程池队列最大线程数
     */
    @Value("${spring.async.threadpool.queueCapacity}")
    private int queueCapacity;



    @Override
    public Executor getAsyncExecutor() {
        //定义线程池
        ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
        //核心线程数
        taskExecutor.setCorePoolSize(this.corePoolSize);
        //线程池最大线程数
        taskExecutor.setMaxPoolSize(this.maxPoolSize);
        //线程队列最大线程数
        taskExecutor.setQueueCapacity(this.queueCapacity);
        //初始化
        taskExecutor.initialize();
        return taskExecutor;
    }
}
