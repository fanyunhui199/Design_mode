package DesignMode.Factory_mode.coretateProduct;

import DesignMode.Factory_mode.Product.oldPhone;

public class real_oldPhone implements oldPhone {
    @Override
    public void show() {
        System.out.println("老年机上市了");
    }
}
