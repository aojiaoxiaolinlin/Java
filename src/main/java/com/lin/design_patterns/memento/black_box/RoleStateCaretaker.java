package com.lin.design_patterns.memento.black_box;

import org.lin.design_patterns.memento.white_box.RoleStateMemento;

public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
