package parse;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse {
	
	private static final String ALL_PATTERN="C．(.+)D．(.+)";

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		//先判断一行全部时
		Pattern allPattern = Pattern.compile(ALL_PATTERN);
		 
	    Matcher allMatch = allPattern.matcher("C．非单射且非满射");
	    if (allMatch.find()) {
	    	System.out.println(allMatch.group(1));
	    	System.out.println(allMatch.group(2));
        }

	}

}
