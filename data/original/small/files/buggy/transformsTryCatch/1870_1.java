@java.lang.Override
public void onNewDiagnosisResult(java.util.Collection<rocks.inspectit.shared.all.communication.data.diagnosis.results.ProblemOccurrence> problemOccurrences) {
    try {
        diagnosisResults.getDiagnosisResults().addAll(problemOccurrences);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (rocks.inspectit.shared.all.communication.data.diagnosis.results.ProblemOccurrence problemOccurrence : problemOccurrences) {
    }
}
