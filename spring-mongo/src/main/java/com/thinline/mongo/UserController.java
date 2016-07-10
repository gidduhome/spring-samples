package com.thinline.mongo;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

 
	@Autowired
	private UserRepository repository;
	
    @RequestMapping(value="/first",method=RequestMethod.GET)
    public @ResponseBody User getUser(@RequestParam(value="name", required=true, defaultValue="Stranger") String name) {	
    	return repository.findByFirstName(name);
 
    }
    
    @RequestMapping(value="/last",method=RequestMethod.GET)
    public @ResponseBody List<User> getUserList(@RequestParam(value="name", required=true, defaultValue="Stranger") String name) {	
    	return repository.findByLastName(name);
  
    }
}