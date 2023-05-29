package com.solugenix.example.MyInsurance2901.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-05-29T13:40:00.353+05:30")




public class Company   {
  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("companyCity")
  private String companyCity = null;

  public Company companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(value = "")


  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Company companyCity(String companyCity) {
    this.companyCity = companyCity;
    return this;
  }

  /**
   * Get companyCity
   * @return companyCity
  **/
  @ApiModelProperty(value = "")


  public String getCompanyCity() {
    return companyCity;
  }

  public void setCompanyCity(String companyCity) {
    this.companyCity = companyCity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.companyName, company.companyName) &&
        Objects.equals(this.companyCity, company.companyCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyName, companyCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

