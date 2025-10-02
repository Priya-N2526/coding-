package oopsjava;
class emp{
    int empid;
    String empname;
    void details(int r, String n){
        empid=r;
        empname=n;
    }
    void display(){
        System.out.println(empid+" "+empname);
    }
}

public class employee {
    public static void main(String[] args){
    emp obj=new emp();
    obj.details(001,"priya");
    obj.details(002,"Pria");
    obj.display();
    }
}
