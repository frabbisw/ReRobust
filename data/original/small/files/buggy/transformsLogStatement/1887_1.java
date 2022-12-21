public static void main(java.lang.String[] args) {
    System.out.println("log");
    simfinder.File f = new simfinder.File(args[0]);
    simfinder.Calculator c = new simfinder.Calculator(simfinder.Parser.parseFile(f));
}
