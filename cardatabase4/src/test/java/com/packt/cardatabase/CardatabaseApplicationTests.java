package com.packt.cardatabase;

import com.packt.cardatabase.web.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CardatabaseApplicationTests {

	@Autowired
	private CarController controller;

	@Test
	@DisplayName("첫 번째 테스트 : controller 필드 생성 성공")
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
