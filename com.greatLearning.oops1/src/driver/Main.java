package driver;
import depertment.*;

public class Main {

	public static void main(String[] args) {

		AdminDep a=new AdminDep();
		HrDep h=new HrDep();
		TechDep t= new TechDep();	

		System.out.println("Welcome to " + a.departmentName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadLine());
		System.out.println(a.IsTodayAholiday());

		System.out.println();

		System.out.println("Welcome to " + h.departmentName());
		System.out.println(h.doActivity());
		System.out.println(h.getTodaysWork());
		System.out.println(h.getWorkDeadLine());
		System.out.println(h.IsTodayAholiday());

		System.out.println();

		System.out.println("Welcome to " + t.departmentName());
		System.out.println(t.getTodaysWork());
		System.out.println(t.getWorkDeadLine());
		System.out.println(t.getStackInformation());
		System.out.println(h.IsTodayAholiday());




	}

}
