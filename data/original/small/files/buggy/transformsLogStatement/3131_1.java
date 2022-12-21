@java.lang.Override
public void run() {
    System.out.println("log");
    show_alert("Upload Failed", ("Unable to upload file to IRCCloud." + ((this.error) != null ? "\n\n" + (this.error) : "")));
}
