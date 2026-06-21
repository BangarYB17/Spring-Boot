package com.exam.SB_JWT.util;

import java.util.Date;

import javax.crypto.SecretKey;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {
       private static final SecretKey key =Keys.hmacShaKeyFor("mysecretkeymysecretkeymysecretkey12".getBytes());
       
       public static String generateToken(String username) {
    	      return Jwts.builder().setSubject(username)
    	    		               .setIssuedAt(new Date())
    	    		               .setExpiration(new Date(System.currentTimeMillis()+1000*60))
    	    		               .signWith(key).compact();
       }
}
