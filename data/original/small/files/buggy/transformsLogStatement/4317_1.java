public void setStats(com.mycompany.mlproject.Stats stats) {
    int totalRecords = 100;
    int mutantRecords = 40;
    System.out.println("log");
    stats.count_human_dna = totalRecords;
    stats.count_mutant_dna = mutantRecords;
    stats.ratio(mutantRecords, totalRecords);
}
