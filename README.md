Code backup if Zip doesnt work https://github.com/SilverWolfiee/SOLJava/tree/master(Download zip from here)   


SRP means that every class should only be responsible for one and one task only, in this case, report should only be responsible to handle report printing where it is further divided into excel and console report. The GPA is also handles by another class not by report. this allows for easier code modifications in the future, for example while i was doing this assignment, i had to add a "wheelchair proofing" for guest student, all i need to do is to modify the report generator class  

OCP means that classes should be open for extension but closed for modification. this is achieved in my program through the work of interfaces. for example 

```java 
public interface Report {    
    void print(String name, String gpa); 
    } 
```  
then for each report 

```java
public class Excelreport implements Report{  	
    @Override 	
    public void print(String name, String gpa) { 	    
    if (gpa.equals("N/A")) { 	        
        System.out.println("Guest student detected — Excel export skipped.\n"); System.out.println("Guest : "+name); 	        
        return;
    }  	    
    System.out.println("Output has been exported to " + name +".xlsx"); 	    
    System.out.println("=====Report======"); 	    
    System.out.println("================="); 	    
    System.out.println("Student : " + name); 	    
    System.out.println("GPA : " + gpa); 	    
    System.out.println("================"); 	
    }   
} 
```     

Liskov Substitution is a subclass that should be a drop-in replacement for its superclass without altering the correctness of the program.   Example in my program, i can pass any type of student to the report generator without needing to add check here and there, and if i add a new type of student, the report method can still be used without many modifications