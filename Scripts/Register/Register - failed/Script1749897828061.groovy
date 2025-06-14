import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import javax.swing.JOptionPane as JOptionPane

WebUI.openBrowser('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Landing page/logo header - img'))

WebUI.scrollToElement(findTestObject('Landing page/Book store application - btn'), 0)

WebUI.click(findTestObject('Landing page/Book store application - btn'))

WebUI.verifyElementVisible(findTestObject('Books page/Login - btn'))

WebUI.click(findTestObject('Books page/Login - btn'))

WebUI.verifyElementPresent(findTestObject('Login page/Form - container'), 0)

WebUI.scrollToElement(findTestObject('Login page/New user - btn'), 0)

WebUI.click(findTestObject('Login page/New user - btn'))

WebUI.verifyElementPresent(findTestObject('Register page/Form - container'), 0)

WebUI.scrollToElement(findTestObject('Register page/Register - btn'), 0)

WebUI.setText(findTestObject('Register page/First name - field'), 'user')

WebUI.setText(findTestObject('Register page/Last name - field'), 'dummy1')

def randomName = 'User' + org.apache.commons.lang.RandomStringUtils.randomNumeric(4)

WebUI.setText(findTestObject('Register page/User name - field'), randomName)

//WebUI.setText(findTestObject('Register page/User name - field'), 'userdummy1')
WebUI.setText(findTestObject('Register page/Password - field'), '@Password12')

WebUI.scrollToElement(findTestObject('Register page/content - container'), 0)

WebUI.click(findTestObject('Register page/Register - btn'))

WebUI.verifyElementPresent(findTestObject('Register page/alert failed regist - txt'), 0)

WebUI.closeBrowser()

