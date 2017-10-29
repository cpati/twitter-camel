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
 * @author shalininarang
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterAPIBeanTest {
	
	@Mock
	TwitterAPIService twitterAPIServiceMock;
	
	@InjectMocks
	TwitterAPIBean twitterAPIBean;
	
	@Test
	public void test() {
		
		when(twitterAPIServiceMock.getTweet(anyString())).thenReturn("test backbenchers");
		
		assertEquals("test backbenchers",twitterAPIBean.getTweet("test"));
	}

}
