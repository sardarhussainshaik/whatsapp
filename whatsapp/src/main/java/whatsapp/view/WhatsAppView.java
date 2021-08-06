package whatsapp.view;
import java.io.*;

import whatsapp.controller.WhatsAppController;
import whatsapp.controller.WhatsAppControllerInterface;
public class WhatsAppView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="y";
		try {
		while(s.equals("y")) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("****MAIN MENU****");
			System.out.println("press 1 to create profile");
			System.out.println("press 2 to edit profile");
			System.out.println("press 3 to search profile");
			System.out.println("press 4 to view profile");
			System.out.println("press 5 to view all profile");
			System.out.println("press 6 to delete profile");
			WhatsAppControllerInterface wc=new WhatsAppController();
			System.out.println("Enter choice");
			int i=Integer.parseInt(br.readLine());
			switch(i) {
			case 1: wc.createProfile();
				break;
			case 2: wc.editProfile();
			break;
			case 3: wc.searchProfile();
			break;
			case 4: wc.viewProfile();
			break;
			case 5: wc.viewAllProfile();
			break;
			case 6: wc.deleteProfile();
			break;
			default: System.out.println("Invalid");
			}
			
			System.out.println("press y/n to continue");
			s=br.readLine();
			
			
			
		}
		
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
