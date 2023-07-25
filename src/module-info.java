import leijiazaiqi24.Student;
import leijiazaiqi24.important;
module practice {
    exports leijiazaiqi24;
    exports lambda22;
}

/**
 * module myone exports com.itheima01; exports com.itheima03;
 * module 是用来定义模块的关键字。myone 是模块的名称。exports 关键字用于声明模块中哪些包是对外可见的，
 * 可以被其他模块访问。在这里，模块 myone 对外可见的包有 com.itheima01 和 com.itheima03。
 *
 * provides MyService with Czxy; provides MyService with Itheima;
 * 这两行使用了 provides 关键字，用于指定服务接口 MyService 的实现类。
 * 在这里，模块 myone 提供了两个不同的实现类：Czxy 和 Itheima。
 * 当其他模块需要使用 MyService 服务时，可以通过 ServiceLoader API 来获取这些实现类的实例。
 *
 *ServiceLoader<MyService> myServices = ServiceLoader,load(MyService.class);
 * //遍历服务for(MyService my : myServices) [/调用接口中的方法
 * my.service();
 * }
 * */
