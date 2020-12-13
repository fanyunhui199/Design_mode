package DesignMode.Observe_Pattern;

public class Observe_Test {
    //创建主题实例


    //创建观察者
    ConcreteObserver Administrator =new ConcreteObserver("管理员","记录");
    ConcreteObserver Workers =new ConcreteObserver("工人","核查");
    Subjectmpl subjectmpl=new Subjectmpl();
   /*subjectmpl.registerObserver("Administrator");
     subjectmpl.registerObserver("Workers");

     subjectmpl.notifyObserver("生产线路出现了问题！！！");*/


}
