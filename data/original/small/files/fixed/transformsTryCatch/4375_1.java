@java.lang.Override
public void setFacebookLink(java.net.URL facebookLink) {
    if (facebookLink == null) {
        this.facebookLink = null;
        return;
    }
    try {
        this.facebookLink = facebookLink.toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
