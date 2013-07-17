/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.agent.Agent;
import investor.MessageNewSharesAvailable;
import investor.PublicCompanyAttributesChange;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

/**
 * 
 */

public class Market extends aos.jack.jak.agent.Agent {
    int numShares;
    float sharePrice;
    float percentageOfTotCompany;
    float netIncome;
    public stockMarket.HandlingRequestToBuy cap;
    public stockMarket.HandlingRequestToSell cap1;
    public stockMarket.OrderBook sharesToSell;
    public stockMarket.investors investors;
    public stockMarket.PublicCompaniesInMarket publicCompaniesInMarket;
    private stockMarket.NewCompanyShares ev;
    private stockMarket.FindAndTellInvesters ev1;
    private investor.MessageNewSharesAvailable ev3;
    private investor.PublicCompanyAttributesChange ev4;
    private stockMarket.NewInvestor ev6;
    public Market(java.lang.String name, java.lang.String filename)
    {
        super(name);
        boolean __b = getAgentType() == stockMarket.Market.class;
        if (__b) {
            __init1();
            __init2();
        }
        java.util.StringTokenizer tokens;
        java.lang.String record;
        java.lang.String t1;
        java.lang.String t2;
        java.lang.String t3;
        java.lang.String t4;
        int count = 0;
        java.io.BufferedReader datafile = null;
        try {
            datafile = new java.io.BufferedReader(new java.io.FileReader(filename));
        }
        catch (java.io.FileNotFoundException e) {
            java.lang.System.err.println("unable to open file " + e.toString());
            java.lang.System.exit(1);
        }
        try {
            while ((record = datafile.readLine()) != null) {
                tokens = new java.util.StringTokenizer(record);
                t1 = tokens.nextToken();
                t2 = tokens.nextToken();
                t3 = tokens.nextToken();
                t4 = tokens.nextToken();
                numShares = java.lang.Integer.parseInt(t2);
                sharePrice = java.lang.Float.parseFloat(t3);
                percentageOfTotCompany = java.lang.Float.parseFloat(t4);
                netIncome = getNetIncome();
                count++ ;
                java.lang.System.out.println(count + " to database " + t1 + numShares + sharePrice + percentageOfTotCompany + netIncome);
                publicCompaniesInMarket.add(t1,numShares,sharePrice,percentageOfTotCompany,netIncome);
            }
        }
        catch (java.lang.Exception e) {
            java.lang.System.err.println("error reading bom data into beliefset");
            java.lang.System.exit(1);
        }
        if (__b) 
            startAgent();
    }
    
    /////////////file read support////////////////////////////////////////

    private float getNetIncome()
    {
        java.util.Random r = new java.util.Random();
        float nextFloat = r.nextFloat();
        if (nextFloat > 0.2) {
            return nextFloat * numShares * sharePrice / (percentageOfTotCompany * 10);
        }
         else {
            return nextFloat * numShares * sharePrice / percentageOfTotCompany;
        }
    }
    
    /////////////////////////////////end/////////////////////////////////////

    public void addNewCompanyShares(java.lang.String name, int price, int shares)
    {
        postEventAndWait(ev.addNewCompanyShare(name,price,shares));
    }
    
    public void addInvestor(java.lang.String name)
    {
        postEventAndWait(ev6.addNewInvestor(name));
    }
    
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public java.lang.Class getAgentType()
    {
        return stockMarket.Market.class;
    }
    
