package test.dataio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestDataIO {

	public static void main(String[] args) {
		// 데이터 종류별로 입출력할 수 있는 보조스트림 클래스 테스트
		TestDataIO ref = new TestDataIO();

		ref.fileSave();
		ref.fileRead();

	}

	public void fileSave() {
		// 데이터 종류별로 출력하는 보조스트림 테스트 : 바이트 스트림만 제공
		// DataOutputStream

		String name = "홍길동";
		int age = 29;
		double pay = 355.7;
		char gender = '남';
		boolean marriage = false;
		
		try(DataOutputStream dout = new DataOutputStream(
				new FileOutputStream("member.dat")); ) {
			//주의 : 기록된 데이터 순서대로 읽어들여야 하므로
			//	기록 순서를 잘 기억해야 함
			
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeDouble(pay);
			dout.writeChar(gender);
			dout.writeBoolean(marriage);
			
			dout.flush(); //출력버퍼에서 스트림으로 내보냄
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		try(DataInputStream din = new DataInputStream(
				new FileInputStream("member.dat")); ) {
			//주의 : 기록된 데이터 순서대로 읽어들여야 하므로
			//	기록 순서를 잘 기억해야 함
			String name = din.readUTF();
			int age = din.readInt();
			double pay = din.readDouble();
			char gender = din.readChar();
			boolean marriage = din.readBoolean();
			System.out.printf("%s\t%d\t%.1f\t%c\t%b\n",name,age,pay,gender,marriage);
			System.out.println(name + age + pay + gender + marriage);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
