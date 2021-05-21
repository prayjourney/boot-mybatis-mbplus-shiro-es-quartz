## 定时任务开整合
1. pom.xml之中添加依赖spring-boot-starter-quartz
2. 在主要启动类之中添加@EnableScheduling注解, 开启定时任务
3. 在方法之中添加@Scheduled注解, 配置corn表达式, 设置定时任务启动的时机
4. 在配置文件application.properties配置spring.task.scheduling.pool.size=x, x是大于1的数值, 线程池默认是单例，可能会不执行



## 定时任务与线程池的问题
#### 定时任务
就是间隔一段时间，就去执行一次
#### 线程池
就是多个线程去执行某一个或者某几个任务，任务可以分成同步类型的，异步类型的。
同步类型的任务，如果耗时很长，就会造成任务执行时候的阻塞，这个时候，有可能导致我们的系统，无法及时响应，所以就需要改造成异步的。此时这个任务，就变成了异步类型的。
当有多个异步任务，或者说对于异步任务，我们一般是让其在线程池之中去执行，所以就需要创建自己的线程池。
那么就同理，如果这个定时任务的工作量很大，时间间隔很短，这个时候系统就来不及响应了，我们就需要让其在线程池之中去执行，也就是定时任务执行时间长，量大，就需要改造成异步的定时任务，防止导致阻塞，多个异步的任务，就需要线程池。