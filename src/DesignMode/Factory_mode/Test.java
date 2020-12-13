package DesignMode.Factory_mode;

import DesignMode.Factory_mode.coretateFactory.cameraPhone_realFactory;
import DesignMode.Factory_mode.coretateFactory.maxPhone_realFactory;
import DesignMode.Factory_mode.coretateFactory.oldPhone_realFactory;
import DesignMode.Factory_mode.coretateProduct.real_cameraPhone;
import DesignMode.Factory_mode.coretateProduct.real_maxPhone;
import DesignMode.Factory_mode.coretateProduct.real_oldPhone;

public class Test {
    public static void main(String[] args) {
        cameraPhone_realFactory cameraPhone_realFactory =new cameraPhone_realFactory();
        real_cameraPhone real_cameraPhone =new real_cameraPhone();

        maxPhone_realFactory maxPhone_realFactory=new maxPhone_realFactory();
        real_maxPhone real_maxPhone=new real_maxPhone();


        oldPhone_realFactory oldPhone_realFactory=new oldPhone_realFactory();
        real_oldPhone real_oldPhone =new real_oldPhone();


        oldPhone_realFactory.bujian();
        oldPhone_realFactory.zuzhuang();
        real_oldPhone.show();
        System.out.println("\n");

        cameraPhone_realFactory.bujian();
        cameraPhone_realFactory.zuzhuang();
        real_cameraPhone.show();
        System.out.println("\n");

        maxPhone_realFactory.bujian();;
        maxPhone_realFactory.zuzhuang();
        real_maxPhone.show();
        System.out.println("\n");


    }
}
