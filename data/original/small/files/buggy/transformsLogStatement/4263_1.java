@java.lang.Override
final java.util.Collection<org.matsim.core.mobsim.qsim.interfaces.MobsimVehicle> getAllVehicles() {
    java.util.Collection<org.matsim.core.mobsim.qsim.interfaces.MobsimVehicle> vehicles = new java.util.ArrayList<>();
    vehicles.addAll(vehQueue);
    System.out.println("log");
    vehicles.addAll(buffer);
    return vehicles;
}
