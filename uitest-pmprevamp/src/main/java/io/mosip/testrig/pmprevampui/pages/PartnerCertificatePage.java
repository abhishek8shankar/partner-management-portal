package io.mosip.testrig.pmprevampui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.mosip.testrig.pmprevampui.utility.TestRunner;

public class PartnerCertificatePage extends BasePage {

	@FindBy(id = "title_back_icon")
	private WebElement partnerCertificateTitle;

	@FindBy(xpath = "//*[text()='Upload']")
	private WebElement uploadButton;

	@FindBy(xpath = "//*[text()='Upload Partner Certificate']")
	private WebElement uploadPartnerCertificatePopUp;

	@FindBy(xpath = "//*[text()='Submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//*[text()='Partner certificate for Authentication Partner is uploaded successfully.']")
	private WebElement sucessMessage;

	@FindBy(id = "fileInput")
	private WebElement uploadFile;

	@FindBy(xpath = "//*[text()='Close']")
	private WebElement closeButton;

	@FindBy(xpath = "//*[text()='Re-Upload Partner Certificate']")
	private WebElement ReUploadPartnerCertificateText;

	@FindBy(xpath = "//*[text()='Please select all fields and upload the certificate")
	private WebElement ReUploadPartnerCertificateSubText;

	@FindBy(xpath = "//*[text()='Originally uploaded CA signed certificate downloaded successfully.']")
	private WebElement originalSignedCertDownloadedPopup;

	@FindBy(xpath = "//*[text()='MOSIP signed certificate downloaded successfully.']")
	private WebElement mosipSignedCertPopup;

	@FindBy(xpath = "//*[text()='Partner Domain Type']")
	private WebElement partnerDomainType;

	@FindBy(id = "upload_file_FILL0_wght200_GRAD0_opsz24")
	private WebElement partnerCertOvelay;

	@FindBy(xpath = "//*[contains(text(), \"The certificate uploaded is not in the correct format.\")]")
	private WebElement InvalidFormatErrorPopup;

	@FindBy(id = "sub_title_home_btn")
	private WebElement homeButton;

	@FindBy(id = "download_btn1")
	private WebElement downloadButton;

	@FindBy(id = "original_certificate_download_btn1")
	private WebElement originalCertificateDownloadButton;

	@FindBy(id = "mosip_signed_certificate_download_btn1")
	private WebElement mosipSignedCertificateDownloadButton;

	@FindBy(id = "partner_certificate_re_upload_btn1")
	private WebElement partnerCertificateReuploadButton;

	@FindBy(id = "certificate_upload_close_btn")
	private WebElement certificateUploadCloseButton;

	@FindBy(id = "remove_certificate_btn")
	private WebElement removeCertificateButton;

	@FindBy(id = "certificate_upload_cancel_btn")
	private WebElement certificateUploadCancelButton;

	public PartnerCertificatePage(WebDriver driver) {
		super(driver);
	}

	public boolean isPartnerCertificatePageDisplayed() {
		return isElementDisplayed(partnerCertificateTitle);
	}

	public void clickOnUploadButton() {
		clickOnElement(uploadButton);
	}

	public boolean isUploadPartnerCertificatePopUpDisplayed() {
		return isElementDisplayed(uploadPartnerCertificatePopUp);
	}

	public void uploadCertificate() {
		uploadImage(uploadFile, TestRunner.getResourcePath() + "\\pmp_revamp_cert\\Client.cer");
	}

	public void clickOnSubmitButton() {
		clickOnElement(submitButton);
	}

	public boolean isSucessMessageDisplayed() {
		return isElementDisplayed(sucessMessage);
	}

	public void clickOnCloseButton() {
		clickOnElement(closeButton);
	}

	public DashboardPage clickOnHomeButton() {
		clickOnElement(homeButton);
		return new DashboardPage(driver);
	}

	public boolean isDownloadButtonDisplayed() {
		return isElementDisplayed(downloadButton);
	}

	public void clickOnPartnerCertificateReuploadButton() {
		clickOnElement(partnerCertificateReuploadButton);
	}

	public void clickOnDownloadButton() {
		clickOnElement(downloadButton);
	}

	public void clickOnOriginalCertificateDownloadButton() {
		clickOnElement(originalCertificateDownloadButton);
	}

	public void clickOnMosipSignedCertificateDownloadButton() {
		clickOnElement(mosipSignedCertificateDownloadButton);
	}

	public boolean isOriginalSignedCertDownloadedPopupDisplayed() {
		return isElementDisplayed(originalSignedCertDownloadedPopup);
	}

	public boolean isMosipSignedCertPopupDisplayed() {
		return isElementDisplayed(mosipSignedCertPopup);
	}

	public void clickOncertificateUploadCloseButton() {
		clickOnElement(certificateUploadCloseButton);
	}

	public boolean isReUploadPartnerCertificateTextDisplayed() {
		return isElementDisplayed(ReUploadPartnerCertificateText);
	}

	public boolean isReUploadPartnerCertificateSubTextDisplayed() {
		return isElementDisplayed(ReUploadPartnerCertificateSubText);
	}

	public void uploadCertificateInvalidCert() {
		uploadImage(uploadFile, TestRunner.getResourcePath() + "\\pmp_revamp_cert\\cert.crdownload");
	}

	public void clickOnRemoveCertificateButton() {
		clickOnElement(removeCertificateButton);
	}

	public boolean isPartnerDomainTypeDisplayed() {
		return isElementDisplayed(partnerDomainType);
	}

	public boolean isPartnerCertOvelayDisplayed() {
		return isElementDisplayed(partnerCertOvelay);
	}

	public boolean isInvalidFormatErrorPopupDisplayed() {
		return isElementDisplayed(InvalidFormatErrorPopup);
	}

	public void clickOnCertificateUploadCancelButton() {
		clickOnElement(certificateUploadCancelButton);
	}

}
