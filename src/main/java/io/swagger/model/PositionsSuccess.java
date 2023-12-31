package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PositionsSuccess
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-30T15:11:33.432082584Z[GMT]")


public class PositionsSuccess   {
  @JsonProperty("ExecutionID")
  private String executionID = null;

  @JsonProperty("AccountType")
  private Integer accountType = null;

  @JsonProperty("Symbol")
  private String symbol = null;

  @JsonProperty("SymbolName")
  private String symbolName = null;

  @JsonProperty("Exchange")
  private Integer exchange = null;

  @JsonProperty("ExchangeName")
  private String exchangeName = null;

  @JsonProperty("SecurityType")
  private Integer securityType = null;

  @JsonProperty("ExecutionDay")
  private Integer executionDay = null;

  @JsonProperty("Price")
  private Double price = null;

  @JsonProperty("LeavesQty")
  private Double leavesQty = null;

  @JsonProperty("HoldQty")
  private Double holdQty = null;

  @JsonProperty("Side")
  private String side = null;

  @JsonProperty("Expenses")
  private Double expenses = null;

  @JsonProperty("Commission")
  private Double commission = null;

  @JsonProperty("CommissionTax")
  private Double commissionTax = null;

  @JsonProperty("ExpireDay")
  private Integer expireDay = null;

  @JsonProperty("MarginTradeType")
  private Integer marginTradeType = null;

  @JsonProperty("CurrentPrice")
  private Double currentPrice = null;

  @JsonProperty("Valuation")
  private Double valuation = null;

  @JsonProperty("ProfitLoss")
  private Double profitLoss = null;

  @JsonProperty("ProfitLossRate")
  private Double profitLossRate = null;

  public PositionsSuccess executionID(String executionID) {
    this.executionID = executionID;
    return this;
  }

  /**
   * 約定番号<br>※現物取引では、nullが返ります。
   * @return executionID
   **/
  @Schema(description = "約定番号<br>※現物取引では、nullが返ります。")
  
    public String getExecutionID() {
    return executionID;
  }

  public void setExecutionID(String executionID) {
    this.executionID = executionID;
  }

