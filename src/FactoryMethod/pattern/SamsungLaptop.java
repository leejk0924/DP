package FactoryMethod.pattern;

import FactoryMethod.pattern.os.OS;
import FactoryMethod.pattern.os.Windows;

public class SamsungLaptop extends Laptop{
    @Override
    public OS installedOS() {
        return new Windows();
    }
}
