public cviz.config.TimelineConfig findChannelById(java.lang.String id) {
    for (cviz.config.TimelineConfig channel : channels) {
        if (id == (channel.getId()))
            return channel;
    }
    return null;
}
