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

Mobile.startApplication('E:\\bikroy.apk', true)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.FrameLayout'), 0)

WebUI.delay(2)

Mobile.setText(findTestObject('Object Repository/Profile/android.widget.EditText -'), 'ashiq30@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/Profile/android.widget.EditText - (1)'), '123456789As@', 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.FrameLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView -'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (2)'), 0)

Mobile.pressBack()

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (4)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (6)'), 0)

WebUI.delay(2)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (8)'), 0)

WebUI.delay(2)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.LinearLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (10)'), 0)

WebUI.delay(2)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (12)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Profile/android.widget.TextView - (14)'), 0)

WebUI.delay(2)

Mobile.closeApplication()

