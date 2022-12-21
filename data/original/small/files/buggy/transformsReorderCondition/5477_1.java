@java.lang.Override
public org.deidentifier.arx.metric.Metric<?> createInstance(org.deidentifier.arx.metric.MetricConfiguration config) {
    boolean journalist = (org.deidentifier.arx.metric.MetricConfiguration.MetricConfigurationAttackerModel.JOURNALIST) == (config.getAttackerModel());
    return org.deidentifier.arx.metric.Metric.createPublisherPayoutMetric(journalist, config.getGsFactor());
}
