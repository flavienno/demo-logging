package dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		AppService app = new AppService();
		app.executer("hello");

		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");
	}

}
