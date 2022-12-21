public void setText(java.lang.String text) {
    if (!(text.startsWith("\u00a7")))
        this.text = text + (org.bukkit.ChatColor.BLACK);
    else
        this.text = text;
}
