package cn.itcast.dtx.seatademo.bank1.test;

public class Test {

    public static void main(String[] args) {
        Model model = new Model();
        Viewer viewer = new Viewer();
        model.addObserver(viewer);
        model.change(model);
    }
}
