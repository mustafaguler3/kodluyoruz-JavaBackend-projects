import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.printUsers();
        bank.transfer(bank.getUsers().get(0),bank.getUsers().get(1),200);
        bank.printUsers();
        bank.login("12345678912","1234");

    }

}
