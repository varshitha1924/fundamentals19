package fundamentals19;

public class nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		{ 
			if(gender.equals("female"))
			{
			 if(age>=1 && age<=58) {
				System.out.println("the percentage of interest is 8.2%");	
				}
			 if(age>=59 && age<=100) {
				System.out.println("the percentage of interest is 9.2%");	
				}
			}
		
		  if(gender.equals("male"))
		 {
			 if(age>=1 && age<=58) {
				System.out.println("the percentage of interest is 8.4%");	
				}
			 if(age>=59 && age<=100) {
				System.out.println("the percentage of interest is 10.5%");	
				}
			}
		 }
      }
	}