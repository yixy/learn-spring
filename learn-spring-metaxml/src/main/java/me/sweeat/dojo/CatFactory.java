package me.sweeat.dojo;

public class CatFactory {
    public Cat createYellowCat(){
        Cat cat=new Cat();
        cat.setColor("yellow");
        return cat;
    }
    public static Cat createBlackCat(){
        Cat cat=new Cat();
        cat.setColor("black");
        return cat;
    }
}
