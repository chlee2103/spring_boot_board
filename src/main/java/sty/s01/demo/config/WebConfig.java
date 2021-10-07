package sty.s01.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// WebMvcConfigurer @bean 등록을 위함
/*
@Configuratio : 서버가 가동된 후 위 어노테이션이 있는 설정에 관련된 것들을 읽어드림
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

}
