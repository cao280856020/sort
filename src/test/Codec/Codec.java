package test.Codec;

import java.util.HashMap;
import java.util.Map;

public class Codec {
	
	private static Map<String,String> map=new HashMap<>();
	
	private final static String DOMAIN="http://tinyurl.com/";
	
	// Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(longUrl==null || longUrl.isEmpty()){
        	return "";
        }
        String domain=longUrl.substring(0,longUrl.indexOf(".com/")+5);
        String text=longUrl.replaceAll(domain, "");
        
        String key=text.hashCode()+"";
        map.put(key, text+","+domain);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	 String url=map.get(shortUrl);
    	 String[] s=url.split(",");
    	 return s[1]+s[0];
    }
    
    public static void main(String[] args){
    	Codec c=new Codec();
    	String encode=c.encode("https://leetcode.com/problems/design-tinyurl");
    	System.out.println(encode);
    	System.out.println(c.decode(encode));
    }
}
