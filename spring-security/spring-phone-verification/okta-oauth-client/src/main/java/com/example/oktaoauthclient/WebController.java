package com.example.oktaoauthclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Simple controller to show login functionality.
 *
 * @author novoydarskiy
 * Date: 19.08.2019
 */
@Controller
public class WebController {

  /**
   * Return 'securePage.html' when user go to http://localhost:8080/securePage
   * @param principal - authenticational object to represent all information about the Login In User
   * @return securePage.html
   */
  @RequestMapping("/securedPage")
  public String securedPage(Principal principal) {
    return "securedPage";
  }

  /**
   * Return 'index.html' when user go to http://localhost:8080/
   * @param principal - authenticational object. 'null' at first time because user is not login in yet.
   * @return index.html
   */
  @RequestMapping("/")
  public String index(Principal principal) {
    return "index";
  }

}
