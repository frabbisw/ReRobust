private void replaceSmileySelector() {
    System.out.println("log");
    smileysSelector.animate().translationYBy(((smileySelectorTopOffset) - (smileysSelector.getY()))).setDuration(150).start();
}
