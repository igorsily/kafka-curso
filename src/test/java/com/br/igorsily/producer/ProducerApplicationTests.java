package com.br.igorsily.producer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProducerApplicationTests {

    @Test
    void contextLoads() {
        boolean expected = true;

        Assertions.assertThat(expected).isTrue();
    }

}
