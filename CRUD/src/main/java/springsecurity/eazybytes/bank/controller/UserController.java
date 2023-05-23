package springsecurity.eazybytes.bank.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springsecurity.eazybytes.bank.model.Users;
import springsecurity.eazybytes.bank.repo.UsersRepo;

@RestController
public class UserController {

   @Autowired
	UsersRepo customerRepo;
   
    @CrossOrigin(origins = "http://localhost:4200")
	
    @GetMapping("/myUsers")
    public List<Users> getUserDetails() {
        return    customerRepo.findAll();
    }

   @CrossOrigin(origins = "http://localhost:4200")
   @PostMapping("/saveUsers")
   public int saveUserDetails(@RequestBody Users  u) { 
	   Users users= new Users();
	  try {
	   users.setId(u.getId());
	   users.setUsername(u.getUsername());
	   users.setPassword(u.getPassword());
	   customerRepo.save(users);
	   return    1;
	  }
	  
	  catch(Exception e) {
		  System.out.println("ERROR Message From PENCHAl-GIT-ok  :-->"+e.getLocalizedMessage());
		  return 0;
	  }
   }
   
}
