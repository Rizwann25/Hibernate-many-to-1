package com.atmecs.hibernate.operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

import com.atmecs.hibernate.utilities.HibernateUtility;

	public class UpdateUser {
	public  void updateRecord() {
			
		Scanner scan=new  Scanner(System.in);
			final Session session=HibernateUtility.getHibernateSession();
			try {
			    Transaction transaction=session.beginTransaction();
			    
			    
			    System.out.println("Enter User Id to Update:");
				int id=scan.nextInt();
			    System.out.println("Choose the field you want to modify:\n1.Name\n2.Email\n3.Phone Number\n4.Gender");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the value to be Modify :");
					String name=scan.next();
					String updateNameQuery="UPDATE User u SET u.name='"+name+"' WHERE userId='"+id+"'";
					session.createQuery(updateNameQuery).executeUpdate();
					break;
				case 2:
					System.out.println("Enter the value to be Modify :");
					String email=scan.next();
					String updateEmailQuery="UPDATE User u SET u.email='"+email+"' WHERE userId='"+id+"'";
					session.createQuery(updateEmailQuery).executeUpdate();
					break;
				case 3:
					System.out.println("Enter the value to be Modify :");
					String phoneNumber=scan.next();
					String updateNumberQuery="UPDATE User u SET u.phoneNumber='"+phoneNumber+"' WHERE userId='"+id+"'";
					session.createQuery(updateNumberQuery).executeUpdate();
					break;
				case 4:
					System.out.println("Enter the value to be Modify :");
					String gender=scan.next();
					String updateGenderQuery="UPDATE User u SET u.gender='"+gender+"' WHERE userId='"+id+"'";
					session.createQuery(updateGenderQuery).executeUpdate();
					break;
				default:
					System.out.println("Wrong Chocie");
					break;
				}
				transaction.commit();
				}
			catch(SessionException e)
			{
				System.out.println(e);
			}
			finally {
				
				session.close();
			}
		}
}
