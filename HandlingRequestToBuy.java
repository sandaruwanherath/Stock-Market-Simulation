/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.agent.Capability;
import aos.jack.jak.agent.NameSpace;
import aos.jack.jak.agent.Agent;
import investor.MessageFinished;
import aos.jack.util.thread.Semaphore;
import java.lang.Object;

/**
 * 
 */

public class HandlingRequestToBuy extends aos.jack.jak.agent.Capability {
    public stockMarket.OrderBook sharesToSell;
    public aos.jack.util.thread.Semaphore mutex;
    public investor.MessageFinished ev;
    protected void autorun()
    {
        mutex.signal();
    }
    
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public void __init1()
    {
        setNamedCreator("sharesToSell","stockMarket.OrderBook",new aos.jack.jak.agent.DataCreator(false){
            public java.lang.Object create()
            {
                return __named_data_sharesToSell();
            }
            
        },true);
        setNamedCreator("mutex","aos.jack.util.thread.Semaphore",new aos.jack.jak.agent.DataCreator(true){
            public java.lang.Object create()
            {
                return __named_data_mutex();
            }
            
        },true);
    }
    
    public void __init2()
    {
        ev = (investor.MessageFinished) findEvent("investor.MessageFinished");
        sharesToSell = (stockMarket.OrderBook) getNamedObject("sharesToSell","stockMarket.OrderBook");
        getNamedObject("mutex","aos.jack.util.thread.Semaphore");
        autorun();
    }
    
    synchronized public void __init_desc()
    {
        externals.put("sharesToSell","sharesToSell");
        externals.put("stockMarket.MessageBuy","stockMarket.MessageBuy");
        addNamedObject("mutex","aos.jack.util.thread.Semaphore",aos.jack.jak.agent.Agent.WRITEABLE);
        addEvent("investor.MessageFinished",aos.jack.jak.agent.Agent.SENT_EVENT);
        addEvent("stockMarket.MessageBuy",aos.jack.jak.agent.Agent.HANDLED_EVENT);
        addPlan("stockMarket.ProcessRequestPlan",0);
    }
    
    public HandlingRequestToBuy(aos.jack.jak.agent.NameSpace outer)
    {
        super(outer);
    }
    
    synchronized public void __bindNames()
    {
        super.__bindNames();
        __bindToPlan("stockMarket.ProcessRequestPlan");
    }
    
    private stockMarket.OrderBook __named_data_sharesToSell()
    {
        sharesToSell = (stockMarket.OrderBook) getNamedObject("sharesToSell","stockMarket.OrderBook");
        return sharesToSell;
    }
    
    private aos.jack.util.thread.Semaphore __named_data_mutex()
    {
        if (mutex != null) 
            return mutex;
        mutex = new aos.jack.util.thread.Semaphore();
        setNamedObject("mutex","aos.jack.util.thread.Semaphore",mutex);
        return mutex;
    }
    
}
