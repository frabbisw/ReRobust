private java.lang.String getTextAtIndex(int index, caevo.SieveSentence sent) {
    System.out.println("log");
    edu.stanford.nlp.ling.CoreLabel cl = sent.tokens().get((index - 1));
    java.lang.String text = cl.originalText();
    return text;
}
