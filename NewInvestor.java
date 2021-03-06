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

public class NewInvestor extends aos.jack.jak.event.Event {
    public java.lang.String name;
    private final static java.lang.String[] __eventVariableNames = {
            "name"};
    private final static java.lang.String[] __eventVariableTypes = {
            "String"};
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public stockMarket.NewInvestor addNewInvestor(java.lang.String name)
    {
        stockMarket.NewInvestor tmp = new stockMarket.NewInvestor();
        tmp.init(this);
        return tmp.addNewInvestor_body(name);
    }
    
    private stockMarket.NewInvestor addNewInvestor_body(java.lang.String name)
    {
        this.name = name;
        return this;
    }
    
    public NewInvestor()
    {
    }
    
    public java.lang.String stateInfo()
    {
        return "stockMarket/NewInvestor.event [" + super.stateInfo() + "]";
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
                return aos.util.ToObject.box(name);
            }
            default: 
            {
                throw new java.lang.IndexOutOfBoundsException("Event " + this + " does not have variable number " + n);
            }
        }
    }
    
}
