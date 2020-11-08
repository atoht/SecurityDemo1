package com.atoht.security_demo.service;


import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = new com.atoht.security_demo.model.User();
//        user.setId("1");
//        user.setEmail("aaa@gmail.com");
//        user.setLastPasswordResetDate(new Date());
//        user.setRoles(new ArrayList<>(Arrays.asList("role")));
//        user.setUsername("name");
//        user.setPassword("pass");
        

        if (username == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return new User(username, new BCryptPasswordEncoder().encode("pass"), 
            		AuthorityUtils.commaSeparatedStringToAuthorityList("USER, ROLE_USER"));
        }
    }

}
