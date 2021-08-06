package whatsapp.dao;
import java.io.*;
import whatsapp.entity.WhatsAppUser;
import java.util.*;
public class WhatsAppDAO implements WhatsAppDAOInterface {
	private static List<WhatsAppUser> w=new ArrayList<WhatsAppUser>();

	@Override
	public int createProfileDAO(WhatsAppUser wu) {
		// TODO Auto-generated method stub
		w.add(wu);
		return w.size();

	}

	@Override
	public void editProfileDAO(String uid) {
		// TODO Auto-generated method stub
		String ss = "y";
		while(ss.equalsIgnoreCase("y"))
		{
		try
		{
		for(WhatsAppUser fvp : w)
		{
			if(fvp.getName()==uid)
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("***Edits Menu:***");
				System.out.println("1 for Name\n2 for password\n3 for Email\n4 for address");
				int c = Integer.parseInt(br.readLine());
				switch(c)
				{
				case 1:System.out.println("Enter new name: ");
				String name = br.readLine();
				fvp.setName(name);
				break;
				case 2:System.out.println("Enter new password: ");
				String password = br.readLine();
				fvp.setPassword(password);
				break;
				case 3:System.out.println("Enter new email: ");
				String email = br.readLine();
				fvp.setMail(email);	
				break;
				case 4:System.out.println("Enter new address: ");
				String address = br.readLine();
				fvp.setAddress(address);
				break;
				default:System.out.println("Try again");
				}
				System.out.println("Editing: Enter Y or y for yes OR N or n for no: ");
				ss = br.readLine();
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

	}

	@Override
	public String searchProfileDAO(String search) {
		// TODO Auto-generated method stub
		String str = "";
		for(WhatsAppUser f : w) {
			if(f.getName().equalsIgnoreCase(search)) {
				str = "profile found";
			
			}
		}
		if(str.length()!=0)
			return str;
		return "profile not found";

	}

	public ArrayList<String>  viewProfileDAO(String pro) {
		// TODO Auto-generated method stub

		ArrayList<String> st= new ArrayList<String>();
		for(WhatsAppUser f:w) {
			if(f.getName().equalsIgnoreCase(pro)) {
				st.add(f.getName());
				st.add(f.getPassword());
				st.add(f.getMail());
				st.add(f.getAddress());
			}
		}
		return st;

	}

	@Override
	public List<WhatsAppUser> viewAllProfileDAO() {
		// TODO Auto-generated method stub
		return w;

	}

	@Override
	public String deleteProfileDAO(String delete) {
		// TODO Auto-generated method stub
		for(WhatsAppUser f:w) {
			if(f.getName().equalsIgnoreCase(delete)) {
				w.remove(w.indexOf(f));
				return "profile deleted";
			}
		}
		return "no profile found to delete";
	}
	public ArrayList<WhatsAppUser> viewAllProfileDao() {
		return (ArrayList<WhatsAppUser>) w;
	}

	}


