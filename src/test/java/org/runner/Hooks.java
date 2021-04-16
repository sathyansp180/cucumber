package org.runner;

import org.lanuch.BasicClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasicClass{
	
	@Before
	public void Cases() {
		removeallcookies();


	}
	@After
	public void cases1() {
		quitbro();
	}
}
