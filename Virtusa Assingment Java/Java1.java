import java.util.*;
 class Emp {
     int id,exp;
     String name,emailid,gender,address,DOB,DOJ;
     long mobileno;
     float sal;
     Emp(int id,int exp,String name,String emailid,String gender,String address,String DOB,String DOJ,long mobileno,float sal){
         this.id=id;
         this.exp=exp;
         this.name=name;
         this.emailid=emailid;
         this.gender=gender;
         this.address=address;
         this.DOB=DOB;
         this.DOJ=DOJ;
         this.mobileno=mobileno;
         this.sal=sal;
     }
     public int getid(){
         return id;
     }
     public String getname(){
         return name;
     }
     public String getemailid(){
         return emailid;
     }
     public int getexp(){
         return exp;
     }
     public String getgender(){
         return gender;
     }
     public String getaddress(){
         return address;
     }
     public String getDOB(){
         return DOB;
     }
     public String getDOJ(){
         return DOJ;
     }
     public long getmobileno(){
         return mobileno;
     }
     public float getsal(){
         return sal;
     }
     public String toString(){
         return id+" "+name+" "+emailid+" "+exp+" "+gender+" "+address+" "+DOB+" "+DOJ+" "+mobileno+" "+sal;
     }
 }


public class Employee {
    public static void main(String args[]){
        List<Emp> c=new ArrayList<Emp>();
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);

        int ch;
        do{
            System.out.println(" MENU ");
            System.out.println("1.Add Employe Details");
            System.out.println("2.View Single Employe Details");
            System.out.println("3.View All Employe Details");
            System.out.println("4.Update Employe Details");
            System.out.println("5.Delete Employe Details");
            ch=s.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter id : ");
                   int id=s.nextInt();

                    System.out.print("Enter name : ");
                    String name=s1.nextLine();
                    System.out.print("Enter emailid : ");
                    String emailid=s1.nextLine();
                    System.out.print("Enter Years Of Experiance : ");
                    int exp=s.nextInt();
                    System.out.print("Enter Gender : ");
                    String gender=s1.nextLine();
                    System.out.print("Enter address : ");
                    String address=s1.nextLine();
                    System.out.print("Enter DOB : ");
                    String DOB=s1.nextLine();
                    System.out.print("Enter DOJ : ");
                    String DOJ=s1.nextLine();
                    System.out.print("Enter mobileno : ");
                    long mobileno=s.nextLong();
                    System.out.print("Enter salary : ");
                    float sal=s.nextFloat();
                    c.add(new Emp(id,exp,name,emailid,gender,address,DOB,DOJ,mobileno,sal));
                    System.out.println("Employee Details Added Successfully : ");
                    break;
                case 2:
                    boolean found=false;
                    System.out.println("Enter Employee id to View ");
                    id=s.nextInt();
                    System.out.println("------------------------------");
                    Iterator<Emp> i=c.iterator();
                    while(i.hasNext()){
                        Emp e=i.next();
                        if(e.getid()==id){
                            System.out.println(e);
                            found=true;
                        }
                    }
                    System.out.println("------------------------------");
                    if(!found){
                        System.out.println("record not found ");
                    }
                    break;
                case 3:
                    System.out.println("----------------------------");
                    i=c.iterator();
                    while(i.hasNext()){
                        Emp e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("------------------------------");

                    break;
                case 4:
                found=false;
                System.out.println("Enter Employee id to update ");
                id=s.nextInt();
                System.out.println("------------------------------");
                ListIterator<Emp>li = c.listIterator();

                while(li.hasNext()){
                    Emp e=li.next();
                    if(e.getid()==id){
                        System.out.println("Enter New name : ");
                        name=s.nextLine();
                        System.out.print("Enter new emailid : ");
                         emailid=s1.nextLine();
                        System.out.print("Enter new Years Of Experiance : ");
                         exp=s.nextInt();
                        System.out.print("Enter new Gender : ");
                         gender=s1.nextLine();
                        System.out.print("Enter new address : ");
                         address=s1.nextLine();
                        System.out.print("Enter new DOB : ");
                         DOB=s1.nextLine();
                        System.out.print("Enter new DOJ : ");
                         DOJ=s1.nextLine();
                        System.out.print("Enter new mobileno : ");
                         mobileno=s.nextLong();
                        System.out.print("Enter new salary : ");
                         sal=s.nextFloat();
                        li.set(new Emp(id,exp,name,emailid,gender,address,DOB,DOJ,mobileno,sal));
                        found=true;



                    }
                }

                if(!found){
                    System.out.println("record not found ");
                }
                else{
                    System.out.println(" Record Updated Successfully ");
                }
                    System.out.println("------------------------------");
                break;
                case 5:
                     found=false;
                    System.out.println("Enter Employee id to Delete ");
                    id=s.nextInt();
                    System.out.println("------------------------------");
                     i=c.iterator();
                    while(i.hasNext()){
                        Emp e=i.next();
                        if(e.getid()==id){
                            i.remove();
                            found=true;
                        }
                    }
                    System.out.println("------------------------------");
                    if(!found){
                        System.out.println("record not found ");
                    }
                    else{
                        System.out.println(" Record Deleted Successfully ");
                    }
                    break;



            }
        }while(ch!=0);

    }
}
