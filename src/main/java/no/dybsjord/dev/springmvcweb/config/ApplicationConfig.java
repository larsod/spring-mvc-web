package no.dybsjord.dev.springmvcweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "no.dybsjord.dev.springmvcweb.web.controller")
@Import(WebConfig.class)
public class ApplicationConfig {
}
