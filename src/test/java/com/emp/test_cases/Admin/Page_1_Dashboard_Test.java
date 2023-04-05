package com.emp.test_cases.Admin;

import org.testng.annotations.Test;

import com.emp.qa.base.TestBase;
import com.emp.qa.pages.Admin.HomePage;
import com.emp.qa.pages.Admin.Page_1__Dashboard;

public class Page_1_Dashboard_Test extends TestBase {

	@Test(priority = 1)
	public void TotalEnrollments_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());

		homePage.clickDashboard();
		DashBoardpage.Total_Enrollments_Employees();

		Thread.sleep(2000); 
	}

	@Test(priority = 2)
	public void CurrentlyACtive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Currently_Active_Employees();

	}

	@Test(priority = 3)
	public void CurrentlyIdle_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Currently_Idle_Employees();
	}

	@Test(priority = 4)
	public void Currently_Offline_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Currently_Offline_Employees();
	}

	@Test(priority = 5)
	public void Absent_Users_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Absent_Users_Employees();
	}

	@Test(priority = 6)
	public void Suspended_Users_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Suspended_Users_Employees();
	}

	@Test(priority = 7)
	public void Top_10_Productive_Employees_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Productive_Employees_Locations();
	}

	@Test(priority = 8)
	public void Top_10_Non_Productive_Employees_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Non_Productive_Employees_Location();
	}

	@Test(priority = 12)
	public void Top_10_Active_Employee_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Active_Employees();
	}

	@Test(priority = 12)
	public void Top_10_Non_Active_Employee_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Non__Active_Employees();
	}

	@Test(priority = 9)
	public void Location_Performance_Productive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Location_Performance_Productive_();
	}

	@Test(priority = 10)
	public void Department_Performance_Productive_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Department_Performance_Productive();
	}

	@Test(priority = 11)
	public void Top10Websitesusages_Today_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Websites_usages_Today();
	}

	@Test(priority = 12)
	public void Top10_Application_Usage_Today_Test() throws Exception {

		HomePage homePage = new HomePage(getDriver());
		Thread.sleep(8000);
		Page_1__Dashboard DashBoardpage = new Page_1__Dashboard(getDriver());
		homePage.clickDashboard();
		DashBoardpage.Top_10_Application_Usage_Today();
	}

}
