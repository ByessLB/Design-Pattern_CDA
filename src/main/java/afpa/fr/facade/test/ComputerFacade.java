package afpa.fr.facade.test;

/**
 * <h3>Façade</h3
 * <p>Simplifie la gestion des sous-systèmes</p>
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive ddr;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.ddr = new HardDrive();
    }

    /**
     * <p>Méthode regroupant les actions opéré au travers des sous-système</p>
     * <p>ici, on représente un démarrage système</p>
     */
    public void startComputer() {
        cpu.start();
        memory.load();
        ddr.read();
        cpu.execute();
    }

    /**
     * <p>Méthode regroupant les actions opéré au travers des sous-système</p>
     * <p>ici, on représente l'arrêt système</p>
     */
    public void stopComputer() {
        cpu.stop();
        memory.free();
    }
}
