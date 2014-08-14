package com.stefanini.git.client;

import com.stefanini.git.service.HappyService;

public class HappyClient {
	
	HappyService hs = new HappyService();
	
	public void makeLifeBetter(){
		hs.makeItBetter();
		hs.makeItHappier();
	}
}
