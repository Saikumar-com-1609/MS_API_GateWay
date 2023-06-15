package com.ait.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		/**
		 * -> exchange object will contain complete request information
		 */

		System.out.println("Filter is Executed...");

		ServerHttpRequest request = exchange.getRequest();

		/**
		 * -> exchange.getRequest will capture complete Request information from browser
		 */

		HttpHeaders headers = request.getHeaders();

		/**
		 * -> from the request information we will get headers by using (.getHeaders)
		 * 
		 * headers contain the data in the form of key and value pair
		 */

		Set<String> keySet = headers.keySet();

		/**
		 * from headers i want to know the all keys then i will go to (.keySet)
		 */

		for (String key : keySet) {
			
			/**
			 * from the keySet i want to get each key (key : keySet)
			 */

			System.out.println(key + "--");

			System.out.println(headers.getValuesAsList(key));

		}

		return chain.filter(exchange);
	}

}
