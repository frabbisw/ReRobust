public void midiSystemUpdated() throws uk.co.xfactorylibrarians.coremidi4j.CoreMidiException {
    try {
        buildDeviceMap();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
