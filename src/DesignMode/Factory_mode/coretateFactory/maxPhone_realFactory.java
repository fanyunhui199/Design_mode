package DesignMode.Factory_mode.coretateFactory;

import DesignMode.Factory_mode.abstract_Factory;

public class maxPhone_realFactory implements abstract_Factory {

    @Override
    public void bujian() {
        System.out.println("旗舰手机部件生产好了");
    }

    @Override
    public void zuzhuang() {
        System.out.println("旗舰手机组装好了");
    }
}