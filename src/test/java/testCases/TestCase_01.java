package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.CareersPage;
import pageObjects.QaEngineerPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TestCase_01 extends BaseClass {

	@Test(priority = 1)
	public void verify_header_text() {

		CareersPage carPg = new CareersPage(driver);
		String text = carPg.getHeaderText();
		Assert.assertEquals(text, "JOIN OUR CREW");
	}

	@Test(priority = 2)
	public void filter_by_dropdown() {

		CareersPage carPg = new CareersPage(driver);
		carPg.selectFilter("Engineering");
		QaEngineerPage qep = new QaEngineerPage(driver);
		Assert.assertEquals(qep.getHeaderText(), "QA Engineer");

	}

	@Test(priority = 3)
	public void Verify_page_title() {
		QaEngineerPage qep = new QaEngineerPage(driver);
		Assert.assertEquals(qep.getPageTitleText(), "Numadic Iot Pvt. Ltd. - QA Engineer in");

	}

	@Test(priority = 4)
	public void Verify_interested_btn() {
		QaEngineerPage qep = new QaEngineerPage(driver);
		qep.clickImInterested();
		Assert.assertEquals(qep.getJobAppText(), "Job application");
	}

	@Test(priority = 5, dataProvider = "fieldValidation", dataProviderClass = DataProviders.class)
	public void Verify_validation_allfields(String vald1, String vald2, String vald3, String vald4, String vald5, String vald6, String vald7,
			String vald8, String vald9, String vald10, String vald11) {
		SoftAssert myassert = new SoftAssert();
		QaEngineerPage qep = new QaEngineerPage(driver);
		qep.clickSubmit();

		myassert.assertEquals(qep.getFirstNameValidation(), vald1);
		myassert.assertEquals(qep.getLastNameValidation(), vald2);
		myassert.assertEquals(qep.getEmailValidation(), vald3);
		myassert.assertEquals(qep.getMobileValidation(), vald4);

		myassert.assertEquals(qep.getEmployerValidation(), vald5);
		myassert.assertEquals(qep.getjobValidation(), vald6);
		myassert.assertEquals(qep.getCurrentCTCValidation(), vald7);
		myassert.assertEquals(qep.getExpectedCTCValidation(), vald8);

		myassert.assertEquals(qep.getnoticePeriodValidation(), vald9);
		myassert.assertEquals(qep.getReasonValidation(), vald10);

		myassert.assertEquals(qep.getResumeValidation(), vald11);

		myassert.assertAll();
	}

	@Test(invocationCount = 1, priority = 6, dataProvider = "JobAppdata", dataProviderClass = DataProviders.class)
	public void negativeTest(String first, String last, String email, String mobile) {
		QaEngineerPage qep = new QaEngineerPage(driver);
		qep.setFirstname(first);
		qep.setLastname(last);
		qep.setEmail(email);
		qep.setMobile(mobile);
		Assert.assertEquals(qep.getHeaderText(), "QAEngineer");
	}

}
