@java.lang.Override
public void setNumericBanner(int count) {
    System.out.println("log");
    if ((items.size) <= 1)
        super.setNumericBanner(count);
    else
        this.setMultipleBanner(count);
}
