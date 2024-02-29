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

//def testData = findTestData('Data Files/dataFile')
//
//def userName = testData.getObjectValue('Username', 1)
//
//def password = testData.getObjectValue('Password', 1)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://bro.do')

WebUI.click(findTestObject('Web Object/Brodo Main Page/a_Log in'))

WebUI.setText(findTestObject('Web Object/Page_Account  Brodo/input_Email_customeremail'), userName)

WebUI.setText(findTestObject('Web Object/Page_Account  Brodo/input_Forgot_customerpassword'), password)

WebUI.click(findTestObject('Web Object/Page_Account  Brodo/input_Show_customerLogin'))

