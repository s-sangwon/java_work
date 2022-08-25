package test.controller;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import test.entity.Employee;

public class TestProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProperties test = new TestProperties();
		Properties prop = new Properties();
		
		Employee[] ear = test.readFile(prop);
 		test.printConsole(prop);
 		test.addEmpData(prop);
 		test.printConsole(prop);
 		test.saveEmpXML(ear);
	}
	/**>> Properties 에 2개의 샘플 데이터를 추가함
	 * 
	 * */
	public void addEmpData(Properties p){
		
		p.setProperty("20151231", "김철수, 홍보부, 42000000, 0.05");
		p.setProperty("20180925", "원동민, 안보부, 62000000, 0.15");
	}	  
	
	
	
	/**>> "empData.txt" 파일을 읽어, Properties 객체에 저장하는 메소드
	  >> 읽어들인 키와 값은 각각 Employee 객체 필드에 기록함
	  >> Employee[] 을 리턴함
	  */
	public Employee[] readFile(Properties p){
		Employee[] empar = null;
		try {
			p.load(new FileReader("empData.txt"));
			//p.list(System.out);
			Set<String> empkeys = p.stringPropertyNames();
			Iterator<String> empiter = empkeys.iterator();
			empar = new Employee[10];
			
			for(int i=0; empiter.hasNext(); i++) {
				String no = empiter.next();
				String[] s = p.getProperty(no).split(",");
				
				empar[i] = new Employee( Integer.valueOf(no),
						s[0].trim(), s[1].trim(), 
						Integer.valueOf(s[2].trim()), Double.valueOf(s[3].trim()));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return empar;
		
	}
	  
	
	/**>> Properties 에 저장된 리스트를 하나씩 반복 출력하는 메소드
	 * 
	 * @param p
	 */
	public void printConsole(Properties p){
		Set<String> empkeys = p.stringPropertyNames();
		Iterator<String> empiter = empkeys.iterator();
		while(empiter.hasNext()) {
			String emp = empiter.next();
			System.out.println(emp+" = "+p.getProperty(emp));
		}
		System.out.println();
	}	   
	
	/**
	>> Employee[] 에서 각 객체별로 보너스포인트가 적용된 연봉을 계산하여,
		"empResult.xml" 파일에 저장함
		보너스포인트적용연봉 = 연봉 + (연봉 * 보너스포인트);
	  >> 저장 예
	  사번=이름, 소속부서, 연봉, 보너스포인트, 보너스포인트가 적용된 연봉
	  */
	public void saveEmpXML(Employee[] er){
		Properties prop = new Properties();
		try {
			for(Employee emp: er) {
				int bonusPay = (int) (emp.getSalary() + (emp.getSalary() * emp.getBonusPoint()));
				
				
				prop.setProperty( String.valueOf(emp.getEld()) , 
						emp.geteName() + ", "+ 
						emp.getDept() + ", "+		
						String.valueOf(emp.getSalary()) + ", "+
						String.valueOf(emp.getBonusPoint()) + ", "+
						String.valueOf(bonusPay));
			}
			
			
			
		} 
		catch(NullPointerException e) {
			try {
				prop.storeToXML(new FileOutputStream("empResult.xml") , "Emp 정보");
				System.out.println("empResult.xml 저장완료");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}   
	  
	
}
