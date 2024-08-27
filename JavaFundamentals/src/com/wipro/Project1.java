package com.wipro;

public class Project1 {
	public static void main(String args[]) {
		int salary=0,i=0;
		String designation = null;
		String[][] EmployeeTable= {{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},{"1004","Chahat","29/01/2013","r","FrontDesk","12000","6000","2000"},{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
		String[][] DA= {{"e","Engineer","20000"},{"c","Consultant","32000"},{"k","Clerk","12000"},{"r","Receptionist","15000"},{"m","Manager","40000"}};
		for(i=0;i<EmployeeTable.length;i++) {
			int EmployeeId=Integer.parseInt(EmployeeTable[i][0]);
			int Da=0;
			int key=1003;
			if(key==EmployeeId) {
				String code=EmployeeTable[i][3];
				
				//System.out.println(code);
				switch(code) {
				case "e":Da=Integer.parseInt(DA[0][2]);designation=DA[0][1];break;
				case "c":Da=Integer.parseInt(DA[1][2]);designation=DA[1][1];break;
				case "k":Da=Integer.parseInt(DA[2][2]);designation=DA[2][1];break;
				case "r":Da=Integer.parseInt(DA[3][2]);designation=DA[3][1];break;
				case "m":Da=Integer.parseInt(DA[4][2]);designation=DA[4][1];break;
				}
				//System.out.println(EmployeeTable[i][5]+" "+EmployeeTable[i][6]+" "+EmployeeTable[i][7]+" "+Da);
				salary=Integer.parseInt(EmployeeTable[i][5])+Integer.parseInt(EmployeeTable[i][6])-Integer.parseInt(EmployeeTable[i][7])+Da;
				
				break;
				
			}
			
			
		}
		if(salary>0) {
			System.out.println("EmpNo. "+"Emp Name "+" Department "+" Designation "+" Salary");
			System.out.println(EmployeeTable[i][0]+"     "+EmployeeTable[i][1]+"      "+EmployeeTable[i][4]+"       "+designation+"      "+salary);;
			
		}
		else {
			System.out.println("There is no employee with em[ployee id:"+args[0]);
		}
		
	}

}
