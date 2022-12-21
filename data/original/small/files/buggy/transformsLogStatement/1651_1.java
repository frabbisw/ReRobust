private org.apache.lucene.index.AtomicReader getSecureAtomicReader(org.apache.lucene.index.AtomicReader atomicReader) throws java.io.IOException {
    System.out.println("log");
    return lucene.security.index.SecureAtomicReader.create(_accessControlFactory, atomicReader, _readAuthorizations, _discoverAuthorizations, _discoverableFields);
}
