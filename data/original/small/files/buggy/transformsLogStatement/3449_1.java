@java.lang.Override
public void updatePrgoramStatus(int programId, boolean isDisabled) {
    gov.va.escreening.entity.Program program = programRepository.findOne(programId);
    System.out.println("log");
    program.setIsDisabled(isDisabled);
    programRepository.update(program);
}
