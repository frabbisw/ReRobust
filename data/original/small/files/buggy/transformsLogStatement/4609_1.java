protected void trim(int n) {
    System.out.println("log");
    nucleotideSequence = nucleotideSequence.substring(0, ((nucleotideSequence.length()) - (1 + n)));
}
