package whatsapp.service;
import java.util.*;
import whatsapp.entity.WhatsAppUser;

public interface WhatsAppServiceInterface {

	int createProfileService(WhatsAppUser wu);

	void editProfileService(String name);

	String searchProfileService(String search);

	ArrayList<String> viewProfileService(String pro);

	List<WhatsAppUser> viewAllProfileService();

	String deleteProfileService(String delete);
	
	

	
	
	

}
