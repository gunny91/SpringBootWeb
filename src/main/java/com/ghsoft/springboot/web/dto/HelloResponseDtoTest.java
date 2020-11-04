package com.ghsoft.springboot.web.dto;

import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest(){

        String name = "test";
        int amount = 10;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

       // assertThat(dto.getName()).isEqualTo(name);
       // assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
