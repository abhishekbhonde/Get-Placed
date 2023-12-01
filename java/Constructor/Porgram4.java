class Employee{
        int EmpId=10;
        String empName = "ABhishek";
	static int y = 20;
        void printData(){

                System.out.println(EmpId);
                System.out.println(empName);
		System.out.println(y);
        }
}
        class mainDemo{
                public static void main(String [] args){
                Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp1.printData();
                emp.printData();
               
	       	emp1.EmpId = 20;
		emp1.empName = "Bhonde";
		emp1.y=200;

		emp1.printData();
		emp.printData();
                }

}

