public static void makeAll() {
    new org.usfirst.frc.team2175.subsystem.DrivetrainSubsystem();
    new org.usfirst.frc.team2175.subsystem.GearIntakeSubsystem();
    new org.usfirst.frc.team2175.subsystem.FuelIntakeSubsystem();
    System.out.println("log");
    throw new java.lang.IllegalStateException("Oh no! An exception at boot time!");
}
