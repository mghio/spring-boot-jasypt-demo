package cn.mghio.springbootjasyptdemo;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringBootJasyptDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootJasyptDemoApplication.class, args);
  }

}
