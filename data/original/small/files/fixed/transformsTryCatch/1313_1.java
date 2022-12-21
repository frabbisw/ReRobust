public void reset() {
    setValue(startValue);
    currentElement = 0;
    try {
        currentTween = tweens.get(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    currentTween.setValue(startValue);
}
