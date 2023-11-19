package FactoryMethod.pattern;

import FactoryMethod.pattern.os.OS;

public abstract class Laptop {
    public OS OS(){
        OS os = installedOS();
        os.install();
        return os;
    }

    public abstract OS installedOS();
}
