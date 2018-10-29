
public class Array_exception {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		try {
			int i[] = new int[4];
			
			i[5] =100;
		}catch(Exception e) {
			
			System.out.println("Error occured");
			//screenshot
			//send mail attached screenshot and print error message
			//in mail subject
			e.printStackTrace();
		
		}

	}

}
