@java.lang.Override
public void setFacebookLink(java.net.URL facebookLink) {
    try {
        this.facebookLink = facebookLink.toString();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
