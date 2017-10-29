package com.backBenchers.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author gyaneshpandey
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIGetRetweetsBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIGetRetweetsBean twitterAPIGetRetweetsBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.getRetweetsOfMe()).thenReturn("retweeted");
		
		assertEquals("retweeted",twitterAPIGetRetweetsBean.getRetweetsOfMe());
	}

}

