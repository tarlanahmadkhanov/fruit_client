package az.tarlan.fruit_client.web.clients;

import az.tarlan.fruit_client.web.models.ExternalFruitDto;
import az.tarlan.fruit_client.web.models.FruitDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

@Slf4j
class FruitClientTest {
    @Autowired
    FruitClient fruitClient;

    @Test
    void getFruitById() {
        FruitDto fruitDto = fruitClient.getFruitById(UUID.fromString("a2d7bdea-eef8-4358-a014-71e1398cb041"));
        log.info(fruitDto.toString());

    }

    @Test
    void  getExternalFruitsTest() {
        List<ExternalFruitDto> externalFruitDtos = fruitClient.getExternalFruits();
        log.info(externalFruitDtos.toString());
    }
}