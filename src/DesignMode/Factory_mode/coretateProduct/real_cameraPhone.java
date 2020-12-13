package DesignMode.Factory_mode.coretateProduct;

import DesignMode.Factory_mode.Product.cameraPhone;

public class real_cameraPhone implements cameraPhone {
    @Override
    public void show() {
        System.out.println("摄影手机上市了");
    }
}
