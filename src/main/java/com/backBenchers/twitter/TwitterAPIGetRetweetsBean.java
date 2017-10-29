package com.backBenchers.twitter;
import com.backBenchers.twitter.service.TwitterAPIService;
import com.backBenchers.twitter.service.TwitterAPIServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author gyaneshpandey
 *
 */
public class TwitterAPIGetRetweetsBean extends TwitterAPIConfig {
	
	private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIPostTweetBean.class);
	
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIGetRetweetsBean() {
		
	}
	
	public TwitterAPIGetRetweetsBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String getRetweetsOfMe() {
		return twitterAPIService.getRetweetsOfMe();
	}
	
//	public static void main(String args[]) {
//			TwitterAPIService o = new TwitterAPIServiceImpl();
//			System.out.println(o.getRetweetsOfMe());
//		}

}
