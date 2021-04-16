package org.pojo;

import org.lanuch.BasicClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BasicClass {

	public Pojo() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath ="//input[@name='username']" )
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@name='login']" )
	private WebElement click;
	
	@FindBy(xpath = "//select[@name='location']" )
	private WebElement select1;
	
	@FindBy(xpath = "//select[@name='hotels']" )
	private WebElement select2;
	
	@FindBy(xpath = "//select[@name='room_type']" )
	private WebElement select3;
	
	@FindBy(xpath = "//select[@name='room_nos']" )
	private WebElement Rooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement clear1;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement date1;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement clear2;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement date2;
	
	@FindBy(xpath = "//select[@id='adult_room']" )
	private WebElement adultroom;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement click1;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement click3;

	public WebElement getClick3() {
		return click3;
	}
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement Contiu;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement Accountno;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardname;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement expritymonth;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement exprityyear;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cardpass;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement Click_book;
	
	
	
	

	public WebElement getClick_book() {
		return Click_book;
	}

	public WebElement getContiu() {
		return Contiu;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAccountno() {
		return Accountno;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getExpritymonth() {
		return expritymonth;
	}

	public WebElement getExprityyear() {
		return exprityyear;
	}

	public WebElement getCardpass() {
		return cardpass;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSelect1() {
		return select1;
	}

	public WebElement getSelect2() {
		return select2;
	}

	public WebElement getSelect3() {
		return select3;
	}

	public WebElement getRooms() {
		return Rooms;
	}

	public WebElement getClear1() {
		return clear1;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getClear2() {
		return clear2;
	}

	public WebElement getDate2() {
		return date2;
	}
	
	
	
	
	
	
}
