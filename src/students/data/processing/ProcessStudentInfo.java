package students.data.processing;

import org.xml.sax.SAXException;
import xml.parser.Student;
import xml.parser.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class ProcessStudentInfo {

	/*
     * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
     * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and
     * 'C' for 70 to 79.
     *
     * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
     * Once map has all data, retrieve those data and out put to console.
     *
     * Do any necessary steps that require for below successful output.
     * .................................................
     * Student (id= 1) "Marc" "Carp"       Grade= B
     * Student (id= 2) "Israt" "Khan"      Grade= A
     * Student (id= 3) "Mohi" "Uddin"      Grade= A
     * Student (id= 4) "Abrar" "Hossain"   Grade= B
     * Student (id= 5) "Abida" "Sultana"   Grade= C
     * .................................................
     *
     *
     */
	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		//Path of XML data to be read.
		String pathSelenium = "/home/a/CoreNDSExamMarch2016/src/xml/parser/selenium.xml";
		String pathQtp = "/home/a/CoreNDSExamMarch2016/src/xml/parser/qtp.xml";
		String tag = "id";

		//Declare a Map with List<String> into it.a
		Map<String, List<Student>> studentinfo = new HashMap<>();

				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */
		List<Student> SeleniumStudent = new ArrayList<>();
		List<Student> QtpStudent = new ArrayList<>();
		//Create XMLReader object.
		XmlReader xmlreader = new XmlReader();

		//Parse Data using parseData method and then store data into Selenium ArrayList.
		SeleniumStudent = xmlreader.parseData(tag,pathSelenium);

		//Parse Data using parseData method and then store data into Qtp ArrayList.
		QtpStudent = xmlreader.parseData(tag,pathQtp);
		//add Selenium ArrayList data into map.
		studentinfo.put(" ",SeleniumStudent);

		//add Qtp ArrayList data into map.
		studentinfo.put(" ",QtpStudent);
		System.out.println("................................................................");
		//Retrieve map data and display output.
		Iterator it = studentinfo.entrySet().iterator();// enter to iterator through map.entrySet

		while(it.hasNext()){
			System.out.println(it.next());

		}

		for(Map.Entry<String, List<Student>> cursor:studentinfo.entrySet()) {

			System.out.print((cursor.getKey()+"   "+cursor.getValue()+"  "+ "grade:")+"\n");
		}
		System.out.println("................................................................");

	}

}