import java.io.*;
import java.util.*;
import java.net.*;

 class main{
    public static void main(String[] args) throws  Exception{
        ExecutorService service = Executors.newFixedThreadPool(100);
        Bank bankObj = new Bank();
        for(int i =0; i <= 10000; i++){
            service.submit(bankObj);
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.DAYS);
        bankObj.getTotalBalanceWithStats();
    }
}
class Account{
    String accountName;
    int balance;
    Object lock1 = new Object();
    Object lock2 = new Object();
    Object lock3 = new Object();
    Account(String name, int balance){
        this.accountName = name;
        this.balance = balance;
    }
    void deposit(int amount){
        synchronized (lock1) {
            this.balance = getBalance() + amount;
        }
    }
    void withdraw(int amount) throws Exception {
        synchronized (lock2) {
            int balance = getBalance() - amount;
            if(balance <= 0){
                throw new Exception("Invalid Transaction");
            }
            this.balance = getBalance() - amount;
        }
    }
    int getBalance(){
        synchronized (lock3){
            return this.balance;
        }
    }
}
class Bank implements Runnable{

    List<Account> accountList = new ArrayList<>();
    Bank(){
        for(int i=0; i <= 30; i++){
            accountList.add(new Account("A"+i, 1000));
        }
        getTotalBalanceWithStats();
    }

    public void run() {
        Random random = new Random();
        Account from = null;
        Account to = null;
        while(true) {
            int a1 = random.nextInt(30);
            int a2 = random.nextInt(30);
            if(a1 == a2) continue;
            from = accountList.get(a1);
            to = accountList.get(a2);
            break;
        }
        doTransaction(from, to, random.nextInt(400));
    }

    private void doTransaction(Account from, Account to, int nextInt) {
        System.out.println("Transaction from " + from.accountName + " to " + to.accountName);
        try {
            from.withdraw(nextInt);
            to.deposit(nextInt);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    void getTotalBalanceWithStats(){
        int total = 0;
        for(Account acc : accountList){
            System.out.println("Account " + acc.accountName + " balance " + acc.getBalance());
            total += acc.getBalance();
        }
        System.out.println("Total Balance " + total);
    }
}