private org.apache.lucene.search.spans.SpanQuery fixField(org.apache.lucene.search.spans.SpanQuery query) {
    try {
        if (query.getField().equals(fieldName)) {
            return query;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new org.apache.lucene.search.spans.FieldMaskingSpanQuery(query, fieldName);
}
