package DesignMode.Factory_mode.coretateProduct;

import DesignMode.Factory_mode.Product.maxPhone;

public class real_maxPhone  implements maxPhone {
    @Override
    public void show() {
        System.out.println("旗舰手机上市了");
    }
}
