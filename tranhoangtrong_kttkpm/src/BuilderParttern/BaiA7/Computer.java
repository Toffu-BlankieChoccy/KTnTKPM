package BuilderParttern.BaiA7;

public class Computer {
    private String CPU,RAM,Screen,HotDisk;

    public Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Screen = builder.Screen;
        this.HotDisk = builder.HotDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + this.CPU + '\'' +
                ", RAM='" + this.RAM + '\'' +
                ", Screen='" + this.Screen + '\'' +
                ", HotDisk='" + this.HotDisk + '\'' +
                '}';
    }

    public static class Builder{
        private String CPU,RAM,Screen,HotDisk;

        Builder setCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        Builder setRam(String ram){
            this.RAM = ram;
            return this;
        }
        Builder setScreen(String screen){
            this.Screen = screen;
            return this;
        }
        Builder setHotDisk(String hotDisk){
            this.HotDisk = hotDisk;
            return this;
        }

        public Computer build()
        {
            return new Computer(this);
        }

    }
}
