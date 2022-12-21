public void setCPUIDCode(int i) {
    if (1049 == (i & 4095)) {
        cputype = axoloti.targetprofile.axoloti_core.cputype_e.STM32F42xxx;
    } else {
        cputype = axoloti.targetprofile.axoloti_core.cputype_e.STM32F40xxx;
    }
}
