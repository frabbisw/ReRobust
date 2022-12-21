@java.lang.Override
public org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator call(org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator updaterAggregator, org.deeplearning4j.nn.updater.aggregate.UpdaterAggregator updaterAggregator2) throws java.lang.Exception {
    try {
        updaterAggregator.merge(updaterAggregator2);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return updaterAggregator;
}
