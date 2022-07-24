package cn.mghio.springbootjasyptdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cn.mghio.springbootjasyptdemo.config.JasyptEncryptorConfig;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author mghio (mghio.dev@gmail.com)
 */
public class PasswordEncryptionTest {

  @Test
  public void testPasswordEncryption() {
    JasyptEncryptorConfig encryptorConfig = new JasyptEncryptorConfig();
    StringEncryptor stringEncryptor = encryptorConfig.getPasswordEncryptor();

    String plainText = "rootpassword";
    String encryptedPassword = stringEncryptor.encrypt(plainText);
    System.out.println("encryptedPassword ----> " + encryptedPassword);

    String decryptedPassword = stringEncryptor.decrypt(encryptedPassword);
    assertEquals(plainText, decryptedPassword);
  }

}
