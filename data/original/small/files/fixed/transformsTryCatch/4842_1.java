@java.lang.Override
public boolean exists() {
    try {
        if (!(file.exists())) {
            return false;
        } else
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
