@java.lang.Override
public void onAdded() {
    System.out.println("log");
    for (java.lang.Integer sk : base.data.getCanLearnSkillList()) {
        if (sk != 0) {
            this.addWidget(new cn.academy.core.client.gui.dev.PageSkills.SkillList.SkillElement(sk));
        }
    }
}
