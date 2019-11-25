package cn.itcast.dtx.seatademo.bank1.test;

import java.util.Observable;

public class Model extends Observable {

    // 被观察者改变
    public void change(Object object){

        //在这里面 新增用户

        System.out.println("Model has been changed...");
        // 对象改变,不设置不会触发notifyObservers()方法
        setChanged();
        // 通知监控者
        notifyObservers();
    }

}
