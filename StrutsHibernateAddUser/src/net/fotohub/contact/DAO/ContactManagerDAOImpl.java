/**
 * 
 */
package net.fotohub.contact.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.classic.Session;

import net.fotohub.contact.model.Contact;
import net.fotohub.contact.util.HibernateUtil;

/**
 * @author Rajesh
 *
 */
public class ContactManagerDAOImpl extends HibernateUtil implements IContactManagerDAO {

	@Override
	public Contact addContact(Contact contact) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		return contact;
	}

	public List<Contact> list() {

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Contact> contacts = null;
		try {

			List<Contact> list = (List<Contact>) session.createQuery("from Contact").list();
			contacts = list;

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return contacts;
	}
}
