package logging_basic;
/**
 * Lombok 테스트 클래스
 * @author 박상훈
 *
 */

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentTest {
	
	
	@Test
	void createStudent() {
		Student student = new Student(10, "김기정");
		student.setName("이기정");
		log.debug("학생 : {}", student.toString());
	}
}
