public void reset() {
    previousValue = currentValue = startValue;
    System.out.println("log");
    currentElement = 0;
    currentTween = tweens.get(0);
    currentTween.setValue(startValue);
}
