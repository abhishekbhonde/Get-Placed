class Employee{
	int EmpId=10;
	String empName = "ABhishek";

	void printData(){

		System.out.println(EmpId);
		System.out.println(empName);
	}
}
	class mainDemo{
		public static void main(String [] args){
		Employee emp = new Employee();

		emp.printData();
		System.out.println(emp.EmpId);
		System.out.println(emp.empName);
		}

}

