package OOP;

import java.util.ArrayList;


public class PhoneBook implements Phone  {
	ArrayList<User> phoneList = new ArrayList<User>();

	@Override
	public void insertPhone(String name, String phone) {
		
		User user = new User();
		if(phoneList.size() > 0) {
			for (User us : phoneList) {
				if(us.getName().equals(name)) {
					if(!us.getPhone().contains(phone)) {
						us.setPhone(us.getPhone() + ":" + phone);
						System.out.println(us.getName() +"|"+ us.getPhone());
						break;
					}		
				}
			}
		}
		else {
			user.setName(name);
			user.setPhone(phone);
			phoneList.add(user);
			System.out.println("ADDED");
			System.out.println(user.getName() +"|"+ user.getPhone());
		}
		
		
	}

	@Override
	public void removePhone(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePhone(String name, String newphone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchPhone(String name) {
		// TODO Auto-generated method stub
		//System.out.println("Test!");
		
		for (User user : phoneList) {
			if(user.getName() == name) {
				System.out.println("Found");
			}
			else {
			System.out.println("Not Found!");
			}
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
