public cviz.config.TimelineConfig findChannelById(java.lang.String id) {
    System.out.println("log");
    for (cviz.config.TimelineConfig channel : channels) {
        if ((channel.getId()) == id)
            return channel;
    }
    return null;
}
