package anhtester.com.testcases;

import anhtester.com.common.BaseTest;
import anhtester.com.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectTest extends BaseTest {

    @BeforeMethod
    public void setupTest() {
        loginPage = new LoginPage();
    }

    @Test
    public void testOpenProject() {
        dashboardPage = loginPage.logIn("admin01", "123456"); //dashboardPage = new DashboardPage(driver);
        dashboardPage.openProject();

    }

    @Test
    public void testAddProject() {
        dashboardPage = loginPage.logIn("admin01", "123456");
        projectPage = dashboardPage.openProject();
        projectPage.addProject("PD0609A1");
    }

    @Test
    public void testNavigateToTasks() {
        dashboardPage = loginPage.logIn("leader01", "123456");
        projectPage = dashboardPage.openProject();
        projectPage.openTask();

    }

}