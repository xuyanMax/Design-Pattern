package abstract_factory.ComputerFactory;

public interface ComputerFactory {
    CPU makeCPU();

    HardDisk makeHardDisk();

    MainBoard makeMainBoard();
}
