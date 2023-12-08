package cho4;


@FunctionalInterface // 람다 표현 사용 가능(추상메서드 1개만 사용)
public interface EncodingStrategy {
	String encode(String text);
//	String encode1(String text);	
}
