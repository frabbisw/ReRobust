public blackdoor.cqbe.output_logic.AddressTable iterativeLookup(blackdoor.cqbe.output_logic.Address destination, int α, int n) {
    return iterativeLookup(destination, α, n, (2 * (AddressTable.DEFAULT_MAX_SIZE)));
}
