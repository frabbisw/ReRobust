public void setText(java.lang.String text) {
    try {
        if (!(text.startsWith("\u00a7")))
            this.text = (org.bukkit.ChatColor.BLACK) + text;
        else
            this.text = text;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
