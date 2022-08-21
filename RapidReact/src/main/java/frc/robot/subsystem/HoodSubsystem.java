package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import frc.robot.config.Config;

public class HoodSubsystem extends BitBucketsSubsystem {

    private CANSparkMax motor;

    private final LerpTable<Double, Double> angleTable = new LerpTable<>();
    private final LerpTable<Double, Double> velocityTable = new LerpTable<>();

    private final VisionSubsystem visionSubsystem;


    public HoodSubsystem(Config config, VisionSubsystem visionSubsystem) {
        super(config);
        this.visionSubsystem = visionSubsystem;
    }


    @Override
    public void init() {

    }

    @Override
    public void periodic() {

        double angle = angleTable.get(
                visionSubsystem.distance()
        );

        setAngle(angle);

    }

    @Override
    public void disable() {

    }

    void setAngle(double angle) {
        //TODO

    }
}
