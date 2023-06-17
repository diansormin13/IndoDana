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

WebUI.navigateToUrl('https://www.cermati.com/app/gabung')

'Email\t\t'
WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Email_email'), 
    'Test0000test123@gmail.com')

'No Handphone'
WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_No. Handphone_mobilePhone'), 
    '62819555831')

'Kata Sandi'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Kata Sandi_password'), 
    'p01Ya3wsGwKHaDFUmrbV9g==')

'Cofirm Kata Sandi'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Ulangi Kata Sandi_confirmPassword'), 
    'p01Ya3wsGwKHaDFUmrbV9g==')

'Nama Depan'
WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Depan_firstName'), 
    'Tester')

'Nama Belakang'
WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_Nama Belakang_lastName'), 
    'Tester')

'Kota'
WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'Kota Bekasi')

WebUI.setText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/input_KabupatenKota_cityAndProvince'), 
    'KOTA BEKASI')

'error message Kota'
WebUI.getText(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/div_KabupatenKota tidak tersedia di dalam p_a37b41'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Cermati Pinjaman, Kartu Kredit, Asuran_094e95/p_Daftar'))

WebUI.closeBrowser()

