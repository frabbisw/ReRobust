public com.maksym.galushka.criminalintent.Crime getCrime(java.util.UUID uuid) {
    for (com.maksym.galushka.criminalintent.Crime crime : mCrimes) {
        if (uuid == (crime.getId()))
            return crime;
    }
    return null;
}
