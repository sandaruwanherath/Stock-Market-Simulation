/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.event.Event;

/**
 * 
 */

public class NewCompanyShares extends aos.jack.jak.event.Event {
    public java.lang.String companyName;
    public int sharePrice;
    public int numberOfShares;
    private final static java.lang.String[] __eventVariableNames = {
            "companyName",
            "sharePrice",
            "numberOfShares"};
    private final static java.lang.String[] __eventVariableTypes = {
            "String",
            "int",
            "int"};
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public stockMarket.NewCompanyShares addNewCompanyShare(java.lang.String name, int sharePrice, int shares)
    {
        stockMarket.NewCompanyShares tmp = new stockMarket.NewCompanyShares();
        tmp.init(this);
        return tmp.addNewCompanyShare_body(name,sharePrice,shares);
    }
    
    private stockMarket.NewCompanyShares addNewCompanyShare_body(java.lang.String name, int sharePrice, int shares)
    {
        this.companyName = name;
        this.sharePrice = sharePrice;
        this.numberOfShares = shares;
        return this;
    }
    
    public NewCompanyShares()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "stockMarket/NewCompanyShares.event [" + super.stateInfo() + "]";
    }
    
    public java.lang.String[] variableNames()
    {
        return __eventVariableNames;
    }
    
    public java.lang.String[] variableTypes()
    {
        return __eventVariableTypes;
    }
    
    public java.lang.Object getVariable(int n)
    {
        switch (n) {
            case 0: 
            {
                return aos.util.ToObject.box(companyName);
            }
            case 1: 
            {
                return aos.util.ToObject.box(sharePrice);
            }
            case 2: 
            {
                return aos.util.ToObject.box(numberOfShares);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
}