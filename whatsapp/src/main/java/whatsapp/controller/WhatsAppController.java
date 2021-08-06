package whatsapp.controller;
import java.io.*;
import java.util.*;
import whatsapp.entity.WhatsAppUser;
import whatsapp.service.WhatsAppService;
import whatsapp.service.WhatsAppServiceInterface;
public class WhatsAppController implements WhatsAppControllerInterface {

	@Override
	public void createProfile() {
		try {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		String name=br.readLine();
		System.out.println("enter your password");
		String password=br.readLine();
		System.out.println("enter your mail");
		String mail=br.readLine();
		System.out.println("enter your address");
		String address=br.readLine();
		
		
		WhatsAppUser wu=new WhatsAppUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setMail(mail);
		wu.setAddress(address);
		
		WhatsAppServiceInterface ws=new WhatsAppService();
		int i=ws.createProfileService(wu);
		if(i>0) {
			System.out.println("profile created sucessfully");
		}
		else {
			System.out.println("profile not created");
		}
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void editProfile() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter profile name to update");
		String name = br.readLine();
		WhatsAppServiceInterface fs = new WhatsAppService();
		fs.editProfileService(name);
	}catch(Exception e) {
		
	}
	}
		

	

	@Override
	public void searchProfile() {
		// TODO Auto-generated method stub
		System.out.println("Enter profile name to search");
		Scanner sc=new Scanner(System.in);
		 String search = sc.nextLine();		
		WhatsAppServiceInterface fs = new WhatsAppService();
		System.out.println(fs.searchProfileService(search));
		

	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter profile name to view");
		 String pro = sc.nextLine();
		WhatsAppServiceInterface ws = new WhatsAppService();
		ArrayList<String> da = ws.viewProfileService(pro);
		if(da.size()==0) {
			System.out.println("profile not found");
		}else {
			for(String s : da)
				System.out.println(s);
		}
	}
		

	

	@Override
	public void viewAllProfile() {
		// TODO Auto-generated method stub
		WhatsAppServiceInterface ws=new WhatsAppService();
        List<WhatsAppUser> ff=ws.viewAllProfileService();
        System.out.println(ff.size()+"  record found");
        
       /* for(WhatsAppUser f:ff) {
            System.out.println("***********start*************");
            System.out.println("Name is "+f.getName());
            System.out.println("Password  is "+f.getPassword());
            System.out.println("email is "+f.getMail());
            System.out.println("Address is "+f.getAddress());
            System.out.println("*************end*************");
        }
		*/
        ff.forEach(f-> {
            System.out.println("***********start*************");
            System.out.println("Name is "+f.getName());
            System.out.println("Password  is "+f.getPassword());
            System.out.println("email is "+f.getMail());
            System.out.println("Address is "+f.getAddress());
            System.out.println("*************end*************");
            });
        
		
		
		
		WhatsAppServiceInterface ws1=new WhatsAppService();
		ws1.viewAllProfileService();

	}

	@Override
	public void deleteProfile() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter profile name to delete");
		 String delete = sc.nextLine();
		WhatsAppServiceInterface fs = new WhatsAppService();
		System.out.println(fs.deleteProfileService(delete));

	}

}
