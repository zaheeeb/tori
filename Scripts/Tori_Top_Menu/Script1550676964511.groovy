import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementClickable(findTestObject('TOP_MENU/p_Kaikki ilmoitukset'), 2)

WebUI.click(findTestObject('TOP_MENU/p_Kaikki ilmoitukset'))

WebUI.waitForElementClickable(findTestObject('TOP_MENU/p_Autot'), 2)

WebUI.click(findTestObject('TOP_MENU/p_Autot'))

WebUI.waitForElementClickable(findTestObject('TOP_MENU/p_Asunnot'), 2)

WebUI.click(findTestObject('TOP_MENU/p_Asunnot'))

WebUI.waitForElementClickable(findTestObject('TOP_MENU/p_Tori-kaupat'), 2)

WebUI.click(findTestObject('TOP_MENU/p_Tori-kaupat'))

WebUI.waitForElementClickable(findTestObject('TOP_MENU/div_Tori-kaupat_header_logo'), 2)

WebUI.click(findTestObject('TOP_MENU/div_Tori-kaupat_header_logo'))

WebUI.closeBrowser()

