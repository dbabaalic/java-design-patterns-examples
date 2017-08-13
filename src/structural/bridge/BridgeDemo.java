package structural.bridge;

import structural.bridge.with.DieselEngine;
import structural.bridge.with.Engine;
import structural.bridge.with.MonoRail;
import structural.bridge.with.Train;
import structural.bridge.without.ElectricMonoRail;
import structural.bridge.without.TrainWithoutBridge;

public class BridgeDemo
{
    public static void main( String[] args ) {
    	
    	// Without bridge
        TrainWithoutBridge electricMonorail = new ElectricMonoRail();
        electricMonorail.move();

        // With bridge
        Train monoRail = new MonoRail();
        Engine dieselEngine = new DieselEngine();
        monoRail.move(dieselEngine);
        
    }

}
