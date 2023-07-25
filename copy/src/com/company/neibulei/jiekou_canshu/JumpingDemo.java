package com.company.neibulei.jiekou_canshu;

/*
* 将一个对象作为参数传递给另一个类的方法通常在以下场景下是适用的：

依赖注入（Dependency Injection）：依赖注入是一种设计模式，用于将一个类所依赖的对象通过构造函数、方法参数或属性注入到该类中。
* 这种方式可以实现类之间的解耦，提高代码的灵活性和可测试性。通过将一个对象作为参数传递给另一个类的方法，可以方便地将依赖的对象注入到目标类中。

回调函数（Callback Functions）：有时候，一个类需要将某些操作委托给另一个类或对象来执行，并在特定事件发生时调用回调函数。
* 将需要执行的回调函数作为参数传递给目标类的方法可以实现这种机制。

委托/代理模式（Delegation/Proxy Pattern）：委托或代理模式是一种结构性设计模式，其中一个类将任务委托给另一个类来完成。
* 通过将被委托的对象作为参数传递给目标类的方法，可以实现委托或代理模式。

接口实现（Interface Implementation）：如果一个类实现了某个接口或继承了某个抽象类，那么它需要提供相应的方法实现。
* 在这种情况下，另一个对象可以作为参数传递给目标类的方法，以满足接口的要求。

总的来说，将一个对象作为参数传递给另一个类的方法适用于需要依赖注入、回调函数、委托/代理模式或接口实现的情况。
* 这种方式可以增强代码的可扩展性、灵活性和可测试性，同时减少类之间的紧耦合关系。
* */

public class JumpingDemo {
    public static void main(String[] args) {

        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();

        jo.useJumping(j);

        Jumping j2 = jo.getJumping();
        j2.jump();

    }
}
