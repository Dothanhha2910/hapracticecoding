package practiceclass2;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int credit(int moneyIn){
        int newBalance = 0;
        if (moneyIn < 0){
            throw new IllegalStateException("Credit amount cannot be negative");
        } else {
            newBalance = this.balance + moneyIn;
        }
        return newBalance;
    }
    public int debit (int moneyOut){
        int newBalance = 0;
        if (moneyOut < 0){
            throw new IllegalStateException("Debit amount cannot be negative");
        } else if((this.balance - moneyOut) < 0){
            System.out.println("Cannot process transaction!\nDebit amount must be smaller than your current balance");
        }
        else {
            newBalance = this.balance - moneyOut;
        }
        return newBalance;
    }
    public void transferTo(Account sender, Account receiver, int amount){
        if (amount < 0){
            throw new IllegalStateException("Transferred amount cannot be negative");
        } else if((sender.getBalance() - amount) < 0)
        {
            System.out.println("Cannot process transaction!\nTransferred amount must be smaller than your current balance");
        }
        else 
        {
            sender.setBalance(sender.getBalance() - amount);
            sender.setBalance(receiver.getBalance() + amount);
        }
    }
}
