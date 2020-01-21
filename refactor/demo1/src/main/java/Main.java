import Controller.Controller;
import Model.Parser;
import Model.UMCarroJa;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        double[] before = EnergyCheckUtils.getEnergyStats();
        long init_time = System.currentTimeMillis();

        UMCarroJa model = new UMCarroJa();
        try {
            model = UMCarroJa.read(".tmp");
            System.out.println("adasdsada1");
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("adasdsada2");
            new Parser(args[0], model);
        }

        long end_time = System.currentTimeMillis();
        double[] after = EnergyCheckUtils.getEnergyStats();

        long final_time = end_time - init_time;
        System.out.println("Energy consumption of dram: " + (after[0] - before[0])+ " Energy consumption of cpu: " + (after[1] - before[1])+ " Energy consumption of package: " + (after[2] - before[2]));
        System.out.println("Time of execution: " + final_time + " ms.");
        /*
        try { Thread.sleep(10000);} catch (Exception e) {}
        new Controller(model).run();
        try {
            model.save(".tmp");
        }
        catch (IOException ignored) {}
        */
    }
}