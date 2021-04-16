package org.models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.lanuch.BasicClass;
import org.pojo.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Models1 extends BasicClass {

	public static Pojo p1;
	public static Pojo p;
	@Given("user have login the page")
	public void user_have_login_the_page() {
		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		removeallcookies();
	}
	@When("user enter the username and password")
	public void user_enter_the_username_and_password(DataTable d) throws FileNotFoundException {
		
		
		
		List<String> list = d.asList();
		java.lang.String username = list.get(0);
		java.lang.String pass = list.get(1);
		
		p = new Pojo();
		type(p.getUsername(), username);
		type(p.getPass(), pass);
	}

	@When("user have click the login")
	public void user_have_click_the_login() {
		toClick(p.getClick());
	}

@When("user select Location,hotels,Room types,number of rooms,Check in Date,Check out date,adults per room.")
public void user_select_Location_hotels_Room_types_number_of_rooms_Check_in_Date_Check_out_date_adults_per_room(io.cucumber.datatable.DataTable dt) {
   
	List<java.lang.String> list1 = dt.asList();
	
	java.lang.String London = list1.get(0);
	java.lang.String HotelSunshine = list1.get(1);
	java.lang.String Deluxe = list1.get(2);
	java.lang.String string4 = list1.get(3);
	java.lang.String string5 = list1.get(4);
	java.lang.String string6 = list1.get(5);
	java.lang.String string7 = list1.get(6);
	
		p = new Pojo();
		selectValue(p.getSelect1(), London);
		selectValue(p.getSelect2(), HotelSunshine);
		selectValue(p.getSelect3(), Deluxe);
		type(p.getRooms(), string4);
		//		selectValue(p.getRooms(),string4);
		clear(p.getClear1());
		type(p.getDate1(), string5);
		clear(p.getClear2());
		type(p.getDate2(), string6);
		selectValue(p.getAdultroom(), string7);
		toClick(p.getClick1());
	}

	@When("user is click search button")
	public void user_is_click_search_button() {
		toClick(p.getClick3());
	}


	@When("user is click search and continue")
	public void user_is_click_search_and_continue() {
		toClick(p.getContiu());
	}
	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string}.")
	public void user_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		type(p.getFirstname(), string);
		type(p.getLastname(), string2);
		type(p.getAddress(), string3);
		type(p.getAccountno(), string4);
		type(p.getCardname(), string5);
		type(p.getExpritymonth(), string6);
		selectValue(p.getExprityyear(), string7);
		//	type(p.getExprityyear(), string7);
		type(p.getCardpass(), string8);	
	}
	@Then("user is click the book now")
	public void user_is_click_the_book_now() {
		toClick(p.getClick_book());
	}
}
