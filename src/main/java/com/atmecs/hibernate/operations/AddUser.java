package com.atmecs.hibernate.operations;

import org.hibernate.Transaction;

import com.atmecs.hibernate.entity.Profile;
import com.atmecs.hibernate.entity.User;
import com.atmecs.hibernate.utilities.HibernateUtility;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionException;


	public class AddUser {

	public  void addRecord() {
		
		Scanner scan=new  Scanner(System.in);
		final Session session=HibernateUtility.getHibernateSession();
		try {
		    Transaction transaction=session.beginTransaction();

			System.out.println("Enter the number of records you want to insert :");
			int recordCount=scan.nextInt();
			for(int i=1;i<=recordCount;i++)
			{
				System.out.println("Enter the details of User :"+i);
				System.out.println("Enter the Name :");
				String name=scan.next();
				System.out.println("Enter Email: ");
				String email=scan.next();
				
				System.out.println("Enter the PhoneNumber:");
				String phoneNumber=scan.next();
				System.out.println("Enter the Gender :");
				String gender=scan.next();
			
				Profile profileObject=new Profile();
				profileObject.setPhoneNumber(phoneNumber);
				profileObject.setGender(gender);
				profileObject.setUser(new User(name,email));
				
			
				session.save(profileObject);
				
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
