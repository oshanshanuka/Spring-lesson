package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.controller"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")/*  / ghla ena ona ehekta req eno nm ek gnna thmai ** mark dnne.apit ona customer ek witrai nm api/v1/customer kyl witrk dnnth pluwn*/
                .allowedOrigins("http://localhost:63342")
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowCredentials(true)
                .allowedHeaders("*");
    }
}
