import java.util.*;


public class studentmanagementsystem{
static Scanner scan=new Scanner(System.in);
//定义类
static class students{
    String id;
    String name;
    int age;

    public students(String id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
}

    //添加学生
    public static void add_students(ArrayList<students>list){

        System.out.println("add students");
        System.err.println("what is the id?");
        String idin=scan.next();
        System.err.println("what is the name?");
        String namein=scan.next();
        System.err.println("what is the age?");
        int agein=scan.nextInt();
        list.add(new students(idin,namein,agein));
        System.err.println("add successfully");
        return ;
    }
    //删除学生
    public static void delete_students(ArrayList<students>list){
        if(list.size()==0){
            System.out.println("list is empty");
            return ;
        }
        System.out.println("who you want to delete?");
        String tofind=scan.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).id.equals(tofind)){
                    list.remove(i);
                return ;
            }
        }
        System.err.println("no find");
        return ;
    }
    //修改信息
    public static void modify_students(ArrayList<students>list){
        if(list.size()==0){
            System.out.println("list is empty");
            return ;
        }
        System.out.println("who you want to modify?");
        String tofind=scan.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).id.equals(tofind)){
                    System.err.println("what is the name?");
                    String namein=scan.next();
                    System.err.println("what is the age?");
                    int agein=scan.nextInt();
                    list.get(i).name=namein;
                    list.get(i).age=agein;
                return ;
            }
        }
        System.err.println("no find");
        return ;
    }
    //查找学生
    public static void inquire_students(ArrayList<students>list){
        if(list.size()==0){
            System.out.println("list is empty");
            return ;
        }
        System.out.println("who you want to find");
        String tofind=scan.next();
        for(int i=0;i<list.size();i++){
            if(list.get(i).id.equals(tofind)){
                System.out.println("ID\tNAME\tAGE\t");
                System.out.print(list.get(i).id+"\t"+list.get(i).name+"\t"+list.get(i).age+"\n");
                return ;
            }
        }
        System.err.println("no find");
        return ;
    }
    //显示信息
    public static void display_students(ArrayList<students>list){
        System.out.println("ID\tNAME\tAGE\t");
        for(int i=0;i<list.size();i++){
           System.out.print(list.get(i).id+"\t"+list.get(i).name+"\t"+list.get(i).age+"\n");
        }
    }
    public static void show_menu(){
        System.out.println("------students management sysytem by zizisuo------");
        System.out.println("1,add students");
        System.out.println("2,delete students");
        System.out.println("3,modify students");
        System.out.println("4,inquire students");
        System.out.println("5,display students");
        System.out.println("6,exit");
        System.out.println("Please enter the action you want to take");
    }
    public static void main(String[] args){
            ArrayList<students> list=new ArrayList<>();
            list.add(new students("1","red",15));
            list.add(new students("2","blue", 19));
        Label1:while (true) { 
            show_menu();
            String option=scan.next();
            switch (option) {
                case "1"-> add_students(list);
                case "2"-> delete_students(list);
                case "3"-> modify_students(list);
                case "4"-> inquire_students(list);
                case "5"-> display_students(list);
                case "6"-> {
                    System.out.println("exited");
                    break Label1;
                }
                default->
                    System.out.println("error input");
            }
        }
    } 
}