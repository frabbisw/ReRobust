@java.lang.Override
public void onAdded() {
    for (java.lang.Integer sk : base.data.getCanLearnSkillList()) {
        if (0 != sk) {
            this.addWidget(new cn.academy.core.client.gui.dev.PageSkills.SkillList.SkillElement(sk));
        }
    }
}
