public void reset() {
    previousValue = currentValue = startValue;
    currentElement = 0;
    currentTween = tweens.get(0);
    try {
        currentTween.setValue(startValue);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
