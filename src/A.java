import java.util.Random;


public class A {

	public static void main(String[] args) {
		Random rm=new Random();
		for(int i=0;i<100;i++){
			System.out.println(rm.nextInt(100)+1);
		}

	}

}
/*
 * for(int i=0;i<100;i++){
			if(i%10==0){
				System.out.println(i);
			}
			int number =(int) Math.round(Math.random()*100);
			response.getWriter().print(number);
		}
 */