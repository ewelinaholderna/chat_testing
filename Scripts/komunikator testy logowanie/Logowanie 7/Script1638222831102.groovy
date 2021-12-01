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
    'ewelinaholderna')

WebUI.setText(findTestObject('komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), '123456')

WebUI.getText(findTestObject('Page_WSB - Selenium Playground - Logowanie/input_Haslo_haslo'))

WebUI.setText(findTestObject('Page_WSB - Selenium Playground - Logowanie/input_Haslo_haslo'), toString())

WebUI.setEncryptedText(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_passwordLogin'), 
    'gTdOhju3VKGOhxgoavcrVyCHdPoAotGtq3LRd/yKWzCKN7PQPEMLzUrUC+PQyqCpEGIK1w151l0fg+ZJQiejG8M/awTDEfQ/fcWoKz+TuIqGUNCkim/CY/GSHmvcsJD5DNNE628EAyKQHKJgUv6Lvjqha/kqgrLsbMjhLE2FsBCuyYMOkLAWQm0ay0OecsIDga49xgkuZr6IyP8iuw0dm+E408NHC3ramwNgIeVKaaH5eVuTWc4ReR5c2VV1NVXFRpbqRnsXYrSim0StFWmLjoWWPR8rmM7Z/82a7bpRdBWVGj2aSzOwLw6h70itHjTqvk7Swg+0NqraY4X03x5vC0XYgUzRfLnqBKUmCOcb863HZnkl84d+KmBbDT38hp99Nzq1vmWe01XmpCsR2KeJuZHVV+zE1N6J')

WebUI.click(findTestObject('Object Repository/komunikator/Page_PSTO webMessenger/input_Zarejestruj konto_login'))

