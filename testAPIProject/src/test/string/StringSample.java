package test.string;

import java.util.StringTokenizer;

public class StringSample {
	public StringSample() {
	}

	public void immutableString() {
		// 문자열 값은 java VM에 의해 문자열 저장소(Literal Pool)에서
		// 따로 저장 관리됨 => 문자열 값은 문자열저장소에 기록됨
		// 무자열 저장소에 기록된 문자열값은 한번만 기록됨
		// 기록된 문자열은 수정할 수 없음 : immutable

		String s1 = "java"; // 문자열저장소에 "java" 기록됨
		// s1 에는 문자열저장소에 기록된 문자열의 주소가 저장됨

		String s2 = "java"; // 한번 기록된 문자열은 두번 기록되지 않음
		// s2 에는 이전에 기록된 문자열의 주소가 저장됨

		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());

		String s3 = s1.toUpperCase();
		System.out.println("s1 : " + s1);
		System.out.println("s3 : " + s3);
		System.out.println("s2 : " + s3.hashCode());
		// 기록된 문자열값 조작을 하면, 처리결과값이 새로 할당됨
		// 기록된 문자열 수정 안 됨 : immutable

		String s4 = s1.replace('a', 'u');
		System.out.println("s1 : " + s1);
		System.out.println("s4 : " + s4);
		System.out.println("s4 : " + s4.hashCode());

		String s5 = s1.concat(" programming");
		System.out.println("s1 : " + s1);
		System.out.println("s5 : " + s5);
		System.out.println("s5 : " + s5.hashCode());
		// String 의 문자열값 조작할때마다, 조작결과문자열이 새로
		// 메모리에 할당되고, 새 주소가 리턴됨 => 메모리 사용량이 늘어남

	}

	public void usingStringBuilder() {
		// 문자열 조작작업이 필요하면, String
		// StringBuffer 로 바꿈 >> 조작작업 => String 바꿈

		String s = "oracle";
		StringBuilder sb = new StringBuilder(s);

		System.out.println(sb.hashCode());
		System.out.println(sb);

		StringBuilder sb2 = sb.append(", java");
		System.out.println("sb : " + sb);
		System.out.println("sb2 : " + sb2.hashCode());

		System.out.println("sb capacity : " + sb.capacity());

		sb.delete(6, 8);
		System.out.println("sb : " + sb.hashCode());
		System.out.println("sb : " + sb);

		// StringBuilder 에 기록된 문자열을 char[]에 복사할 경우
		char[] ar = new char[10];

		sb.getChars(0, 3, ar, 0);

		System.out.println(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
		
		System.out.println("oracle 에서 a 문자의 위치 : " + sb.indexOf("a"));
		System.out.println("oracle 에서 cle 문자열의 시작위치 : " + sb.indexOf("cle",2));
		
		sb.insert(0, "power ");
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		sb.replace(6, sb.length(), ", Servlet");
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		sb.reverse();
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		sb.setCharAt(6, 's');
		System.out.println("sb : " + sb + "[" + sb.hashCode() + "]");
		
		String str = sb.substring(6);
		System.out.println(str);
		
		str= sb.substring(0, 5);
		System.out.println(str);

	
		String result = sb.toString();
		System.out.println(result);
	}
	
	public void usingSplit() {
//		String s = "java oracle html5 css3 javascript";
//		String[] sar = s.split(" ");
		
		String s = "java,oracle,html,css,javascript";
		String[] sar = s.split(",");
		
		System.out.println("분리된 문자열 갯수 : " + sar.length);
		
		System.out.println(sar);
		for(String ref : sar) {
			System.out.println(ref);
		}
		
		
		
	}
	public void usingTokenizer() {
	StringTokenizer st= new StringTokenizer("python crawling django java jdbc spring");
	while(st.hasMoreTokens()) {
		String s = st.nextToken();
		System.out.println(s);
	}
	
	}
	
}
