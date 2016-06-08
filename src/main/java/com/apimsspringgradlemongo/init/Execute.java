/**
 * 
 */
package com.apimsspringgradlemongo.init;

import org.springframework.boot.SpringApplication;

import com.apimsspringgradlemongo.config.AppConfig;

/**
 * @author eloi eloibilek@gmail.com
 */
public class Execute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