  public PositionsSuccess accountType(Integer accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * 口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>
   * @return accountType
   **/
  @Schema(description = "口座種別 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>2</td>           <td>一般</td>       </tr>       <tr>           <td>4</td>           <td>特定</td>       </tr>       <tr>           <td>12</td>           <td>法人</td>       </tr>   </tbody> </table>")
  
    public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public PositionsSuccess symbol(String symbol) {
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

  public PositionsSuccess symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

  /**
   * 銘柄名
   * @return symbolName
   **/
  @Schema(description = "銘柄名")
  
    public String getSymbolName() {
    return symbolName;
  }

  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }

  public PositionsSuccess exchange(Integer exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * 市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>
   * @return exchange
   **/
  @Schema(description = "市場コード <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>東証</td>       </tr>       <tr>           <td>3</td>           <td>名証</td>       </tr>       <tr>           <td>5</td>           <td>福証</td>       </tr>       <tr>           <td>6</td>           <td>札証</td>       </tr>       <tr>           <td>2</td>           <td>日通し</td>       </tr>       <tr>           <td>23</td>           <td>日中</td>       </tr>       <tr>           <td>24</td>           <td>夜間</td>       </tr>   </tbody> </table>")
  
    public Integer getExchange() {
    return exchange;
  }

  public void setExchange(Integer exchange) {
    this.exchange = exchange;
  }

  public PositionsSuccess exchangeName(String exchangeName) {
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

  public PositionsSuccess securityType(Integer securityType) {
    this.securityType = securityType;
    return this;
  }

  /**
   * 銘柄種別<br>※先物・オプション銘柄の場合のみ
   * @return securityType
   **/
  @Schema(description = "銘柄種別<br>※先物・オプション銘柄の場合のみ")
  
    public Integer getSecurityType() {
    return securityType;
  }

  public void setSecurityType(Integer securityType) {
    this.securityType = securityType;
  }

  public PositionsSuccess executionDay(Integer executionDay) {
    this.executionDay = executionDay;
    return this;
  }

  /**
   * 約定日（建玉日）<br>※信用・先物・オプションの場合のみ<br>※現物取引では、nullが返ります。
   * @return executionDay
   **/
  @Schema(description = "約定日（建玉日）<br>※信用・先物・オプションの場合のみ<br>※現物取引では、nullが返ります。")
  
    public Integer getExecutionDay() {
    return executionDay;
  }

  public void setExecutionDay(Integer executionDay) {
    this.executionDay = executionDay;
  }

  public PositionsSuccess price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 値段
   * @return price
   **/
  @Schema(description = "値段")
  
    public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public PositionsSuccess leavesQty(Double leavesQty) {
    this.leavesQty = leavesQty;
    return this;
  }

  /**
   * 残数量（保有数量）
   * @return leavesQty
   **/
  @Schema(description = "残数量（保有数量）")
  
    public Double getLeavesQty() {
    return leavesQty;
  }

  public void setLeavesQty(Double leavesQty) {
    this.leavesQty = leavesQty;
  }

  public PositionsSuccess holdQty(Double holdQty) {
    this.holdQty = holdQty;
    return this;
  }

  /**
   * 拘束数量（返済のために拘束されている数量）
   * @return holdQty
   **/
  @Schema(description = "拘束数量（返済のために拘束されている数量）")
  
    public Double getHoldQty() {
    return holdQty;
  }

  public void setHoldQty(Double holdQty) {
    this.holdQty = holdQty;
  }

  public PositionsSuccess side(String side) {
    this.side = side;
    return this;
  }

  /**
   * 売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>
   * @return side
   **/
  @Schema(description = "売買区分 <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>売</td>       </tr>       <tr>           <td>2</td>           <td>買</td>       </tr>   </tbody> </table>")
  
    public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public PositionsSuccess expenses(Double expenses) {
    this.expenses = expenses;
    return this;
  }

  /**
   * 諸経費<br>※信用・先物・オプションの場合のみ
   * @return expenses
   **/
  @Schema(description = "諸経費<br>※信用・先物・オプションの場合のみ")
  
    public Double getExpenses() {
    return expenses;
  }

  public void setExpenses(Double expenses) {
    this.expenses = expenses;
  }

  public PositionsSuccess commission(Double commission) {
    this.commission = commission;
    return this;
  }

  /**
   * 手数料<br>※信用・先物・オプションの場合のみ
   * @return commission
   **/
  @Schema(description = "手数料<br>※信用・先物・オプションの場合のみ")
  
    public Double getCommission() {
    return commission;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public PositionsSuccess commissionTax(Double commissionTax) {
    this.commissionTax = commissionTax;
    return this;
  }

  /**
   * 手数料消費税<br>※信用・先物・オプションの場合のみ
   * @return commissionTax
   **/
  @Schema(description = "手数料消費税<br>※信用・先物・オプションの場合のみ")
  
    public Double getCommissionTax() {
    return commissionTax;
  }

  public void setCommissionTax(Double commissionTax) {
    this.commissionTax = commissionTax;
  }

  public PositionsSuccess expireDay(Integer expireDay) {
    this.expireDay = expireDay;
    return this;
  }

  /**
   * 返済期日<br>※信用・先物・オプションの場合のみ
   * @return expireDay
   **/
  @Schema(description = "返済期日<br>※信用・先物・オプションの場合のみ")
  
    public Integer getExpireDay() {
    return expireDay;
  }

  public void setExpireDay(Integer expireDay) {
    this.expireDay = expireDay;
  }

  public PositionsSuccess marginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
    return this;
  }

  /**
   * 信用取引区分<br>※信用の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>
   * @return marginTradeType
   **/
  @Schema(description = "信用取引区分<br>※信用の場合のみ <table>   <thead>       <tr>           <th>定義値</th>           <th>説明</th>       </tr>   </thead>   <tbody>       <tr>           <td>1</td>           <td>制度信用</td>       </tr>       <tr>           <td>2</td>           <td>一般信用（長期）</td>       </tr>       <tr>           <td>3</td>           <td>一般信用（デイトレ）</td>       </tr>   </tbody> </table>")
  
    public Integer getMarginTradeType() {
    return marginTradeType;
  }

  public void setMarginTradeType(Integer marginTradeType) {
    this.marginTradeType = marginTradeType;
  }

  public PositionsSuccess currentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
    return this;
  }

  /**
   * 現在値<br>追加情報出力フラグ：falseの場合、null
   * @return currentPrice
   **/
  @Schema(description = "現在値<br>追加情報出力フラグ：falseの場合、null")
  
    public Double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public PositionsSuccess valuation(Double valuation) {
    this.valuation = valuation;
    return this;
  }

  /**
   * 評価金額<br>追加情報出力フラグ：falseの場合、null
   * @return valuation
   **/
  @Schema(description = "評価金額<br>追加情報出力フラグ：falseの場合、null")
  
    public Double getValuation() {
    return valuation;
  }

  public void setValuation(Double valuation) {
    this.valuation = valuation;
  }

  public PositionsSuccess profitLoss(Double profitLoss) {
    this.profitLoss = profitLoss;
    return this;
  }

  /**
   * 評価損益額<br>追加情報出力フラグ：falseの場合、null
   * @return profitLoss
   **/
  @Schema(description = "評価損益額<br>追加情報出力フラグ：falseの場合、null")
  
    public Double getProfitLoss() {
    return profitLoss;
  }

  public void setProfitLoss(Double profitLoss) {
    this.profitLoss = profitLoss;
  }

  public PositionsSuccess profitLossRate(Double profitLossRate) {
    this.profitLossRate = profitLossRate;
    return this;
  }

  /**
   * 評価損益率<br>追加情報出力フラグ：falseの場合、null
   * @return profitLossRate
   **/
  @Schema(description = "評価損益率<br>追加情報出力フラグ：falseの場合、null")
  
    public Double getProfitLossRate() {
    return profitLossRate;
  }

  public void setProfitLossRate(Double profitLossRate) {
    this.profitLossRate = profitLossRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositionsSuccess positionsSuccess = (PositionsSuccess) o;
    return Objects.equals(this.executionID, positionsSuccess.executionID) &&
        Objects.equals(this.accountType, positionsSuccess.accountType) &&
        Objects.equals(this.symbol, positionsSuccess.symbol) &&
        Objects.equals(this.symbolName, positionsSuccess.symbolName) &&
        Objects.equals(this.exchange, positionsSuccess.exchange) &&
        Objects.equals(this.exchangeName, positionsSuccess.exchangeName) &&
        Objects.equals(this.securityType, positionsSuccess.securityType) &&
        Objects.equals(this.executionDay, positionsSuccess.executionDay) &&
        Objects.equals(this.price, positionsSuccess.price) &&
        Objects.equals(this.leavesQty, positionsSuccess.leavesQty) &&
        Objects.equals(this.holdQty, positionsSuccess.holdQty) &&
        Objects.equals(this.side, positionsSuccess.side) &&
        Objects.equals(this.expenses, positionsSuccess.expenses) &&
        Objects.equals(this.commission, positionsSuccess.commission) &&
        Objects.equals(this.commissionTax, positionsSuccess.commissionTax) &&
        Objects.equals(this.expireDay, positionsSuccess.expireDay) &&
        Objects.equals(this.marginTradeType, positionsSuccess.marginTradeType) &&
        Objects.equals(this.currentPrice, positionsSuccess.currentPrice) &&
        Objects.equals(this.valuation, positionsSuccess.valuation) &&
        Objects.equals(this.profitLoss, positionsSuccess.profitLoss) &&
        Objects.equals(this.profitLossRate, positionsSuccess.profitLossRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionID, accountType, symbol, symbolName, exchange, exchangeName, securityType, executionDay, price, leavesQty, holdQty, side, expenses, commission, commissionTax, expireDay, marginTradeType, currentPrice, valuation, profitLoss, profitLossRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionsSuccess {\n");
    
    sb.append("    executionID: ").append(toIndentedString(executionID)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
    sb.append("    executionDay: ").append(toIndentedString(executionDay)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    leavesQty: ").append(toIndentedString(leavesQty)).append("\n");
    sb.append("    holdQty: ").append(toIndentedString(holdQty)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    commissionTax: ").append(toIndentedString(commissionTax)).append("\n");
    sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
    sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
    sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
    sb.append("    valuation: ").append(toIndentedString(valuation)).append("\n");
    sb.append("    profitLoss: ").append(toIndentedString(profitLoss)).append("\n");
    sb.append("    profitLossRate: ").append(toIndentedString(profitLossRate)).append("\n");
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
