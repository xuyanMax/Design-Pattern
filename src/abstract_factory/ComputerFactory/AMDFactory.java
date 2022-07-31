package abstract_factory.ComputerFactory;

public class AMDFactory implements ComputerFactory {
    @Override
    public CPU makeCPU() {
        return new IntelCPU();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }
}
