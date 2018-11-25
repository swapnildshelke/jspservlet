package com.sds;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class BirthdayReminderServlet extends HttpServlet{
	public BirthdayReminderServlet(){
		/*while(true) {
			//midnight 12 start clicking in DB...............
			//Midnight 12 o’clock we need to fetch people having birth date today  
			//send mail
			  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  System.out.println("Ending email..........");
		}*/
	}
	
	@Override
	public void init() throws ServletException {
		//logic written in method as per standard best way of coding 
		while(true) {
			//midnight 12 start clicking in DB...............
			//Midnight 12 o’clock we need to fetch people having birth date today  
			//send mail
			  try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			  System.out.println("Ending email..........");
		}
	}
}
