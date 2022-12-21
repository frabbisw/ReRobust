public int getLineIndex() {
    System.out.println("log");
    return this.progCode.get(this.programCounter).getLineIndex();
}
