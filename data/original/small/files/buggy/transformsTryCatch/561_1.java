public void NewWordClicked(android.view.View Sender) {
    try {
        selectedWord = wordGenerator.nextWord(selectedLength);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    scrambledWord = edu.westga.rnrscramble.model.WordScrambler.Scramble(selectedWord);
    setScrambleTextView(scrambledWord);
    setAnswerTextView("");
}
