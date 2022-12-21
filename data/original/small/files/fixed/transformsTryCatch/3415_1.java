public cviz.config.TimelineConfig findChannelById(java.lang.String id) {
    try {
        for (cviz.config.TimelineConfig channel : channels) {
            if (channel.getId().equals(id))
                return channel;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
