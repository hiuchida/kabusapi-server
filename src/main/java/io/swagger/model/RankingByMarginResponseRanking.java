package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RankingByMarginResponseRanking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class RankingByMarginResponseRanking   {
  @JsonProperty("No")
  private Integer no = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("SellRapidPaymentPercentage")
  private Double sellRapidPaymentPercentage = null;

  @JsonProperty("SellLastWeekRatio")
  private Double sellLastWeekRatio = null;

  @JsonProperty("BuyRapidPaymentPercentage")
  private Double buyRapidPaymentPercentage = null;

  @JsonProperty("BuyLastWeekRatio")
  private Double buyLastWeekRatio = null;

  @JsonProperty("Ratio")
  private Double ratio = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("CategoryName")
  private String categoryName = null;

  public RankingByMarginResponseRanking no(Integer no) {
    this.no = no;
    return this;
  }

  /**
   * 順位<br>※ランキング内で同じ順位が返却される場合があります（10位が2件など）
   * @return no
   **/
  @Schema(description = "順位<br>※ランキング内で同じ順位が返却される場合があります（10位が2件など）")
  
    public Integer getNo() {
    return no;
  }

  public void setNo(Integer no) {
    this.no = no;
  }

  public RankingByMarginResponseRanking symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * 銘柄コード
   * @return symbol
   **/
  @Schema(description = "銘柄コード")
  
    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public RankingByMarginResponseRanking symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

  /**
   * 銘柄名称
   * @return symbolName
   **/
  @Schema(description = "銘柄名称")
  
    public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public RankingByMarginResponseRanking sellRapidPaymentPercentage(Double sellRapidPaymentPercentage) {
    this.sellRapidPaymentPercentage = sellRapidPaymentPercentage;
    return this;
  }

  /**
   * 売残（千株）
   * @return sellRapidPaymentPercentage
   **/
  @Schema(description = "売残（千株）")
  
    public Double getSellRapidPaymentPercentage() {
    return sellRapidPaymentPercentage;
  }

  public void setSellRapidPaymentPercentage(Double sellRapidPaymentPercentage) {
    this.sellRapidPaymentPercentage = sellRapidPaymentPercentage;
  }

  public RankingByMarginResponseRanking sellLastWeekRatio(Double sellLastWeekRatio) {
    this.sellLastWeekRatio = sellLastWeekRatio;
    return this;
  }

  /**
   * 売残前週比
   * @return sellLastWeekRatio
   **/
  @Schema(description = "売残前週比")
  
    public Double getSellLastWeekRatio() {
    return sellLastWeekRatio;
  }

  public void setSellLastWeekRatio(Double sellLastWeekRatio) {
    this.sellLastWeekRatio = sellLastWeekRatio;
  }

  public RankingByMarginResponseRanking buyRapidPaymentPercentage(Double buyRapidPaymentPercentage) {
    this.buyRapidPaymentPercentage = buyRapidPaymentPercentage;
    return this;
  }

  /**
   * 買残（千株）
   * @return buyRapidPaymentPercentage
   **/
  @Schema(description = "買残（千株）")
  
    public Double getBuyRapidPaymentPercentage() {
    return buyRapidPaymentPercentage;
  }

  public void setBuyRapidPaymentPercentage(Double buyRapidPaymentPercentage) {
    this.buyRapidPaymentPercentage = buyRapidPaymentPercentage;
  }

  public RankingByMarginResponseRanking buyLastWeekRatio(Double buyLastWeekRatio) {
    this.buyLastWeekRatio = buyLastWeekRatio;
    return this;
  }

  /**
   * 買残前週比
   * @return buyLastWeekRatio
   **/
  @Schema(description = "買残前週比")
  
    public Double getBuyLastWeekRatio() {
    return buyLastWeekRatio;
  }

  public void setBuyLastWeekRatio(Double buyLastWeekRatio) {
    this.buyLastWeekRatio = buyLastWeekRatio;
  }

  public RankingByMarginResponseRanking ratio(Double ratio) {
    this.ratio = ratio;
    return this;
  }

  /**
   * 倍率
   * @return ratio
   **/
  @Schema(description = "倍率")
  
    public Double getRatio() {
    return ratio;
  }

  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }

  public RankingByMarginResponseRanking exchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
    return this;
  }

  /**
   * 市場名
   * @return exchangeName
   **/
  @Schema(description = "市場名")
  
    public String getExchangeName() {
    return exchangeName;
  }

  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }

  public RankingByMarginResponseRanking categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * 業種名
   * @return categoryName
   **/
  @Schema(description = "業種名")
  
    public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RankingByMarginResponseRanking rankingByMarginResponseRanking = (RankingByMarginResponseRanking) o;
    return Objects.equals(this.no, rankingByMarginResponseRanking.no) &&
        Objects.equals(this.symbol, rankingByMarginResponseRanking.symbol) &&
        Objects.equals(this.symbolName, rankingByMarginResponseRanking.symbolName) &&
        Objects.equals(this.sellRapidPaymentPercentage, rankingByMarginResponseRanking.sellRapidPaymentPercentage) &&
        Objects.equals(this.sellLastWeekRatio, rankingByMarginResponseRanking.sellLastWeekRatio) &&
        Objects.equals(this.buyRapidPaymentPercentage, rankingByMarginResponseRanking.buyRapidPaymentPercentage) &&
        Objects.equals(this.buyLastWeekRatio, rankingByMarginResponseRanking.buyLastWeekRatio) &&
        Objects.equals(this.ratio, rankingByMarginResponseRanking.ratio) &&
        Objects.equals(this.exchangeName, rankingByMarginResponseRanking.exchangeName) &&
        Objects.equals(this.categoryName, rankingByMarginResponseRanking.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(no, symbol, symbolName, sellRapidPaymentPercentage, sellLastWeekRatio, buyRapidPaymentPercentage, buyLastWeekRatio, ratio, exchangeName, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingByMarginResponseRanking {\n");
    
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    sellRapidPaymentPercentage: ").append(toIndentedString(sellRapidPaymentPercentage)).append("\n");
    sb.append("    sellLastWeekRatio: ").append(toIndentedString(sellLastWeekRatio)).append("\n");
    sb.append("    buyRapidPaymentPercentage: ").append(toIndentedString(buyRapidPaymentPercentage)).append("\n");
    sb.append("    buyLastWeekRatio: ").append(toIndentedString(buyLastWeekRatio)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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
