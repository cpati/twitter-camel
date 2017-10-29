package com.backBenchers.twitter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.backBenchers.twitter.service.TwitterAPIService;

/**
 * 
 * @author chidanandapati
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIGetTrendsBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIGetTrendsBean twitterAPIGetTrendsBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.getTrends("test")).thenReturn("test trends");
		
		assertEquals("test trends",twitterAPIGetTrendsBean.getTrends("test"));
	}

}
