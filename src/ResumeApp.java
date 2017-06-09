
import java.util.*;
import java.sql.*;

public class ResumeApp {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);
		Boolean more=true;






		System.out.println("Enter your First Name: ");

		String firstName=sc.nextLine();

		System.out.println("Enter your Last Name: ");

		String lastName=sc.nextLine();

		System.out.println("Enter your email : ");

		String email=sc.nextLine();

		int counter=1;

		System.out.println("How many work experience do you have?");

		int workCount=sc.nextInt();
		sc.nextLine();

		String [] workArray= new String[workCount];
		String work="";

		if (workCount>0){
			workArray= new String[workCount];
			for (int i =1; i<=workCount ; i++)
			{

				System.out.println("Enter your Job title for job "+ i +" ");

				String title= sc.nextLine();

				System.out.println("Enter your Employer for job "+ i +" ");

				String employer= sc.nextLine();

				System.out.println("Enter your start date for job "+ i +" ");

				String startDate= sc.nextLine();

				System.out.println("Enter your end date for job "+ i +" ");

				String endDate= sc.nextLine();

				System.out.println("Enter your duty for job "+ i +" ");

				String duty1= sc.nextLine();

				System.out.println("Enter your another duty for job "+ i +" ");

				String duty2= sc.nextLine();

				work+=(title+"/n"+employer +" ,"+startDate+" -"+endDate +"\n" +"duty 1:"+duty1 +"\n"+"duty 2:"+duty2 +"\n");

				workArray[i-1]= title+ "\n" + employer +","+ startDate+"-"+endDate+"\n"+"-Duty 1 : "+duty1
						+ "\n"+"-Duty 2 : "+duty2 ;
			}
		}


		//---------------------------------------------------Education Section-------------------------------------------------------------
		int eduCount=0;

		do{
			System.out.println("How many Educational achievements do you have? Minimum is 1 Max is 10");

			eduCount=sc.nextInt();
			sc.nextLine();}
		while(eduCount<1 || eduCount>10);

		String eduArray[];

		eduArray= new String[eduCount];
		int eduCounter=0;


		String edu="";

		for (int i=1; i<=eduCount;i++){



			System.out.println("Enter your Educational Degree no " + counter+": ");

			String education=sc.nextLine();

			System.out.println("Enter your School Name " + counter+": ");

			String schoolName=sc.nextLine();

			System.out.println("Enter your Graduation Year " + counter+": ");

			String gradDate=sc.nextLine();







			counter = counter+1;
			edu+= education+"\n"+schoolName+","+gradDate+"\n";
			eduArray[eduCounter]=edu;
			eduCounter++;
		}







		//------------------------------------Skills----------------------------------------------------
		int skillCount=0;

		do{
			System.out.println("How many Skills do you have? Minimum is 1. Max is 10");

			skillCount=sc.nextInt();
			sc.nextLine();}
		while(skillCount<1 || skillCount>10);



		String skillArray[];

		skillArray= new String[skillCount];
		int skillCounter=0;
		String skills="";


		for (int i=1; i<=skillCount;i++){




			System.out.println("Enter an Skill you have: " );

			String skill=sc.nextLine();

			System.out.println("Enter your proficieny (1-3) Familiar(1) Proficient(2) Highly Skilled(3) : " );

			int  skillLevel=sc.nextInt();

			sc.nextLine();

			String level = null;

			switch(skillLevel){

			case 1:
				level= "Familiar";
				break;
			case 2:
				level="Proficient";
				break;
			case 3: 
				level= "Highly Skilled";


			}



			skills+= skill+"," +level+"\n";

			System.out.println(skills);



			skillArray[skillCounter]=(skill+ ", " + level+"\n");
			skillCounter++;

		}






		//----------Begin Database portion.

		SqlJava newSql= new SqlJava();
		newSql.sqlMethod(firstName,lastName,email,edu,work,skills);
		


//--end databse 
		
		
		//  Starts Printing Resume 


		System.out.println("=============================================================");

		System.out.println(firstName+ " "+lastName);

		System.out.println(email);
		System.out.println("\n");

		System.out.println("--------------------------------------------------------");

		System.out.println("Education");
		System.out.println("");

		for (int i=0;i<eduArray.length;i++){

			System.out.println(eduArray[i]);

		}

		System.out.println("\n");
		System.out.println("--------------------------------------------------------");
		System.out.println("Experience");
		System.out.println("--------------------------------------------------------");
		System.out.println("");



		for (int i=0;i<workCount;i++){


			System.out.println("work experience "+(i+1) +" " +workArray[i]);
			System.out.println("");

		}




		System.out.println("--------------------------------------------------------\nSkills");
		System.out.println("--------------------------------------------------------\n");

		for (int i=0;i<skillArray.length;i++){
			System.out.print("Skill"+ (i+1)+ ": ");
			System.out.println(skillArray[i]);

		}


		System.out.println("=============================================================");
	}

}


