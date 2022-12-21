@java.lang.Override
final java.util.Collection<org.matsim.core.mobsim.qsim.interfaces.MobsimVehicle> getAllVehicles() {
    java.util.Collection<org.matsim.core.mobsim.qsim.interfaces.MobsimVehicle> vehicles = new java.util.ArrayList<>();
    try {
        vehicles.addAll(buffer);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    vehicles.addAll(vehQueue);
    return vehicles;
}
