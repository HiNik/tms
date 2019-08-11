package by.tms.util;

import org.springframework.util.DigestUtils;

public class PasswordUtil {
  public static String convertPassToMD5(String pass) {
    return DigestUtils.md5DigestAsHex(pass.getBytes());
  }
}
