/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author dhanushka
 */
public class Rates {

    private String symbol;
    private String bid;
    private String ask;
    private String shortValue;
    private String changeOpenInterest;
    private String innerLink;

    public String getSymbol() {
        
      
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getBid() {
        
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
       
        System.out.println("returning ask "+ask);
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getShortValue() {
        
        return shortValue;
    }

    public void setShortValue(String shortValue) {
        this.shortValue = shortValue;
    }

    public String getChangeOpenInterest() {
        
        return changeOpenInterest;
    }

    public void setChangeOpenInterest(String changeOpenInterest) {
        this.changeOpenInterest = changeOpenInterest;
    }

    public String getInnerLink() {
       
        return innerLink;
    }

    public void setInnerLink(String innerLink) {
        this.innerLink = innerLink;
    }

}
