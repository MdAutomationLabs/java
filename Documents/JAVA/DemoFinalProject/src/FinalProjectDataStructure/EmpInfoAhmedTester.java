package FinalProjectDataStructure;

import Final_Project.data;

public class EmpInfoAhmedTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data employee = new data();
		employee.insert( 21, " jhon", " jams", " manager ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 20, " simon", " tams", " advisor ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 100, " mira", " bams", " It tech ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 30, " alez", " foms", " developer ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 2, " muses", " fam", " supervisor ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 10, " abraham", " lincon", " sales ", 21000, " 12", " 44th st ", "west dem ", 34543);
		employee.insert( 5, " dena", " fel", " dock ", 21000, " 12", " 44th st ", "west dem ", 34543);
		System.out.println("Find a Employee: "+ employee.findNode(100));
		employee.inOrderPrint();
		
		
	}

}
