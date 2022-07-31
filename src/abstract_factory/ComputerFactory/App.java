package abstract_factory.ComputerFactory;

public class App {
    public static void main(String[] args) {
        // 第一步就要选定一个“大厂”
        ComputerFactory amd = new AMDFactory();
        ComputerFactory intel = new IntelFactory();

        CPU amdCpu = amd.makeCPU();
        MainBoard amdMainBoard = amd.makeMainBoard();
        HardDisk amdHardDisk = amd.makeHardDisk();


        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
        Computer comp = new Computer(amdCpu, amdHardDisk, amdMainBoard);

    }
}
