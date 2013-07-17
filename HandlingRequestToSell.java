/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import aos.jack.util.thread.Semaphore;
import java.lang.Object;

/**
 * 
 */

public class HandlingRequestToSell extends aos.jack.jak.agent.Capability {
    public aos.jack.util.thread.Semaphore mutex2;
    public stockMarket.FindAndTellInvesters ev;
    public stockMarket.NewCompanyShares ev1;
    protected void autorun()
    {
        mutex2.signal();
    }
    
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public void __init1()
    {
        setNamedCreator("mutex2","aos.jack.util.thread.Semaphore",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_mutex2();
            }
            
        },true);
    }
    
    public void __init2()
    {
        ev = (stockMarket.FindAndTellInvesters) findEvent("stockMarket.FindAndTellInvesters");
        ev1 = (stockMarket.NewCompanyShares) findEvent("stockMarket.NewCompanyShares");
        getNamedObject("mutex2","aos.jack.util.thread.Semaphore");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("stockMarket.NewCompanyShares","stockMarket.NewCompanyShares");
        externals.put("stockMarket.FindAndTellInvesters","stockMarket.FindAndTellInvesters");
        externals.put("stockMarket.MessageSell","stockMarket.MessageSell");
        addNamedObject("mutex2","aos.jack.util.thread.Semaphore",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("stockMarket.MessageSell",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addEvent("stockMarket.FindAndTellInvesters",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addEvent("stockMarket.NewCompanyShares",aos.jack.jak.agent.Agent.POSTED_EVENT);
        addPlan("stockMarket.HandleSellRequest",0);
    }
    
    public HandlingRequestToSell(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("stockMarket.HandleSellRequest");
    }
    
    private aos.jack.util.thread.Semaphore __named_data_mutex2()
    {
        if (mutex2 != null) 
            return mutex2;
        mutex2 = new aos.jack.util.thread.Semaphore();
        setNamedObject("mutex2","aos.jack.util.thread.Semaphore",mutex2);
        return mutex2;
    }
    
}