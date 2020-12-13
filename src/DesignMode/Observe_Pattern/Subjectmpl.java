package DesignMode.Observe_Pattern;

import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

public class Subjectmpl implements Subject {



    //创建集合用来存放观察者对象
    List<Observer> mObserverList;



    public void ConcreteSubject() {
        mObserverList = new LinkedList<>();
    }

    //注册观察者，也就是将观察者放到集合中
    @Override
    public void registerObserver(Observer observer) {
        mObserverList.add(observer);

    }


    //移除观察者，也就是将观察者从集合中移除
    @Override
    public void removeObserver(Observer observer) {
        mObserverList.remove(observer);

    }


    //状态改变，通知观察者
    @Override
    public void notifyObserver(String message) {
        //遍历通知所有观察者
        for(int i =0;i<mObserverList.size();i++){
            //此处进行了强转
            mObserverList.get(i).update((ConcreteObserver)mObserverList.get(i),message);
        }

    }


    /**
     * 通知内容
     * @param message
     */
    public void sendMessage(String message){
        notifyObserver(message);
    }


}
