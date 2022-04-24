package az.tarlan.fruit_client.web.clients;

import az.tarlan.fruit_client.web.models.ExternalFruitDto;
import az.tarlan.fruit_client.web.models.FruitDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
@ConfigurationProperties(value = "az.tarlan", ignoreUnknownFields = false)
public class FruitClient {

    private final String BEER_PATH_V1 = "/api/v1/fruit/";
    private final String EXTERNAL_FRUITS = "/api/fruit/all";
    private String apihost;
    private String externalhost;
    private final RestTemplate restTemplate;

    public FruitClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public FruitDto getFruitById(UUID fruitId) {
        return restTemplate.getForObject(apihost+BEER_PATH_V1+fruitId.toString(), FruitDto.class);
    }

//    public List<ExternalFruitDto> getExternalFruits() {
//        ExternalFruitList response =  restTemplate.getForObject(externalhost+EXTERNAL_FRUITS, ExternalFruitList.class);
//        return response.getExternalFruitDtoList();
//    }


    public List<ExternalFruitDto> getExternalFruits() {
        ExternalFruitDto[] response =  restTemplate.getForObject(externalhost+EXTERNAL_FRUITS, ExternalFruitDto[].class);
        List<ExternalFruitDto> externalFruitDtos = new ArrayList<>(Arrays.asList(response));
        return externalFruitDtos;
    }


    public void setApihost(String apihost) {
        this.apihost = apihost;
    }

    public void setExternalhost(String externalhost) {
        this.externalhost = externalhost;
    }
}
