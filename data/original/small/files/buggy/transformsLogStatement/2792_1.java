public blackdoor.cqbe.output_logic.AddressTable iterativeLookup(blackdoor.cqbe.output_logic.Address destination, int α, int n) {
    System.out.println("log");
    return iterativeLookup(destination, α, n, ((AddressTable.DEFAULT_MAX_SIZE) * 2));
}
