
public class caught_exception {

	public static void main(String[] args) throws InterruptedException {
		int i[] = new int[4];
		
		i[5] =100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       Thread.sleep(1000);
       Thread.sleep(1000);
	}

}
