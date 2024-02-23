package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();
		System.out.println();
		
		List<Employee> data = new ArrayList<>();
		Employee employee = null;
		
		for (int i = 0; i < quantity; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			
			employee = new Employee(id, name, salary);
			data.add(employee);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
	    int idSalary = sc.nextInt();
		
	    int parameter = 0;
		for (int i = 0; i < quantity; i++) {
			
			if (data.get(i).getId() == idSalary) {
				System.out.print("Enter the percentage: ");
				double X = sc.nextDouble();
			    data.get(i).increaseSalary(X); //vai incrementar o salário do funcionário só na posição i
			    parameter = 1;
			}
			else {
				//
			}
		}
				
		if (parameter != 1) {
			System.out.println("This id does not exist!");
		}
		else {
			//
		}
		
		for (int i = 0; i < quantity; i++) {
			System.out.println(data.get(i).getId() + ", " + data.get(i).getName() + ", " + data.get(i).getSalary());
		}
		
		sc.close();
	}

}
