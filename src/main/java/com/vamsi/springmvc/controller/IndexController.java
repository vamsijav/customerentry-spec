/**
 * 
 */
package com.vamsi.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author Vamsi
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	 @RequestMapping(method = RequestMethod.GET)
     public String getIndexPage() {
         return "customer";
     }

}