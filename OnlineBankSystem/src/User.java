import java.util.Objects;

public class User {

    private int id;
    public int balance;
    private String name;
    private int accNo;
    private String password;
    private String tc;

    public User(String name, int accNo, int balance, String password, String tc) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
        this.password = password;
        this.tc = tc;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", balance=" + balance;
    }
}
