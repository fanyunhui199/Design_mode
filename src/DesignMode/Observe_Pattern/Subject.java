package DesignMode.Observe_Pattern;

import java.util.Observer;

interface Subject {
    /**
     * 描述:抽象主题(抽象被观察者)
     */
        /**
         * 注册观察者
         * @param observer 观察者
         */
        void registerObserver(Observer observer);

        /**
         * 移除观察者
         * @param observer 观察者
         */
        void removeObserver(Observer observer);

        /**
         * 在状态发生变化通知观察者
         */
        void notifyObserver(String message);

}
