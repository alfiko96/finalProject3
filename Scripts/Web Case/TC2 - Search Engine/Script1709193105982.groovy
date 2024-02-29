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

def testData = findTestData('Data Files/dataFile')

def userName = testData.getObjectValue('Username', 1)

def password = testData.getObjectValue('Password', 1)

WebUI.callTestCase(findTestCase('Web Case/TC1 - Login'), [('userName') : userName, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Object/Page_Account  Brodo/a_Search'))

WebUI.setText(findTestObject('Web Object/Page_Account  Brodo/input_Cart_q'), 'shoes')

WebUI.sendKeys(findTestObject('Web Object/Page_Account  Brodo/input_Cart_q'), Keys.chord(Keys.ENTER))
//WebUI.click(findTestObject('Web Object/Page_Account  Brodo/svg_Cart_icon icon-search'))

WebUI.click(findTestObject('Web Object/Search Results/itemName'))

WebUI.click(findTestObject('Web Object/Item Page/itemSize'))

WebUI.click(findTestObject('Web Object/Item Page/button_Add to cart'))

