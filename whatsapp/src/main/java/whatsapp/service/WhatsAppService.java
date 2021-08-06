package whatsapp.service;

import java.util.ArrayList;
import java.util.List;

import whatsapp.dao.WhatsAppDAO;
import whatsapp.dao.WhatsAppDAOInterface;
import whatsapp.entity.WhatsAppUser;

public class WhatsAppService implements WhatsAppServiceInterface {

	@Override
	public int createProfileService(WhatsAppUser wu) {
		// TODO Auto-generated method stub
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		int a=wd.createProfileDAO(wu);
		return a;

	}

	@Override
	public void editProfileService(String name) {
		// TODO Auto-generated method stub
		
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		wd.editProfileDAO(name);

	}

	

	@Override
	public ArrayList<String>  viewProfileService(String pro) {
		// TODO Auto-generated method stub
		WhatsAppDAOInterface fd = new WhatsAppDAO();
		ArrayList<String> str = fd.viewProfileDAO(pro);
		return str;
		

	}

	@Override
	public List<WhatsAppUser> viewAllProfileService() {
		// TODO Auto-generated method stub
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		return wd.viewAllProfileDAO();

	}

	@Override
	public String deleteProfileService(String delete) {
		// TODO Auto-generated method stub
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		return wd.deleteProfileDAO(delete);

	}

	@Override
	public String searchProfileService(String search) {
		// TODO Auto-generated method stub
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		return wd.searchProfileDAO(search);
		
	}

	

	

	

}
