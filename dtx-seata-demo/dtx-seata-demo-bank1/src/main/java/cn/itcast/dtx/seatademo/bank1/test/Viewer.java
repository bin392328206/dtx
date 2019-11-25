package cn.itcast.dtx.seatademo.bank1.test;


import java.util.Observable;
import java.util.Observer;

public class Viewer implements Observer {


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("copy that you had been changed ...");
    }
}
