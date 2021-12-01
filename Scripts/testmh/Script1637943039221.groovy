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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://bartekkacz.ddns.net:65328/~bartosz/web/logowanie.php')

WebUI.setText(findTestObject('Object Repository/New Folder222/Page_WSB - Selenium Playground - Logowanie/input_Adres e-mail_email'), 
    'ewelina@GMAIL.COM')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder222/Page_WSB - Selenium Playground - Logowanie/input_Haslo_haslo'), 
    '/Q3VgkGLmVM=')

WebUI.click(findTestObject('Object Repository/New Folder222/Page_WSB - Selenium Playground - Logowanie/button_Zaloguj sie'))

WebUI.verifyElementText(findTestObject('Object Repository/New Folder222/Page_WSB - Selenium Playground - Logowanie _df4482/div_Niepoprawny login Wpisales login  eweli_797567'), 
    'Niepoprawny login! Wpisales login aaaaa oraz haslo 5555555', FailureHandling.OPTIONAL)

WebUI.closeBrowser()

