package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RankingByTickCountResponseRanking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class RankingByTickCountResponseRanking   {
  @JsonProperty("No")
  private Integer no = null;

  @JsonProperty("Trend")
  private String trend = null;

  @JsonProperty("AverageRanking")
  private Double averageRanking = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("CurrentPrice")
  private Double currentPrice = null;

  @JsonProperty("ChangeRatio")
  private Double changeRatio = null;

  @JsonProperty("TickCount")
  private Integer tickCount = null;

  @JsonProperty("UpCount")
  private Integer upCount = null;

  @JsonProperty("DownCount")
  private Integer downCount = null;

  @JsonProperty("ChangePercentage")
  private Double changePercentage = null;

  @JsonProperty("TradingVolume")
  private Double tradingVolume = null;

  @JsonProperty("Turnover")
  private Double turnover = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("CategoryName")
  private String categoryName = null;

  public RankingByTickCountResponseRanking no(Integer no) {
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

  public RankingByTickCountResponseRanking trend(String trend) {
    this.trend = trend;
    return this;
  }

  /**
   * トレンド <table>     <thead>         <tr>             <th>定義値</th>             <th>内容</th>         </tr>     </thead>     <tbody>         <tr>             <td>0</td>             <td>対象データ無し</td>         </tr>         <tr>             <td>1</td>             <td>過去10営業日より20位以上上昇</td>         </tr>         <tr>             <td>2</td>             <td>過去10営業日より1～19位上昇</td>         </tr>         <tr>             <td>3</td>             <td>過去10営業日と変わらず</td>         </tr>         <tr>             <td>4</td>             <td>過去10営業日より1～19位下落</td>         </tr>         <tr>             <td>5</td>             <td>過去10営業日より20位以上下落</td>         </tr>     </tbody> </table>
   * @return trend
   **/
  @Schema(description = "トレンド <table>     <thead>         <tr>             <th>定義値</th>             <th>内容</th>         </tr>     </thead>     <tbody>         <tr>             <td>0</td>             <td>対象データ無し</td>         </tr>         <tr>             <td>1</td>             <td>過去10営業日より20位以上上昇</td>         </tr>         <tr>             <td>2</td>             <td>過去10営業日より1～19位上昇</td>         </tr>         <tr>             <td>3</td>             <td>過去10営業日と変わらず</td>         </tr>         <tr>             <td>4</td>             <td>過去10営業日より1～19位下落</td>         </tr>         <tr>             <td>5</td>             <td>過去10営業日より20位以上下落</td>         </tr>     </tbody> </table>")
  
    public String getTrend() {
    return trend;
  }

  public void setTrend(String trend) {
    this.trend = trend;
  }

  public RankingByTickCountResponseRanking averageRanking(Double averageRanking) {
    this.averageRanking = averageRanking;
    return this;
  }

  /**
   * 平均順位<br>※100位以下は「999」となります
   * @return averageRanking
   **/
  @Schema(description = "平均順位<br>※100位以下は「999」となります")
  
    public Double getAverageRanking() {
    return averageRanking;
  }

  public void setAverageRanking(Double averageRanking) {
    this.averageRanking = averageRanking;
  }

  public RankingByTickCountResponseRanking symbol(String symbol) {
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

  public RankingByTickCountResponseRanking symbolName(String symbolName) {
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

  public RankingByTickCountResponseRanking currentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  /**
   * 現在値
   * @return currentPrice
   **/
  @Schema(description = "現在値")
  
    public Double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public RankingByTickCountResponseRanking changeRatio(Double changeRatio) {
    this.changeRatio = changeRatio;
    return this;
  }

  /**
   * 前日比
   * @return changeRatio
   **/
  @Schema(description = "前日比")
  
    public Double getChangeRatio() {
    return changeRatio;
  }

  public void setChangeRatio(Double changeRatio) {
    this.changeRatio = changeRatio;
  }

  public RankingByTickCountResponseRanking tickCount(Integer tickCount) {
    this.tickCount = tickCount;
    return this;
  }

  /**
   * TICK回数
   * @return tickCount
   **/
  @Schema(description = "TICK回数")
  
    public Integer getTickCount() {
    return tickCount;
  }

  public void setTickCount(Integer tickCount) {
    this.tickCount = tickCount;
  }

  public RankingByTickCountResponseRanking upCount(Integer upCount) {
    this.upCount = upCount;
    return this;
  }

  /**
   * UP
   * @return upCount
   **/
  @Schema(description = "UP")
  
    public Integer getUpCount() {
    return upCount;
  }

  public void setUpCount(Integer upCount) {
    this.upCount = upCount;
  }

  public RankingByTickCountResponseRanking downCount(Integer downCount) {
    this.downCount = downCount;
    return this;
  }

  /**
   * DOWN
   * @return downCount
   **/
  @Schema(description = "DOWN")
  
    public Integer getDownCount() {
    return downCount;
  }

  public void setDownCount(Integer downCount) {
    this.downCount = downCount;
  }

  public RankingByTickCountResponseRanking changePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
    return this;
  }

  /**
   * 騰落率（%）
   * @return changePercentage
   **/
  @Schema(description = "騰落率（%）")
  
    public Double getChangePercentage() {
    return changePercentage;
  }

  public void setChangePercentage(Double changePercentage) {
    this.changePercentage = changePercentage;
  }

  public RankingByTickCountResponseRanking tradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

  /**
   * 売買高<br>売買高を千株単位で表示する<br>※百株の位を四捨五入
   * @return tradingVolume
   **/
  @Schema(description = "売買高<br>売買高を千株単位で表示する<br>※百株の位を四捨五入")
  
    public Double getTradingVolume() {
    return tradingVolume;
  }

  public void setTradingVolume(Double tradingVolume) {
    this.tradingVolume = tradingVolume;
  }

  public RankingByTickCountResponseRanking turnover(Double turnover) {
    this.turnover = turnover;
    return this;
  }

  /**
   * 売買代金<br>売買代金を百万円単位で表示する<br>※十万円の位を四捨五入
   * @return turnover
   **/
  @Schema(description = "売買代金<br>売買代金を百万円単位で表示する<br>※十万円の位を四捨五入")
  
    public Double getTurnover() {
    return turnover;
  }

  public void setTurnover(Double turnover) {
    this.turnover = turnover;
  }

  public RankingByTickCountResponseRanking exchangeName(String exchangeName) {
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

  public RankingByTickCountResponseRanking categoryName(String categoryName) {
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
    RankingByTickCountResponseRanking rankingByTickCountResponseRanking = (RankingByTickCountResponseRanking) o;
    return Objects.equals(this.no, rankingByTickCountResponseRanking.no) &&
        Objects.equals(this.trend, rankingByTickCountResponseRanking.trend) &&
        Objects.equals(this.averageRanking, rankingByTickCountResponseRanking.averageRanking) &&
        Objects.equals(this.symbol, rankingByTickCountResponseRanking.symbol) &&
        Objects.equals(this.symbolName, rankingByTickCountResponseRanking.symbolName) &&
        Objects.equals(this.currentPrice, rankingByTickCountResponseRanking.currentPrice) &&
        Objects.equals(this.changeRatio, rankingByTickCountResponseRanking.changeRatio) &&
        Objects.equals(this.tickCount, rankingByTickCountResponseRanking.tickCount) &&
        Objects.equals(this.upCount, rankingByTickCountResponseRanking.upCount) &&
        Objects.equals(this.downCount, rankingByTickCountResponseRanking.downCount) &&
        Objects.equals(this.changePercentage, rankingByTickCountResponseRanking.changePercentage) &&
        Objects.equals(this.tradingVolume, rankingByTickCountResponseRanking.tradingVolume) &&
        Objects.equals(this.turnover, rankingByTickCountResponseRanking.turnover) &&
        Objects.equals(this.exchangeName, rankingByTickCountResponseRanking.exchangeName) &&
        Objects.equals(this.categoryName, rankingByTickCountResponseRanking.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(no, trend, averageRanking, symbol, symbolName, currentPrice, changeRatio, tickCount, upCount, downCount, changePercentage, tradingVolume, turnover, exchangeName, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RankingByTickCountResponseRanking {\n");
    
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    trend: ").append(toIndentedString(trend)).append("\n");
    sb.append("    averageRanking: ").append(toIndentedString(averageRanking)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    changeRatio: ").append(toIndentedString(changeRatio)).append("\n");
    sb.append("    tickCount: ").append(toIndentedString(tickCount)).append("\n");
    sb.append("    upCount: ").append(toIndentedString(upCount)).append("\n");
    sb.append("    downCount: ").append(toIndentedString(downCount)).append("\n");
    sb.append("    changePercentage: ").append(toIndentedString(changePercentage)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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
