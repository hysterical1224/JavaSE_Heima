package com.company.neibulei;

public class CatOperator {
    Animal animal;
    public CatOperator(){}
    public CatOperator(Animal cat){
        this.animal = cat;
    }

    public void usecat(Animal cat){
        this.animal = cat;
        cat.eat();
    }

    public Animal getCat(){
        return this.animal;
    }



}
