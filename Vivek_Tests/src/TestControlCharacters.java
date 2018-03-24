import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestControlCharacters {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("one[.]*");
		 Matcher m = p.matcher("We take oneas step forward, two steps back");
		 boolean b = m.matches();
		System.out.println(m.find());
		 /* System.out.println(m.start());
		 System.out.println(m.end());*/
		 
		 String strInput = "foof";
		 String strRegex = "foo.";
		 
		 System.out.println(strInput.matches(strRegex));
		 
	}

}
