package DesignMode.Observe_Pattern;

interface Observer {
    /**
     * 描述:抽象观察者
     */
        /**
         * 当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
         * @param message 通知内容
         */
        void update(ConcreteObserver observer,String message);

}
