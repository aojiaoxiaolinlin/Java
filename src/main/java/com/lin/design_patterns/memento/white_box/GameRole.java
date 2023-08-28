package com.lin.design_patterns.memento.white_box;

import org.jetbrains.annotations.NotNull;

/**
 * 发起人
 */
public class GameRole {
    private int vit; // 生命值
    private int atk; // 攻击力
    private int def; // 防御力

    public void init() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 存储状态
    public RoleStateMemento saveState() {
        return new RoleStateMemento(this.vit, this.atk, this.def);
    }

    // 恢复状态
    public void restoreState(@NotNull RoleStateMemento memento) {
        // 将备忘录中存储状态恢复到初始状态
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public void showState() {
        System.out.printf("""
                生命值：%s
                攻击力：%s
                防御力：%s
                %n""", this.vit, this.atk, this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
