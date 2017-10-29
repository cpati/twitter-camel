package com.backBenchers.twitter;

import com.backBenchers.twitter.service.TwitterAPIService;


/**
 * 
 * @author shalininarang
 *
 */
public class TwitterAPIBean extends TwitterAPIConfig {
	
	//private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIBean.class);
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIBean() {
		
	}
	
	public TwitterAPIBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String getTweet(String param) {
		System.out.println("getTweet:"+param);
		return twitterAPIService.getTweet(param);
	}
	
//		public static void main(String args[]) {
//			TwitterAPIBean o = new TwitterAPIBean();
//			System.out.println(o.getTweet("Trump"));
//		}
//	
}
