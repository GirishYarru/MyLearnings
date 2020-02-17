package com.zuulproxy.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuulproxy.zuulapigateway.filters.ErrorFilter;
import com.zuulproxy.zuulapigateway.filters.Postfilter;
import com.zuulproxy.zuulapigateway.filters.Prefilter;
import com.zuulproxy.zuulapigateway.filters.RouteFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}

	@Bean
	public Prefilter preFilter() {
		return new Prefilter();
	}
	@Bean
	public Postfilter postFilter() {
		return new Postfilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
