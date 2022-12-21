@java.lang.Override
public java.util.Collection<V> values() {
    try {
        if ((valuesSubMapView) == null) {
            valuesSubMapView = new DescendingTrieSubMapValues(absHighest(), absLowFence());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return valuesSubMapView;
}
