protected void trim(int n) {
    try {
        nucleotideSequence = nucleotideSequence.substring(0, ((nucleotideSequence.length()) - n));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
