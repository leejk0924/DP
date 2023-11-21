package builder.computer;

public class Computer {
    //    보조 기억장치
    private String auxiliaryStorage;
    // 주기억장치
    private String mainMemory;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder builder) {
        this.auxiliaryStorage = builder.auxiliaryStorage;
        this.mainMemory = builder.mainMemory;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "auxiliaryStorage='" + auxiliaryStorage + '\'' +
                ", mainMemory='" + mainMemory + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder {
        private String auxiliaryStorage;
        private String mainMemory;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String auxiliaryStorage, String mainMemory) {
            this.auxiliaryStorage = auxiliaryStorage;
            this.mainMemory = mainMemory;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
