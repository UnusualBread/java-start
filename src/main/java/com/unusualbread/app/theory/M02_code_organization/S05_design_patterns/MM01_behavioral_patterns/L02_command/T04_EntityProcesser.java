package com.unusualbread.app.theory.M02_code_organization.S05_design_patterns.MM01_behavioral_patterns.L02_command;

/*
Write two classes which represent the Command pattern, CommandMove and
CommandPutItem.

These classes should also support undo. They should implement the entity
movement on the 2D and item putting. The x-axis on the map goes from left to
right, the y-axis goes from bottom to top.

The inventory of the entity has getInventoryLength() slots starting from 0, and
each slot can contain only one item. The entity should put an item into a slot
with the least possible index (slots with nothing inside is null). If all slots
of an entity are filled with some item, then entity should not place this item
in its inventory.

To undo, you should revert the changes made to the entity, so the coordinates
and the inventory of the entity before execute() and after undo() should be the
same.
*/

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
    boolean saved = false;

    private void saveOld() {
        xOld = entity.getX();
        yOld = entity.getY();
        saved = true;
    }

    private void setNew(int x, int y) {
        entity.setX(x);
        entity.setY(y);
    }

    @Override
    public void execute() {
        if (!saved) {
            saveOld();
        }
        setNew(xOld + xMovement, yOld + yMovement);
    }

    @Override
    public void undo() {
        if (saved) {
            setNew(xOld, yOld);
        }
    }
}

class CommandPutItem implements Command4 {
    Storable entity;
    String item;
    int usedIndex = -1;

    private void putItem() {
        for (int i = 0; i < entity.getInventoryLength(); i++) {
            if (entity.getInventoryItem(i) == null) {
                entity.setInventoryItem(i, item);
                usedIndex = i;
                break;
            }
        }
    }

    private void removeItem() {
        if (usedIndex != -1) {
            entity.setInventoryItem(usedIndex, null);
        }
    }

    @Override
    public void execute() {
        putItem();
    }

    @Override
    public void undo() {
        removeItem();
    }
}
