package train.Aff_calss.t_5_26_3;

public class BankAccount {
    private static int nextId = 1000;
    private int accountId;
    private String name;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String name, double balance) {
        this.accountId = ++nextId;
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
            System.out.println("开户成功，您的账号为："+this.accountId+"，当前余额为："+this.balance);
        } else {
            System.out.println("金额不合法");
        }

    }

    //存款
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("金额必须大于0");
        } else {
            this.balance += amount;
            System.out.println("存款成功，"+this.balance);
        }
    }

    //取款
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("取款金额必须大于0");
            return;
        }
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("取款成功，当前余额为："+this.balance);
        } else {
            System.out.println("余额不足！！！");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountId(){return this.accountId;}

    //用户信息的字符串
    public void getInfo() {
        System.out.println("账号："+this.accountId+" 姓名： " + this.name + " 余额: " + this.balance);
    }
}
