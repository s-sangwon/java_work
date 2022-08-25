package test.objectio;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemberManager {
	
	public MemberManager() {}
	
	public void objectFileSave() {
		Member[] members = new Member[] {
				new Member("홍길동", 29, '남', 187.5, 78.5),
				new Member("황지니", 25, '여', 168.5, 52.5),
				new Member("이순신", 45, '남', 199.5, 90.5)
		};
		
		//객체 상태로 파일에 저장
		try (ObjectOutputStream objOut = new ObjectOutputStream(
				new FileOutputStream("members.dat"))) {
			
			for(Member m : members ) {
				objOut.writeObject(m);
			}
			
			System.out.println("members.dat 에 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void objectFileRead() {
		// 객체 정보가 저장된 파일에서 데이터를 읽어와서
		// 객체에 저장한 다음, 객체 배열에 추가 처리
		
		Member[] members = new Member[10];
		
		//객체 상태로 파일에 저장
		try (ObjectInputStream objIn = new ObjectInputStream(
				new FileInputStream("members.dat"))) {
			
			Member tm = null;
			for(int i=0;i<members.length; i++) {
				members[i] = (Member) objIn.readObject();
				System.out.println(members[i]);
			}
			
	
			System.out.println("members.dat 에 저장 완료!");
		} catch(EOFException e) {
			System.out.println("members.dat 읽기 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
