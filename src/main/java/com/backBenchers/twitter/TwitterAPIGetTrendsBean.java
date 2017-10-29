package com.backBenchers.twitter;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author chidanandapati
 *
 */
public class TwitterAPIGetTrendsBean extends TwitterAPIConfig {
	
	//private static final Logger LOG = LoggerFactory.getLogger(TwitterAPIBean.class);
	private TwitterAPIService twitterAPIService;
	
	public TwitterAPIGetTrendsBean() {
		
	}
	
	public TwitterAPIGetTrendsBean(TwitterAPIService twitterAPIService) {
		this.twitterAPIService=twitterAPIService;
	}
	 
	public String getTrends(String param) {
		System.out.println("getTrends:"+param);
		return twitterAPIService.getTrends(param);
	}
	
//		public static void main(String args[]) {
//			TwitterAPIBean o = new TwitterAPIBean();
//			System.out.println(o.getTweet("Trump"));
//		}
//	
}
