public boolean switchButtonHitTest(com.ezardlabs.dethsquare.Touch t) {
    return (switchButton.hitTest(t.position)) && (((t.phase) == (com.ezardlabs.dethsquare.Touch.TouchPhase.BEGAN)) && (switchButton.hitTest(t.startPosition)));
}
