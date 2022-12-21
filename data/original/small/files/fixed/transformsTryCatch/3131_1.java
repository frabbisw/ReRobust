@java.lang.Override
public void run() {
    try {
        show_alert("Upload Failed", ("Unable to upload file to IRCCloud." + ((error) != null ? "\n\n" + (error) : "")));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
