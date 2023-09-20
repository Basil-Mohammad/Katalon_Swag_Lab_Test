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


// Start Scripting

//Open Browser

WebUI.openBrowser("https://www.saucedemo.com/")

//Maximize window

WebUI.maximizeWindow()

//Set Text in userName

WebUI.setText(findTestObject('Object Repository/TC-03 Scripting Mode/Page_Swag Labs/input_Swag Labs_user-name'), "standard_user")

// Set Text in password

WebUI.setText(findTestObject('Object Repository/TC-03 Scripting Mode/Page_Swag Labs/input_Swag Labs_password'), "secret_sauce")

// Click on login button

WebUI.click(findTestObject('Object Repository/TC-03 Scripting Mode/Page_Swag Labs/input_Swag Labs_login-button'))

//validate the home page

WebUI.verifyElementPresent(findTestObject('Object Repository/TC-03 Scripting Mode/Page_Swag Labs/div_Swag Labs'), 4)

// click on add to cart button

WebUI.click(findTestObject('Object Repository/TC-03 Scripting Mode/Page_Swag Labs/button_Add to cart'))

//Close the brawser

WebUI.closeBrowser()