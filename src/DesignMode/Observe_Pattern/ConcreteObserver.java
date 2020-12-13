package DesignMode.Observe_Pattern;

import java.util.Observable;

public class ConcreteObserver extends Observable implements Observer {
    private static final String TAG = "ConcreteObserver";
    //人员
    String name;
    //动作
    String Measures;

    public ConcreteObserver(String name, String Measures) {
        this.name = name;
        this.Measures = Measures;
    }



    @Override
    public void update(ConcreteObserver observer, String message) {
        System.out.println(message);
        System.out.println(observer.name +"负责"+ observer.Measures);
    }
}
