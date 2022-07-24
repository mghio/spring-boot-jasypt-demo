package cn.mghio.springbootjasyptdemo.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mghio (mghio.dev@gmail.com)
 */
@Configuration
public class JasyptEncryptorConfig {

  @Bean(value = "jasyptStringEncryptor")
  public StringEncryptor getPasswordEncryptor() {
    PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
    encryptor.setConfig(assembleStringPBEConfig());
    return encryptor;
  }

  private SimpleStringPBEConfig assembleStringPBEConfig() {
    SimpleStringPBEConfig config = new SimpleStringPBEConfig();
    // encryptor private's key
    config.setPassword("Java-mghio");
    config.setAlgorithm("PBEWithMD5AndDES");
    config.setKeyObtentionIterations("1000");
    config.setPoolSize(1);
    config.setProviderName("SunJCE");
    config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
    config.setStringOutputType("base64");
    return config;
  }

}
