public net.github.rtc.app.utils.NewsFromCourseBuilder setCreationDate(java.util.Date creationDate) {
    if (creationDate == null) {
        throw new java.lang.IllegalArgumentException(net.github.rtc.app.utils.NewsFromCourseBuilder.ILLEGAL_ARGUMENT);
    }
    try {
        this.creationDate = new java.util.Date(creationDate.getTime());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