    public void __init1()
    {
        super.__init1();
        if (cap == null) {
            cap = new stockMarket.HandlingRequestToBuy(this);
            cap.__initCapability(this,"cap");
        }
        cap.__init1();
        if (cap1 == null) {
            cap1 = new stockMarket.HandlingRequestToSell(this);
            cap1.__initCapability(this,"cap1");
        }
        cap1.__init1();
        setNamedCreator("sharesToSell","stockMarket.OrderBook",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_sharesToSell();
            }
            
        },true);
        setNamedCreator("investors","stockMarket.investors",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_investors();
            }
            
        },true);
        setNamedCreator("publicCompaniesInMarket","stockMarket.PublicCompaniesInMarket",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_publicCompaniesInMarket();
            }
            
        },true);
    }
    
    public void __init2()
    {
        super.__init2();
        cap.__init2();
        cap1.__init2();
        ev = (stockMarket.NewCompanyShares) findEvent("stockMarket.NewCompanyShares");
        ev1 = (stockMarket.FindAndTellInvesters) findEvent("stockMarket.FindAndTellInvesters");
        ev3 = (investor.MessageNewSharesAvailable) findEvent("investor.MessageNewSharesAvailable");
        ev4 = (investor.PublicCompanyAttributesChange) findEvent("investor.PublicCompanyAttributesChange");
        ev6 = (stockMarket.NewInvestor) findEvent("stockMarket.NewInvestor");
        getNamedObject("sharesToSell","stockMarket.OrderBook");
        getNamedObject("investors","stockMarket.investors");
        getNamedObject("publicCompaniesInMarket","stockMarket.PublicCompaniesInMarket");
    }
    
    synchronized private void __init_desc()
    {
        cap = new stockMarket.HandlingRequestToBuy(this);
        cap.__initCapability(this,"cap");
        cap.init_desc();
        cap1 = new stockMarket.HandlingRequestToSell(this);
        cap1.__initCapability(this,"cap1");
        cap1.init_desc();
        addNamedObject("sharesToSell","stockMarket.OrderBook",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("investors","stockMarket.investors",aos.jack.jak.agent.Agent.WRITEABLE);
        addNamedObject("publicCompaniesInMarket","stockMarket.PublicCompaniesInMarket",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("stockMarket.NewCompanyShares",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("stockMarket.NewCompanyShares",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("stockMarket.FindAndTellInvesters",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("stockMarket.FindAndTellInvesters",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("investor.MessageNewSharesAvailable",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("investor.PublicCompanyAttributesChange",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("stockMarket.NewInvestor",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("stockMarket.NewInvestor",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("stockMarket.AddNewCompanyShares",0);
        addPlan("stockMarket.TellInvestors",0);
        addPlan("stockMarket.AddInvestors",0);
    }
    
    public void init_desc()
    {
        newAgentDesc("Market");
        super.init_desc();
        __init_desc();
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        cap.__bindNames();
        cap1.__bindNames();
    }
    
    public void setEnabled(boolean t)
    {
        super.setEnabled(t);
        cap.setEnabled(t);
        cap1.setEnabled(t);
    }
    
    private stockMarket.OrderBook __named_data_sharesToSell()
    {
        if (sharesToSell != null) 
            return sharesToSell;
        sharesToSell = new stockMarket.OrderBook();
        if (!sharesToSell.attach(this)) 
            sharesToSell = null;
        setNamedObject("sharesToSell","stockMarket.OrderBook",sharesToSell);
        return sharesToSell;
    }
    
    private stockMarket.investors __named_data_investors()
    {
        if (investors != null) 
            return investors;
        investors = new stockMarket.investors();
        if (!investors.attach(this)) 
            investors = null;
        setNamedObject("investors","stockMarket.investors",investors);
        return investors;
    }
    
    private stockMarket.PublicCompaniesInMarket __named_data_publicCompaniesInMarket()
    {
        if (publicCompaniesInMarket != null) 
            return publicCompaniesInMarket;
        publicCompaniesInMarket = new stockMarket.PublicCompaniesInMarket();
        if (!publicCompaniesInMarket.attach(this)) 
            publicCompaniesInMarket = null;
        setNamedObject("publicCompaniesInMarket","stockMarket.PublicCompaniesInMarket",publicCompaniesInMarket);
        return publicCompaniesInMarket;
    }
    
}