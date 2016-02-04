package main.java.org.usfirst.frc.team1360.robot.autonomous.actions;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import main.java.org.usfirst.frc.team1360.robot.util.CommandData;
import main.java.org.usfirst.frc.team1360.robot.util.Subsystems;

/**
 * AutonomousExampleCommand - Does XXY Function on XXY Subsystem
 */
public class AutonomousExampleCommand extends Command
{
    private double left;
    private double right;
    private boolean toggle;
    
    

    public AutonomousExampleCommand(CommandData commandData)
    {
        left = commandData.getDoubles().get("left");
        right = commandData.getDoubles().get("right");
        toggle = commandData.getBooleans().get("toggle");
        requires(Subsystems.DRIVE_SUBSYSTEM);
    }

    public AutonomousExampleCommand(double left, double right, boolean toggle)
    {

    }
    public AutonomousExampleCommand()
    {

    }

    @Override
    protected void initialize()
    {
    	
    }

    @Override
    protected void execute()
    {
    	Subsystems.DRIVE_SUBSYSTEM.tankDrive(0.1, 0.1);
    	Timer.delay(10);
    	Subsystems.DRIVE_SUBSYSTEM.tankDrive(0, 0);
    	Timer.delay(60);
    }

    @Override
    protected boolean isFinished()
    {
        return false;
    }

    @Override
    protected void end()
    {

    }

    @Override
    protected void interrupted()
    {

    }
}
