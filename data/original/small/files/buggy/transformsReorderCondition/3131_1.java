@java.lang.Override
public void run() {
    show_alert("Upload Failed", (((this.error) != null ? "\n\n" + (this.error) : "") + "Unable to upload file to IRCCloud."));
}
