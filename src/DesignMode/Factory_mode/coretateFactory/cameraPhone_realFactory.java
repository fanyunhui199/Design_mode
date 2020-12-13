package DesignMode.Factory_mode.coretateFactory;

import DesignMode.Factory_mode.abstract_Factory;

public class cameraPhone_realFactory implements abstract_Factory {

    @Override
    public void bujian() {
        System.out.println("照相手机组件生产好了");
    }

    @Override
    public void zuzhuang() {
        System.out.println("照相手机组装好了");
    }
}
