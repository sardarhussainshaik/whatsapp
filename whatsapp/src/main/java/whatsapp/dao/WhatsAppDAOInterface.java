package whatsapp.dao;

import java.util.ArrayList;
import java.util.List;

import whatsapp.entity.WhatsAppUser;

public interface WhatsAppDAOInterface {

	int createProfileDAO(WhatsAppUser wu);

	void editProfileDAO(String name);

	String searchProfileDAO(String search);

	ArrayList<String> viewProfileDAO(String pro);

	List<WhatsAppUser> viewAllProfileDAO();

	String deleteProfileDAO(String delete);

}

