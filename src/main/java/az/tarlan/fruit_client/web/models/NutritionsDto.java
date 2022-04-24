package az.tarlan.fruit_client.web.models;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "carbohydrates",
        "protein",
        "fat",
        "calories",
        "sugar"
})
@Generated("jsonschema2pojo")
public class NutritionsDto {

    @JsonProperty("carbohydrates")
    private Double carbohydrates;
    @JsonProperty("protein")
    private Integer protein;
    @JsonProperty("fat")
    private Double fat;
    @JsonProperty("calories")
    private Integer calories;
    @JsonProperty("sugar")
    private Double sugar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("carbohydrates")
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    @JsonProperty("carbohydrates")
    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    @JsonProperty("protein")
    public Integer getProtein() {
        return protein;
    }

    @JsonProperty("protein")
    public void setProtein(Integer protein) {
        this.protein = protein;
    }

    @JsonProperty("fat")
    public Double getFat() {
        return fat;
    }

    @JsonProperty("fat")
    public void setFat(Double fat) {
        this.fat = fat;
    }

    @JsonProperty("calories")
    public Integer getCalories() {
        return calories;
    }

    @JsonProperty("calories")
    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @JsonProperty("sugar")
    public Double getSugar() {
        return sugar;
    }

    @JsonProperty("sugar")
    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
