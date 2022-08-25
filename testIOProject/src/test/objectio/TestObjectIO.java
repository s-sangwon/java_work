package test.objectio;

public class TestObjectIO {

	public static void main(String[] args) {
		// 객체 입출력 테스트
		MemberManager mm = new MemberManager();
		mm.objectFileSave();
		mm.objectFileRead();
	}

}
