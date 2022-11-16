package ksuvati;

import java.util.Scanner;

public class new_assignement {

}

class bit {
  public void bit_bcs() {
    System.out.println("The animal makes a sound");
  }
}

class suvati extends bit {
  public void animalSound() {
    System.out.println("suvati says:i like oop");
  }
}

class k_brian extends bit {
  public void bit_bcs() {
    System.out.println("k_brian says: iteach oop");
  }
}

class Main {
  public static void main(String[] args) {
    bit mybit = new bit();  
    bit mysuvati = new suvati();  
    bit myk_brian = new k_brian();  
    mybit.bit_bcs();
    mysuvati.bit_bcs();
    myk_brian.bit_bcs();
  }
}
class main{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter Your first name:");
	String Your_first_name = scan.nextLine();
	
	System.out.println("Enter Your last name:");
	String Your_last_name = scan.nextLine();
	
	System.out.println("Enter Your reg number:");
	String Your_reg_number = scan.nextLine();
	
	System.out.println("Enter Your course year:");
	String Your_course_year = scan.nextLine();
	
	System.out.println("Enter Your themester:");
	String Your_themester = scan.nextLine();
	
	System.out.println("Enter Your course name:");
	String Your_course_name = scan.nextLine();
	
	
	System.out.println("THESE IS YOUR INFORMATION :");
	
	System.out.println(Your_first_name );
	
	System.out.println(Your_last_name);
	
	System.out.println(Your_reg_number);
	
	System.out.println(Your_course_year);
	
	System.out.println(Your_themester);
}
}

