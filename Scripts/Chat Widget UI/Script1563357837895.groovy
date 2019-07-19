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

WebUI.openBrowser('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.waitForPageLoad(5)

WebUI.waitForElementVisible(findTestObject('Momo_UI/Chat Widget Visibility'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Vouch\\UI\\1_chat_widget.png')

WebUI.waitForElementVisible(findTestObject('Momo_UI/Close Button'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Momo_UI/Close Button'))

WebUI.waitForElementNotVisible(findTestObject('Momo_UI/Chat Widget Visibility'), 0)

WebUI.verifyElementNotVisibleInViewport(findTestObject('Momo_UI/Chat Widget Visibility'), 2)

WebUI.delay(2)

WebUI.takeScreenshot('D:\\Vouch\\UI\\2_closed_widget.png')

WebUI.click(findTestObject('Momo_UI/Momo_Open'))

WebUI.delay(1)

WebUI.takeScreenshot('D:\\Vouch\\UI\\3_opened_widget.png')

WebUI.closeBrowser()

