package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L02_command;

interface Movable {
    int getX();
    int getY();
    void setX(int newX);
    void setY(int newY);
}

interface Storable {
    int getInventoryLength();
    String getInventoryItem(int index);
    void setInventoryItem(int index, String item);
}

interface Command4 {
    void execute();
    void undo();
}

class CommandMove implements Command4 {
    Movable entity;
    int xMovement;
    int yMovement;
    int xOld;
    int yOld;

    private void saveOld() {
        xOld = entity.getX();
        yOld = entity.getY();
    }

    private void setNew(int x, int y) {
        entity.setX(x);
        entity.setY(y);
    }

    @Override
    public void execute() {
        saveOld();
        setNew(xMovement, yMovement);
    }

    @Override
    public void undo() {
        setNew(xOld, yOld);
    }
}

class CommandPutItem implements Command4 {
    Storable entity;
    String item;
}
