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

WebUI.navigateToUrl('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.waitForElementClickable(findTestObject('Momo_Function/btn_started'), 5)

WebUI.waitForElementVisible(findTestObject('Momo_UI/Chat Widget Visibility'), 5)

WebUI.delay(5)

WebUI.takeScreenshot('D:\\Vouch\\Function\\1_chat_widget.png')

WebUI.click(findTestObject('Momo_Function/btn_started'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\2_click_start.png')

WebUI.delay(5)

WebUI.takeScreenshot('D:\\Vouch\\Function\\3_start.png')

WebUI.setText(findTestObject('Momo_Function/input_chat'), 'Amenities')

WebUI.takeScreenshot('D:\\Vouch\\Function\\4_set_text_amenities.png')

WebUI.click(findTestObject('Momo_Function/btn_enter_inside'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.takeScreenshot('D:\\Vouch\\Function\\5_result_amenities.png')

WebUI.click(findTestObject('Momo_Function/more_info_gym'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\6_click_info_gym.png')

WebUI.delay(2)

WebUI.takeScreenshot('D:\\Vouch\\Function\\7_info_gym.png')

WebUI.click(findTestObject('Momo_Function/btn_back_menu'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\8_click_btn_back.png')

WebUI.delay(3)

WebUI.click(findTestObject('Momo_Function/more_info_pool'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\9_click_info_pool.png')

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Vouch\\Function\\10_info_pool.png')

WebUI.click(findTestObject('Momo_Function/btn_Pool_Attire'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\11_click_pool_attire.png')

WebUI.delay(2)

WebUI.takeScreenshot('D:\\Vouch\\Function\\12_pool_attire.png')

WebUI.click(findTestObject('Momo_Function/btn_back_menu'))

WebUI.takeScreenshot('D:\\Vouch\\Function\\13_click_back.png')

WebUI.delay(3)

WebUI.takeScreenshot('D:\\Vouch\\Function\\14_menu_amenities.png')

WebUI.closeBrowser()

