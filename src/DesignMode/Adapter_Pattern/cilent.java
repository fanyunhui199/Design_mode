package DesignMode.Adapter_Pattern;

public class cilent {
    public static void main(String[] args) {
        TypeC_USB usb=new Adaper(new Adaptee_Mcro());
        usb.Charging();
        usb.Reading();
    }
}
