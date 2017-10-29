package com.backBenchers.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.backBenchers.twitter.service.TwitterAPIService;
/**
 * 
 * @author shalininarang
 *
 */
public class TwitterAPIGeoBean extends TwitterAPIConfig {
	private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIGeoBean.class);
	
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIGeoBean() {
		
	}
	
	public TwitterAPIGeoBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}

	public String getGeo(String param) {
		return twitterAPIService.getGeoCode(param);
	}

	/*
	public static void main(String args[]) {
		TwitterAPIGeoBean o = new TwitterAPIGeoBean();
		System.out.println(o.getGeo("37.279518: -121.867905"));
	}
	*/
	//

}
