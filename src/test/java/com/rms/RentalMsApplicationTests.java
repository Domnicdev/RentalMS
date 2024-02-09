package com.rms;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rms.bean.House;
import com.rms.bean.Login;
import com.rms.bean.Payment;
import com.rms.bean.Review;
import com.rms.bean.User;
import com.rms.service.HouseService;
import com.rms.service.LoginService;
import com.rms.service.PayRentService;
import com.rms.service.PaymentService;
import com.rms.service.ReviewService;
import com.rms.service.UserService;

@SpringBootTest
class RentalMsApplicationTests {

	@Autowired
	UserService userservice;

	@Autowired
	ReviewService reviewservice;

	@Autowired
	PayRentService payrentservice;

	@Autowired
	PaymentService paymentservice;

	@Autowired
	LoginService loginservice;

	@Autowired
	HouseService houseservice;

	boolean val1;
	boolean val2;
	
	List<House> list1 = new ArrayList<>();
	List<House> list2 = new ArrayList<>();	
	
	List<Review> list3 = new ArrayList<>();
	List<Review> list4 = new ArrayList<>();	
	
	List<Payment> list5 = new ArrayList<>();
	List<Payment> list6 = new ArrayList<>();
	
	List<User> list7 = new ArrayList<>();
	List<User> list8 = new ArrayList<>();
	

	Login rs1 = new Login("Admin Success");
	Login rs2 = new Login("Tenant Success");
	Login rs3 = new Login("HouseOwner Success");
	Login rs4 = new Login("Login Fail");

	User user1 = new User(101, "DomnicDev", "domnicdev", "domnicdev@gmail.com", 98766543, "admin");
	User user2 = new User(901, "Mahesh", "Mahesh@123", "mahesh@gmail.com", 75333238, "Tenant");
	User user3 = new User(102, "Domnic", "11964", "domnic@gmail.com", 987654, "HouseOwner");
	User dup = new User(909, "ravind", "dss", "sdsd@gmail.com", 98343, "HouseOwner");

	User owner=new User(1212, "sonkar", "sonkar", "sonkar@gmail.com", 98343, "Owner");
	User ownerupdate=new User(1212, "sankar", "sankar", "sankar@gmail.com", 98343, "Owner");
	
	User tenant=new User(1213, "aaravind", "aaravind", "aaravind@gmail.com", 96543, "Tenant");
	User tenantupdate=new User(1213, "aravind", "aravind", "aravind@gmail.com", 98113, "Tenant");
	
	House house=new House(205,"1BHK","3500","bharathiNagar,Trichy,Tamilnadu",105);
	House houseupdate=new House(205,"2BHK","5500","bharathiNagar,Pudukottai,Tamilnadu",105);
	
	Payment payment = new Payment(1006,5000,"Not Paid",	"0","6700",106,201);
	
	Review review = new Review( 805,"Neat and clean place",202);

	
	
	@Test
	@Order(1)
	void performAdminLogin() {
		Login rs = loginservice.login(user1);
		rs1.equals(rs);
	}

	@Test
	@Order(2)
	void performtenantLogin() {
		Login rs = loginservice.login(user1);
		rs2.equals(rs);
	}

	@Test
	@Order(3)
	void performownerLogin() {
		Login rs = loginservice.login(user3);
		rs3.equals(rs);
	}

	@Test
	@Order(4)
	void performLoginFail() {
		Login rs = loginservice.login(dup);
		rs4.equals(rs);
	}
	
	@Test
	@Order(5)
	void performOwnerInsert() {
		val2=true;
		val1=userservice.addUser(owner);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(6)
	void performOwnerUpdate() {
		val2=true;
		val1=userservice.addUser(ownerupdate);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(7)
	void performOwnerDelete() {
		val2=true;
		val1=userservice.deleteUser(1212);
		assertEquals(val1,val2);
		
	}
	

	@Test
	@Order(8)
	void performTenantInsert() {
		val2=true;
		val1=userservice.addUser(tenant);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(9)
	void performTenantUpdate() {
		val2=true;
		val1=userservice.addUser(tenantupdate);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(10)
	void performTenantDelete() {
		val2=true;
		val1=userservice.deleteUser(1213);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(11)
	void performHouseInsert() {
		val2=true;
		val1=houseservice.addHouse(house);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(12)
	void performHouseUpdate() {
		val2=true;
		val1=houseservice.updateHouse(houseupdate);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(13)
	void performHouseDelete() {
		val2=true;
		val1=houseservice.deleteHouse(205);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(14)
	void performPaymentUpdate() {
		val2=true;
		val1=paymentservice.updatePayment(payment);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(15)
	void performaddReview() {
		val2=true;
		val1=reviewservice.addReview(review);
		assertEquals(val1,val2);
		
	}
	
	@Test
	@Order(16)
	void performviewHouse() {
		list2=houseservice.viewAllHouse();
		list1.add(house);
		list1.equals(list2);
	}
	
	@Test
	@Order(17)
	void performviewReview() {
		list4=reviewservice.viewAllReviews();
		list3.add(review);
		list3.equals(list4);
	}
	
	@Test
	@Order(18)
	void performviewPaymentPaidStatus() {
		list6=paymentservice.viewAllPaidTenants();
		list5.add(payment);
		list5.equals(list6);
	}
	
	@Test
	@Order(19)
	void performviewPaymentNonPaidStatus() {
		list6=paymentservice.viewAllNonPaidTenants();
		list5.add(payment);
		list5.equals(list6);
	}
	

	@Test
	@Order(20)
	void performviewAllUsers() {
		list8=userservice.viewAllUsers();
		list7.add(user1);
		list7.equals(list8);
	}
	
	

}
