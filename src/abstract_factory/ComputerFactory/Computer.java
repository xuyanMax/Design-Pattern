package abstract_factory.ComputerFactory;

public class Computer {
    CPU cpu;
    HardDisk hardDisk;
    MainBoard mainBoard;

    public Computer(CPU cpu, HardDisk hardDisk, MainBoard mainBoard) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.mainBoard = mainBoard;
    }


}
