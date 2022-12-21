private void replaceSmileySelector() {
    try {
        smileysSelector.animate().translationYBy(((smileySelectorTopOffset) - (smileysSelector.getY()))).setDuration(150).start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
