/**
 * 
 */
package net.fotohub.contact.controller;

import com.opensymphony.xwork2.ActionSupport;

import net.fotohub.contact.DAO.ContactManagerDAOImpl;
import net.fotohub.contact.DAO.IContactManagerDAO;
import net.fotohub.contact.model.Contact;

/**
 * @author Rajesh
 *
 */
public class ContactAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Contact contact;
	private IContactManagerDAO contactManagerDAOImpl;

	public ContactAction() {
		contactManagerDAOImpl = new ContactManagerDAOImpl();
	}

	public String addContact() {
		try {
			contactManagerDAOImpl.addContact(getContact());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
