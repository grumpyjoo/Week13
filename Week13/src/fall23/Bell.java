package fall23;
import java.util.*;
import java.io.IOException;
interface clients{
	public void message();
	public void call();
}

public class Bell implements clients{
	public void message() {
		System.out.println("");
	}
	
	public void call() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a message: ");
		String msg = sc.nextLine();
		long start = System.currentTimeMillis();
		

		try {
			System.in.read();
			long finishTime = System.currentTimeMillis();
			System.out.println((finishTime - start)/1000) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Bell b = new Bell();
		b.call();
		
		
		
		
		
		
	}
	
	
}


