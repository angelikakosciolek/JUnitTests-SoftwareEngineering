import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	/********************************************************************
	 *                       PERSON CLASS TESTS	                        *
	 ********************************************************************/
	
	// Test default constructor
	@Test
	public void test1() {
		Person p = new Person();
	}
	
	// Test getName(), getAddress(), getPhone(), getEmail()
	@Test
	public void test2() {
		Person p = new Person("Amy", "Galway", "1234", "amy@gmail.com");
		assertEquals("Amy", p.getName());
		assertEquals("Galway", p.getAddress());
		assertEquals("1234", p.getPhone());
		assertEquals("amy@gmail.com", p.getEmail());
	}
	
	// Test setName(), setAddress(), setPhone(), setEmail()
	@Test
	public void test3() {
		Person p = new Person("Amy", "Galway", "1234", "amy@gmail.com");
		p.setName("Kate");
		p.setAddress("Mayo");
		p.setPhone("9999");
		p.setEmail("kate@hotmail.com");
		assertEquals("Kate", p.getName());
		assertEquals("Mayo", p.getAddress());
		assertEquals("9999", p.getPhone());
		assertEquals("kate@hotmail.com", p.getEmail());
	}
	
	// Test toString
	@Test
	public void test4() {
		Person p = new Person("Sean", "Roscommon", "0000", "sean123@gmail.com");
	    String toString = p.toString();
	    assertTrue(toString.contains("\nName: Sean\nAddress: Roscommon\nPhone number: 0000\nEmail address: sean123@gmail.com"));
	}

	/********************************************************************
	 *                       STUDENT CLASS TESTS	                    *
	 ********************************************************************/
	
	
	// Test getStatus()
	@Test
	public void test6() {
		Student s1 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 1);
		assertEquals("freshman", s1.getStatus());
		
		Student s2 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 2);
		assertEquals("sophomore", s2.getStatus());
		
		Student s3 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 3);
		assertEquals("junior", s3.getStatus());
		
		Student s4 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 4);
		assertEquals("senior", s4.getStatus());
		
		Student s5 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 5);
		assertEquals("Unknown", s5.getStatus());
	}
	
	// Test setStatus()
	@Test
	public void test7() {
		Student s1 = new Student("Kate", "Mayo", "1234", "kate99@gmail.com", 1);
		s1.setStatus(4);
		assertEquals("senior", s1.getStatus());
	}
	
	// Test Person class' methods in Student class
	@Test
	public void test8() {
		Student s1 = new Student("Sean", "Roscommon", "0000", "sean123@gmail.com", 3);
		assertEquals("Sean", s1.getName());
		assertEquals("Roscommon", s1.getAddress());
		assertEquals("0000", s1.getPhone());
		assertEquals("sean123@gmail.com", s1.getEmail());
		assertEquals("junior", s1.getStatus());
	}
	
	// Test if Student extends Person
	@Test
	public void test9() {
		Student s1 = new Student("Amy", "Galway", "1234", "amy@gmail.com", 1);
		assertTrue(s1 instanceof Person);
	}
	
	// Test toString
	@Test
	public void test10() {
		Student s = new Student("Patrick", "Sligo", "0000", "pat123@gmail.com", 1);
	    String toString = s.toString();
	    assertTrue(toString.contains("\nName: Patrick\nAddress: Sligo\nPhone number: 0000\nEmail address: pat123@gmail.com\nStatus: freshman"));
	}
	
	/********************************************************************
	 *                       EMPLOYEE CLASS TESTS	                    *
	 ********************************************************************/
	
	// Test getOffice(), getSalary(), getDateHired()
	@Test
	public void test11() {
		Employee e = new Employee("Amy", "Galway", "1234", "amy@gmail.com", 1 , 100000.12);
		assertEquals(1, e.getOffice());
		assertEquals("100000.12", e.getSalary());
		assertEquals("03/08/2017", e.getDateHired());
	}
	
	// Test setOffice(), setSalary(), setDateHired()
	@Test
	public void test12() {
		Employee e = new Employee("Amy", "Galway", "1234", "amy@gmail.com", 1 , 100000.12);
		e.setOffice(2);
		e.setSalary(120000);
		e.setDateHired();
		assertEquals(2, e.getOffice());
		assertEquals("120000.00", e.getSalary());
		assertEquals("03/08/2017", e.getDateHired());
	}
	
	// Test toString
	@Test
	public void test13() {
		Employee e = new Employee("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 120000.00);
	    String toString = e.toString();
	    assertTrue(toString.contains("\nName: Patrick\nAddress: Sligo\nPhone number: 0000\nEmail address: pat123@gmail.com\nOffice: 1\nSalary: $120000.00\nDate hired: " + e.getDateHired()));
	}
	
	// Test if Employee extends Person
	@Test
	public void test14() {
		Employee e = new Employee("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 120000.00);
		assertTrue(e instanceof Person);
	}
	
	/********************************************************************
	 *                       FACULTY CLASS TESTS	                    *
	 ********************************************************************/
	
	// Test getOfficeHours(), getRank()
	@Test
	public void test15() {
		Faculty f = new Faculty("Amy", "Galway", "1234", "amy@gmail.com", 1 , 25000.00, "9-17", "2");
		assertEquals("9-17", f.getOfficeHours());
		assertEquals("2", f.getRank());
	}
	
	// Test setOfficeHours(), setRank()
	@Test
	public void test16() {
		Faculty f = new Faculty("Amy", "Galway", "1234", "amy@gmail.com", 1 , 25000.00, "9-17", "2");
		f.setOfficeHours("8-16");
		f.setRank("1");
		assertEquals("8-16", f.getOfficeHours());
		assertEquals("1", f.getRank());
	}
	
	// Test toString
	@Test
	public void test17() {
		Faculty f = new Faculty("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 120000.00, "9-17", "2");
	    String toString = f.toString();
	    assertTrue(toString.contains("\nName: Patrick\nAddress: Sligo\nPhone number: 0000\nEmail address: pat123@gmail.com\nOffice: 1\nSalary: $120000.00\nDate hired: " + f.getDateHired() + "\nOffice hours: 9-17\nRank: 2"));
	}
	
	// Test if Faculty extends Employee and Person
	@Test
	public void test18() {
		Faculty f = new Faculty("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 120000.00, "9-17", "2");
		assertTrue(f instanceof Employee);
		assertTrue(f instanceof Person);
	}
	
	/********************************************************************
	 *                       STAFF CLASS TESTS	                        *
	 ********************************************************************/
	
	// Test setTitle() and getTitle()
	@Test
	public void test19() {
		Staff st = new Staff("Amy", "Galway", "1234", "amy@gmail.com", 1 , 25000.00, "Academic #1");
		assertEquals("Academic #1", st.getTitle());
		st.setTitle("Academic #2");
		assertEquals("Academic #2", st.getTitle());
	}
	
	// Test toString
	@Test
	public void test20() {
		Staff st = new Staff("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 120000.00, "Academic #1");
	    String toString = st.toString();
	    assertTrue(toString.contains("\nName: Patrick\nAddress: Sligo\nPhone number: 0000\nEmail address: pat123@gmail.com\nOffice: 1\nSalary: $120000.00\nDate hired: " + st.getDateHired() + "\nTitle: Academic"));
	}
	
	// Test if Staff extends Employee and Person
	@Test
	public void test21() {
		Staff st = new Staff("Patrick", "Sligo", "0000", "pat123@gmail.com", 1, 420000.00, "Academic #1");
		assertTrue(st instanceof Employee);
		assertTrue(st instanceof Person);
	}
	
	/********************************************************************
	 *                       MYDATE CLASS TESTS	                        *
	 ********************************************************************/
	
	// Test setDate() and getDay(), getMonth(), getYear()
	@Test
	public void test22() {
		MyDate md = new MyDate();
		md.setDate(12);
		assertEquals("01", md.getDay());
		assertEquals("01", md.getMonth());
		assertEquals(1970, md.getYear());
	}
	
	// Test 3 argument constructor
	@Test
	public void test23() {
		MyDate md = new MyDate(2017, 11, 20);
		assertEquals("20", md.getDay());
		assertEquals("12", md.getMonth());
		assertEquals(2017, md.getYear());
	}
	
	// Test 1 argument constructor
	@Test
	public void test24() {
		MyDate md = new MyDate(2017);
		assertEquals("01", md.getDay());
		assertEquals("01", md.getMonth());
		assertEquals(1970, md.getYear());
	}
	
}
