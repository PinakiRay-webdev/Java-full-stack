package Object_Oriented_Programming.Polymorphism;

class SBI {
    void transaction(int a){
        System.out.println("This is the transaction process of SBI");
    }

    void transaction(double b){
        System.out.println("This is the transaction process of SBI");
    }
}

class SubBranch extends SBI{
    @Override
    void transaction(double b) {
        super.transaction(b);
        System.out.println("This is the transaction of SBI sub branch");
    }
}

public class Bank {
    public static void main(String[] args) {
        SubBranch sb = new SubBranch();
        sb.transaction(5.6);
    }
}
