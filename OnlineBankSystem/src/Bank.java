import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private String name;
    private List<User> users;


    public Bank(){
        users = new ArrayList<>();
        users.add(new User("Hasan",1234,4000,"1234","12345678912"));
        users.add(new User("Mustafa",1453,4200,"1234","12345678913"));
    }


    public void login(String tc,String password){
        if(tc == users.get(0).getTc() && password == users.get(0).getPassword()){
            System.out.println("Logged in");
        }else {
            System.out.println("fail login");
        }
    }


    public void transfer(User from,User to,int amount){
        if(from.getBalance() > 0){
            from.balance -= amount;
            from.setBalance(from.getBalance());
            to.balance += amount;
            to.setBalance(to.getBalance());
        }else if(from.getBalance() == 0){
            System.out.println("insufficient balance :");
        }

    }

    public void printUsers(){
        for (User u : users){
            System.out.println(u);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) &&
                Objects.equals(users, bank.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }
}
