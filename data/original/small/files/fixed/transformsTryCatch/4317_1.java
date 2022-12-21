public void setStats(com.mycompany.mlproject.Stats stats) {
    stats.count_human_dna = totalRecords;
    stats.count_mutant_dna = mutantRecords;
    try {
        stats.ratio(mutantRecords, totalRecords);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
