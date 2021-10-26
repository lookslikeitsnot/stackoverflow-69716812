package com.stackoverflow.questions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.stackoverflow.questions.repositories.TagEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QuestionsApplicationTests {
	@Autowired
	private TagEntityRepository tagEntityRepository;

	@Test
	void contextLoads() {}

	@Test
	void findByPlanId_validPlanId_7Results() {
		assertTrue(tagEntityRepository.findByPlanId(1L).size() == 7);
	}

	@Test
	void findByPlanId_invalidPlanId_noResults() {
		assertTrue(tagEntityRepository.findByPlanId(3L).size() == 0);
	}
}
