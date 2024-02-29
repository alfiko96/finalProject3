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

Mobile.startApplication('C:\\Users\\Alfiko\\Downloads\\Brodo_4.1_apkcombo.com.apk', true)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.TextView - ACCOUNT'), 0)

Mobile.setText(findTestObject('Object Repository/Mobile Object/android.widget.EditText'), userName, 0)

Mobile.setText(findTestObject('Object Repository/Mobile Object/android.widget.EditText (1)'), password, 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.Button'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.TextView - HOME'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.TextView - 44'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile Object/android.widget.Button - Add to Bag'), 0)

Mobile.closeApplication()

