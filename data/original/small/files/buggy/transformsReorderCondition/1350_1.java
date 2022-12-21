@java.lang.Override
public java.util.Collection<V> values() {
    if (null == (valuesSubMapView)) {
        valuesSubMapView = new DescendingTrieSubMapValues(absHighest(), absLowFence());
    }
    return valuesSubMapView;
}
