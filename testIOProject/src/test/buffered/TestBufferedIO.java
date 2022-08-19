package test.buffered;

public class TestBufferedIO {

	public static void main(String[] args) {
		// 기본스트림 클래스 : 자원과 직접 연결하는 스트림 클래스
		// 보조스트림 클래스 : 기본스트림에 추가 연결하는 스트림 클래스
		//버퍼를 이용하는 보조스트림 클래스 추가 연결 사용 테스트
		BufferedFileIOSample bsamp = new BufferedFileIOSample();
		
		//bsamp.byteFileOutput();
		//bsamp.byteFileInput();
		//bsamp.charFileOutput();
		bsamp.charFileInput();
	}

}
