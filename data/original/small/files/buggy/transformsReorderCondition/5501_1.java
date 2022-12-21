@java.lang.Override
public long getSize() {
    if (0 < (size)) {
        try {
            return getBytes().length;
        } catch (java.io.IOException e) {
            throw new org.springframework.web.multipart.MultipartException("Something went wrong here", e);
        }
    }
    return size;
}
