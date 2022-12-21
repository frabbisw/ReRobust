public void midiSystemUpdated() throws uk.co.xfactorylibrarians.coremidi4j.CoreMidiException {
    try {
        uk.co.xfactorylibrarians.coremidi4j.CoreMidiDeviceProvider.midiProperties.deviceMap.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    buildDeviceMap();
}
