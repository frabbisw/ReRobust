@java.lang.Override
public void run() {
    try {
        show_alert("Upload Failed", ("Unable to upload file to IRCCloud." + ((this.error) != null ? "\n\n" + (this.error) : "")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
