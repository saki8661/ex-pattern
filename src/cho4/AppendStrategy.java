package cho4;

public class AppendStrategy implements EncodingStrategy{

	@Override
	public String encode(String text) {
		
		return "[[[[" + text + " ]]]";
	}

}
