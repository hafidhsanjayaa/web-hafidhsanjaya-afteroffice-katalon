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

WebUI.openBrowser('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Landing page/logo header - img'))

WebUI.scrollToElement(findTestObject('Landing page/Book store application - btn'), 0)

WebUI.click(findTestObject('Landing page/Book store application - btn'))

WebUI.verifyElementVisible(findTestObject('Books page/Login - btn'))

WebUI.click(findTestObject('Books page/Login - btn'))

WebUI.verifyElementPresent(findTestObject('Login page/Form - container'), 0)

WebUI.scrollToElement(findTestObject('Login page/Login - btn'), 0)

WebUI.setText(findTestObject('Login page/username - field'), 'userdummy1')

WebUI.setText(findTestObject('Login page/password - field'), '@Password12')

WebUI.click(findTestObject('Login page/Login - btn'))

WebUI.verifyElementPresent(findTestObject('Profile page/Username - label'), 0)

WebUI.closeBrowser()

