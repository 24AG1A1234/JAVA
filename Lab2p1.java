import java.util.Scanner;

public class Lab2p1 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);	
		        outerwhile:
			while(true){
				System.out.println("enter the number:");
				int x=s.nextInt();
				int k=1;
				while(k<=10){
					System.out.println(k +" * "+x+"= "+(k*x));
					k++;
				}
					System.out.println("do you want to continue! , press 1 else 0");
					int m=s.nextInt();
					switch(m){
						case 0:
							break outerwhile;
						case 1:
							continue;
                        default:
                    System.out.println("Invalid choice! Exiting program.");
                    break outerwhile;
					}
					
			}
            s.close();
		
	}
}
    

