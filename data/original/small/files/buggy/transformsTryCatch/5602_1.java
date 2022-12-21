public static void updatePilot(com.airmap.airmapsdk.models.pilot.AirMapPilot pilot, @android.support.annotation.Nullable com.airmap.airmapsdk.networking.callbacks.AirMapCallback<com.airmap.airmapsdk.models.pilot.AirMapPilot> callback) {
    try {
        com.airmap.airmapsdk.networking.services.PilotService.updatePilot(pilot, callback);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
