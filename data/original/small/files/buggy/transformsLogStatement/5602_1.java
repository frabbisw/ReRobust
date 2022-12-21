public static void updatePilot(com.airmap.airmapsdk.models.pilot.AirMapPilot pilot, @android.support.annotation.Nullable com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    System.out.println("log");
    com.airmap.airmapsdk.networking.services.PilotService.updatePilot(pilot, callback);
}
