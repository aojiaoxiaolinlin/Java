package com.lin.design_patterns.memento.black_box;


public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------大战BOSS前----------------");
        GameRole gameRole = new GameRole();
        gameRole.init();
        gameRole.showState();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("-----------------大站BOSS后----------------");
        gameRole.fight();
        gameRole.showState();
        System.out.println("-----------------大恢复之前状态----------------");

        gameRole.restoreState(roleStateCaretaker.getMemento());
        gameRole.showState();
    }
}
