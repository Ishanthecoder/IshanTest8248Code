package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard; 
import edu.wpi.first.wpilibj.*;

public class PDPtest {

PowerDistributionPanel testPDP = new PowerDistributionPanel(0);

public double testV = testPDP.getVoltage();

public void PDPinit(){
    testPDP.clearStickyFaults();
}

public void PDPperiodic(){

    SmartDashboard.putNumber("Voltage", testV);

}
  

       




    
    

   

   


    
}
