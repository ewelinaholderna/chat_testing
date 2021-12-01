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

WebUI.navigateToUrl('http://bartekkacz.ddns.net:65328/~bartosz/web/zarejestruj.php')

WebUI.setText(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/input_Twoje imie_name'), 'Ewelina')

WebUI.setText(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/input_Twoje nazwisko_surname'), 
    'Hołderna')

WebUI.setText(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/input_Adres e-mail_email'), 'ewelina@gmail.com')

WebUI.setText(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/input_Haslo_haslo'), '12345')

WebUI.check(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/label_Kobieta'))

WebUI.check(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/label_Akceptuje zgody marketingowe'))

WebUI.check(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/label_Zgadzam sie na przechowywanie moich danych osobowych'))

WebUI.click(findTestObject('zadanie 5/Page_WSB - Selenium Playground - zarejestruj sie/button_Zarejestruj'))

