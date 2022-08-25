package io.silsub2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SungjukProcess {
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//
		SungjukProcess sg = new SungjukProcess();
//		sg.sungjukSave();
		sg.scoreRead();
	}

	public void sungjukSave() {

		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("score.dat"))) {
			do {
				int eng, mat, kor, tot;
				double avg;

				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				mat = sc.nextInt();

				tot = kor + eng + mat;
				avg = tot / 3.;

				objOut.writeInt(kor);
				objOut.writeInt(eng);
				objOut.writeInt(mat);
				objOut.writeInt(tot);
				objOut.writeDouble(avg);
				System.out.print("계속 저장하시겠습니까? (y/n) ");
			} while ((sc.next().toUpperCase().charAt(0) != 'N'));
			System.out.println("score.dat 에 저장 완료.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void scoreRead() {
		int count = 0;
		int sum = 0;
		double sumavg = 0;
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("score.dat"));) {

			int eng, mat, kor, tot;
			double avg;
			
			do {
				kor = objIn.readInt();
				eng = objIn.readInt();
				mat = objIn.readInt();

				tot = objIn.readInt();
				avg = objIn.readDouble();
				System.out.printf("국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", kor, eng, mat, tot, avg);
				sum += tot;
				sumavg += avg;
				count++;
			} while(true);
			
		} catch (EOFException e) {
			System.out.printf("전체 총점 : %d, 전체 평균 : %f\n", sum, sumavg / count);
			System.out.println("score.dat 파일 읽기 완료.");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
