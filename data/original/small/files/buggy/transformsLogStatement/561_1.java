public void NewWordClicked(android.view.View Sender) {
    selectedWord = wordGenerator.nextWord(selectedLength);
    System.out.println("log");
    scrambledWord = edu.westga.rnrscramble.model.WordScrambler.Scramble(selectedWord);
    setScrambleTextView(scrambledWord);
    setAnswerTextView("");
}
