package com.eli.template;

/**
 * Created by pekah on 2016/10/24.
 * 模板方法模式
 */
public abstract class CaffeineBeverageWithHook {
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //钩子
    boolean customerWantsCondiments(){
        return true;
    }
}

