package az.tarlan.fruit_client.web.models;

import java.util.ArrayList;
import java.util.List;

public class ExternalFruitList {
    private List<ExternalFruitDto> externalFruitDtoList;

    public ExternalFruitList() {
        externalFruitDtoList = new ArrayList<>();
    }

    public ExternalFruitList(List<ExternalFruitDto> externalFruitDtoList) {
        this.externalFruitDtoList = externalFruitDtoList;
    }

    public List<ExternalFruitDto> getExternalFruitDtoList() {
        return externalFruitDtoList;
    }

    public void setExternalFruitDtoList(List<ExternalFruitDto> externalFruitDtoList) {
        this.externalFruitDtoList = externalFruitDtoList;
    }
}
