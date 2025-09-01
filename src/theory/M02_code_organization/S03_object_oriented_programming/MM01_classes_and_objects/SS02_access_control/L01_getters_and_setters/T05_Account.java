package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS02_access_control.L01_getters_and_setters;

class Account {

    private long balance;
    private String ownerName;
    private boolean locked;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }
}