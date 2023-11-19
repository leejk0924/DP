package FactoryMethod.pattern;

import FactoryMethod.pattern.os.Linux;
import FactoryMethod.pattern.os.OS;

public class LinuxUserLaptop extends Laptop{
    @Override
    public OS installedOS() {
        return new Linux();
    }
}
