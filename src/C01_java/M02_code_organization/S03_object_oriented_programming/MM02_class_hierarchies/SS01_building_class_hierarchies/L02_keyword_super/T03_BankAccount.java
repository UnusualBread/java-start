package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L02_keyword_super;

/*
You are given a class named BankAccount. The class has two fields: number and
balance.

Define two classes which inherit from the BankAccount:
    - CheckingAccount containing the double field fee.
    - SavingsAccount containing the double field interestRate.

Each new class should have a constructor with three parameters to initialize
all fields:
    - CheckingAccount(String number, Long balance, double fee)
    - SavingsAccount(String number, Long balance, double interestRate)
*/

class BankAccount {

    protected String number;
    protected Long balance;

    public BankAccount(String number, Long balance) {
        this.number = number;
        this.balance = balance;
    }
}

class CheckingAccount extends BankAccount{
    double fee;

    CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }
}

class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }
}
