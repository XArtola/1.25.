/**
 * 
 */

/**
 * @author ik013043z1
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Ex_1_25_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File toRead = new File(args[0]);
		
		try {
			Scanner sc = new Scanner(toRead);
			
			int a = 0;
			
			ArrayList <FootballMatch> matches = new ArrayList();
			
			String name = " ";
			
			while(sc.hasNext()) {
				
				name = "match" + a;
				
					FootballMatch name   = new FootballMatch(); 
					
					for (int b = 0; 4 > b; b++) {
						
						name.setLocalTeam(sc.next());;
						name.setVisitorTeam(sc.next());
						name.setGoalsLocal(sc.nextInt());
						name.setGoalsVisitor(sc.nextInt());
						
						
					}
					
				a++;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
