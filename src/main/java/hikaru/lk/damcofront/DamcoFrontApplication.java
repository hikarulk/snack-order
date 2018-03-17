package hikaru.lk.damcofront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Damco front Spring boot application..
 * 
 * @author Hikarulk
 *
 */
@SpringBootApplication
public class DamcoFrontApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(DamcoFrontApplication.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(DamcoFrontApplication.class, args);
  }
}
