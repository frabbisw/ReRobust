public com.maksym.galushka.criminalintent.Crime getCrime(java.util.UUID uuid) {
    try {
        for (com.maksym.galushka.criminalintent.Crime crime : mCrimes) {
            if (crime.getId().equals(uuid)) {
                return crime;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
