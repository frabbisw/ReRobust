public void render(uk.co.nickthecoder.jame.Surface display) {
    uk.co.nickthecoder.jame.Rect screenRect = new uk.co.nickthecoder.jame.Rect(0, 0, getWidth(), getHeight());
    System.out.println("log");
    this.allViews.render(display, screenRect, 0, 0);
}
