/*******************************************************************************
 * Project Key : MÜST869759 Create on 2021年4月26日 下午3:30:03 Copyright (c) 2021.中華音樂著作權協會版權所有.
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/

package org.must.must.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <P>TODO</P>
 * 
 * @version $Id$
 * @user xxx 2021年8月10日 下午3:30:03
 */
@EnableWebSecurity
public class securityConfigure extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO
		System.out.println("------security authorize------");

		 http
         .authorizeRequests()
         .antMatchers(HttpMethod.GET, "/lal/**").authenticated()
         //.antMatchers(HttpMethod.GET).permitAll()
         //.antMatchers(HttpMethod.POST, "/lal").permitAll()
         //.anyRequest().authenticated()
         .and()
         .csrf().disable()
         .formLogin();
		
	}
	
	
}
