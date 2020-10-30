package com.atmecs.hibernate.operations;


import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.Transaction;

import com.atmecs.hibernate.entity.User;
import com.atmecs.hibernate.utilities.HibernateUtility;

	public class DeleteUser {
		public void deleteRecord() {

			Scanner scan = new Scanner(System.in);
			final Session session = HibernateUtility.getHibernateSession();
			try {
				Transaction transaction = session.beginTransaction();			System.out.println("Enter the Id of the User to Delete :");
				int id = scan.nextInt();
				String query = "FROM User where userId='" + id + "'" + "";
				List<User> userList = session.createQuery(query).getResultList();
				System.out.println(userList);
				for (User user : userList) {
					String name = user.getName();
					System.out.println("User Name :" + name);
					session.delete(user);
				}
				transaction.commit();
			} catch (SessionException e) {
				System.out.println(e);
			} finally {

				session.close();
			}
		}

}
