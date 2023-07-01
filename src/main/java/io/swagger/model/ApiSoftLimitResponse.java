package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiSoftLimitResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class ApiSoftLimitResponse   {
  @JsonProperty("Stock")
  private Double stock = null;

  @JsonProperty("Margin")
  private Double margin = null;

  @JsonProperty("Future")
  private Double future = null;

  @JsonProperty("FutureMini")
  private Double futureMini = null;

  @JsonProperty("Option")
  private Double option = null;

  @JsonProperty("KabuSVersion")
  private String kabuSVersion = null;

  public ApiSoftLimitResponse stock(Double stock) {
    this.stock = stock;
    return this;
  }

  /**
   * 現物のワンショット上限<br>※単位は万円
   * @return stock
   **/
  @Schema(description = "現物のワンショット上限<br>※単位は万円")
  
    public Double getStock() {
    return stock;
  }

  public void setStock(Double stock) {
    this.stock = stock;
  }

  public ApiSoftLimitResponse margin(Double margin) {
    this.margin = margin;
    return this;
  }

  /**
   * 信用のワンショット上限<br>※単位は万円
   * @return margin
   **/
  @Schema(description = "信用のワンショット上限<br>※単位は万円")
  
    public Double getMargin() {
    return margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }

  public ApiSoftLimitResponse future(Double future) {
    this.future = future;
    return this;
  }

  /**
   * 先物のワンショット上限<br>※単位は枚
   * @return future
   **/
  @Schema(description = "先物のワンショット上限<br>※単位は枚")
  
    public Double getFuture() {
    return future;
  }

  public void setFuture(Double future) {
    this.future = future;
  }

  public ApiSoftLimitResponse futureMini(Double futureMini) {
    this.futureMini = futureMini;
    return this;
  }

  /**
   * 先物ミニのワンショット上限<br>※単位は枚
   * @return futureMini
   **/
  @Schema(description = "先物ミニのワンショット上限<br>※単位は枚")
  
    public Double getFutureMini() {
    return futureMini;
  }

  public void setFutureMini(Double futureMini) {
    this.futureMini = futureMini;
  }

  public ApiSoftLimitResponse option(Double option) {
    this.option = option;
    return this;
  }

  /**
   * オプションのワンショット上限<br>※単位は枚
   * @return option
   **/
  @Schema(description = "オプションのワンショット上限<br>※単位は枚")
  
    public Double getOption() {
    return option;
  }

  public void setOption(Double option) {
    this.option = option;
  }

  public ApiSoftLimitResponse kabuSVersion(String kabuSVersion) {
    this.kabuSVersion = kabuSVersion;
    return this;
  }

  /**
   * kabuステーションのバージョン
   * @return kabuSVersion
   **/
  @Schema(description = "kabuステーションのバージョン")
  
    public String getKabuSVersion() {
    return kabuSVersion;
  }

  public void setKabuSVersion(String kabuSVersion) {
    this.kabuSVersion = kabuSVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSoftLimitResponse apiSoftLimitResponse = (ApiSoftLimitResponse) o;
    return Objects.equals(this.stock, apiSoftLimitResponse.stock) &&
        Objects.equals(this.margin, apiSoftLimitResponse.margin) &&
        Objects.equals(this.future, apiSoftLimitResponse.future) &&
        Objects.equals(this.futureMini, apiSoftLimitResponse.futureMini) &&
        Objects.equals(this.option, apiSoftLimitResponse.option) &&
        Objects.equals(this.kabuSVersion, apiSoftLimitResponse.kabuSVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stock, margin, future, futureMini, option, kabuSVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSoftLimitResponse {\n");
    
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    future: ").append(toIndentedString(future)).append("\n");
    sb.append("    futureMini: ").append(toIndentedString(futureMini)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    kabuSVersion: ").append(toIndentedString(kabuSVersion)).append("\n");
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
