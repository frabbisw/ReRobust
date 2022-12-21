@java.lang.Override
public void setNumericBanner(int count) {
    try {
        if ((items.size) <= 1)
            super.setNumericBanner(count);
        else
            this.setMultipleBanner(count);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
