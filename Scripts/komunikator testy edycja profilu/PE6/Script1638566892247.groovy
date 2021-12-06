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

WebUI.navigateToUrl('http://kmg.hcm.pl/testowanie/index.html')

WebUI.setText(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_userLogin'), 
    'ewelinah')

WebUI.setEncryptedText(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_login'))

WebUI.click(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger - Zalogowano/img_Zarejestruj konto_iconImg'))

WebUI.setEncryptedText(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger - Zalogowano/input_Zmie haso_oldPass'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger - Zalogowano/input_Zmie haso_editPass'), 
    'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Page_PSTO webMessenger - Zalogowano/input_Zmie haso_editPassRepeat'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger - Zalogowano/input_Zmie haso_changePassword'))

WebUI.verifyElementText(findTestObject('komunikator/Page_PSTO webMessenger - Zalogowano/p_Podane dotychczasowe haso jest bdne'), 
    'PODANE DOTYCHCZASOWE HASŁO JEST BŁĘDNE!')

WebUI.closeBrowser()

