package hikaru.lk.damcofront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Homepage Controller.
 * 
 * @author Hikarulk
 *
 */
@Controller
public class IndexController {

  /**
   * Welcome.
   * 
   * @return index
   */
  @RequestMapping("/")
  public String welcome() {
    return "index";
  }
}
