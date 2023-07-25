package com.company.neibulei;

public class CatDemo {

    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();

        co.usecat(c);
        Animal animal = co.getCat();
        animal.eat();
        System.out.println(c==animal);
    }
}
