/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.core.Jak;
import aos.jack.jak.event.EventRecipient;
import aos.jack.jak.beliefset.OpenWorld;
import aos.jack.jak.beliefset.OpenWorldCursor;
import aos.jack.jak.beliefset.BeliefSetCursor;
import aos.jack.jak.beliefset.BeliefSetException;
import aos.jack.jak.beliefset.Tuple;
import aos.jack.jak.beliefset.BeliefSet;
import aos.jack.jak.logic.ChoicePoint;
import aos.jack.jak.logic.Variable;
import aos.jack.jak.cursor.BeliefState;
import aos.jack.jak.cursor.Cursor;

/**
 * 
 */

public class PublicCompaniesInMarket extends aos.jack.jak.beliefset.OpenWorld {
    static public stockMarket.PublicCompaniesInMarket__Tuple __hole = new stockMarket.PublicCompaniesInMarket__Tuple(true);
    public stockMarket.PublicCompaniesInMarket__Tuple[][] __tables;
    public java.lang.String getDocumentation()
    {
        return "/**\n * \n */\n";
    }
    
    public boolean attach(aos.jack.jak.event.EventRecipient __h)
    {
        java.lang.Object __o = __h;
        if (!super.attach(__h)) 
            return false;
        return true;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor getCompanyAttributes(java.lang.String __v0, aos.jack.jak.logic.IntegerVariable __v1, aos.jack.jak.logic.FloatVariable __v2, aos.jack.jak.logic.FloatVariable __v3, aos.jack.jak.logic.FloatVariable __v4)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        stockMarket.PublicCompaniesInMarket__Tuple __t = new stockMarket.PublicCompaniesInMarket__Tuple();
        stockMarket.PublicCompaniesInMarket.__Cursor __c = new stockMarket.PublicCompaniesInMarket.__Cursor(__t);
        __t.companyName = __v0;
        if (!__v1.check_unifiable(java.lang.Integer.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: arg 1 numShares Incorrect Variable type");
        if (__v1.isGround()) {
            try {
                __t.numShares = __v1.as_int();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: got " + e.toString());
            }
        }
         else 
            __c.numShares = __v1;
        if (!__v2.check_unifiable(java.lang.Float.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: arg 2 sharePrice Incorrect Variable type");
        if (__v2.isGround()) {
            try {
                __t.sharePrice = __v2.as_float();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: got " + e.toString());
            }
        }
         else 
            __c.sharePrice = __v2;
        if (!__v3.check_unifiable(java.lang.Float.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: arg 3 percentageOfTotCompany Incorrect Variable type");
        if (__v3.isGround()) {
            try {
                __t.percentageOfTotCompany = __v3.as_float();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: got " + e.toString());
            }
        }
         else 
            __c.percentageOfTotCompany = __v3;
        if (!__v4.check_unifiable(java.lang.Float.TYPE)) 
            throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: arg 4 netIncome Incorrect Variable type");
        if (__v4.isGround()) {
            try {
                __t.netIncome = __v4.as_float();
            }
            catch (java.lang.Exception e) {
                throw new aos.jack.jak.beliefset.BeliefSetException("PublicCompaniesInMarket:getCompanyAttributes:IOOOO: got " + e.toString());
            }
        }
         else 
            __c.netIncome = __v4;
        __c.init(0,this);
        return __c;
    }
    
    public int keyIndex()
    {
        return 0;
    }
    
    public int fullIndex()
    {
        return 0;
    }
    
    public int nIndexes()
    {
        return 1;
    }
    
    public aos.jack.jak.beliefset.Tuple newTuple()
    {
        return new stockMarket.PublicCompaniesInMarket__Tuple();
    }
    
    public aos.jack.jak.beliefset.Tuple getTuple(int t, int l)
    {
        return __tables[t][l];
    }
    
    public aos.jack.jak.beliefset.Tuple[] newTable(int t)
    {
        return new stockMarket.PublicCompaniesInMarket__Tuple[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] newTables(int t)
    {
        return new stockMarket.PublicCompaniesInMarket__Tuple[t][];
    }
    
    public aos.jack.jak.beliefset.Tuple[] getTable(int t)
    {
        return __tables[t];
    }
    
    public aos.jack.jak.beliefset.Tuple[][] getTables()
    {
        return __tables;
    }
    
    public void setTables(aos.jack.jak.beliefset.Tuple[][] t)
    {
        __tables = (stockMarket.PublicCompaniesInMarket__Tuple[][]) t;
    }
    
    public aos.jack.jak.beliefset.BeliefSetCursor newCursor(aos.jack.jak.beliefset.Tuple __t)
    {
        if (__t instanceof stockMarket.PublicCompaniesInMarket__Tuple) 
            return new stockMarket.PublicCompaniesInMarket.__Cursor((stockMarket.PublicCompaniesInMarket__Tuple) __t);
        return null;
    }
    
    public void add(java.lang.String __v0, int __v1, float __v2, float __v3, float __v4)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        add(__v0,__v1,__v2,__v3,__v4,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void add(java.lang.String __v0, int __v1, float __v2, float __v3, float __v4, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        stockMarket.PublicCompaniesInMarket__Tuple __t = new stockMarket.PublicCompaniesInMarket__Tuple();
        __t.companyName = __v0;
        __t.numShares = __v1;
        __t.sharePrice = __v2;
        __t.percentageOfTotCompany = __v3;
        __t.netIncome = __v4;
        super.assertTuple(__t,__d);
    }
    
    public void remove(java.lang.String __v0, int __v1, float __v2, float __v3, float __v4)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        remove(__v0,__v1,__v2,__v3,__v4,aos.jack.jak.cursor.Cursor.TRUE);
    }
    
    public void remove(java.lang.String __v0, int __v1, float __v2, float __v3, float __v4, aos.jack.jak.cursor.BeliefState __d)
        throws aos.jack.jak.beliefset.BeliefSetException
    {
        stockMarket.PublicCompaniesInMarket__Tuple __t = new stockMarket.PublicCompaniesInMarket__Tuple();
        __t.companyName = __v0;
        __t.numShares = __v1;
        __t.sharePrice = __v2;
        __t.percentageOfTotCompany = __v3;
        __t.netIncome = __v4;
        super.retractTuple(__t,__d);
    }
    
    public PublicCompaniesInMarket()
    {
    }
    
    public PublicCompaniesInMarket(java.lang.String n)
    {
        super();
        read(n);
    }
    
    class __Cursor extends aos.jack.jak.beliefset.OpenWorldCursor {
        public stockMarket.PublicCompaniesInMarket__Tuple __tuple = null;
        public aos.jack.jak.logic.Variable companyName;
        public aos.jack.jak.logic.Variable numShares;
        public aos.jack.jak.logic.Variable sharePrice;
        public aos.jack.jak.logic.Variable percentageOfTotCompany;
        public aos.jack.jak.logic.Variable netIncome;
        public __Cursor()
        {
            __tuple = __hole;
        }
        
        public __Cursor(stockMarket.PublicCompaniesInMarket__Tuple __t)
        {
            super();
            __tuple = __t;
        }
        
        public int match(int __ti, int __st, int __c, boolean __k, int __ind)
        {
            stockMarket.PublicCompaniesInMarket__Tuple[] __tab = __tables[__ti];
            stockMarket.PublicCompaniesInMarket__Tuple __t;
            int __sz = __tab.length;
            int __i;
            if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) {
                aos.jack.jak.core.Jak.log.log("PublicCompaniesInMarket__Tuple:match:" + __ti + ":" + __st + ":" + __c + ":" + __k + ":" + __ind);
                aos.jack.jak.core.Jak.log.log("Tuple=" + __tuple);
                aos.jack.jak.core.Jak.log.log("Outputs are");
                aos.jack.jak.core.Jak.log.log("  companyName:" + companyName);
                aos.jack.jak.core.Jak.log.log("  numShares:" + numShares);
                aos.jack.jak.core.Jak.log.log("  sharePrice:" + sharePrice);
                aos.jack.jak.core.Jak.log.log("  percentageOfTotCompany:" + percentageOfTotCompany);
                aos.jack.jak.core.Jak.log.log("  netIncome:" + netIncome);
            }
            for (__i = __st; __c > 0; __i = (__i + 1) % __sz, __c-- ) {
                __t = __tab[__i];
                if (__t == null) {
                    if (__ind < 0) 
                        continue;
                    return -1;
                }
                if (__t == __hole) 
                    continue;
                if (__t.isFree) {
                    __tab[__i] = __hole;
                    continue;
                }
                if ((aos.jack.jak.core.Jak.debugging & aos.jack.jak.core.Jak.LOG_DB) != 0) 
                    aos.jack.jak.core.Jak.log.log("t" + __i + ":" + __t);
                try {
                    if (cp != null) 
                        cp.backtrack();
                    if (companyName == null) {
                        if (!__tuple.companyName.equals(__t.companyName)) 
                            continue;
                    }
                     else {
                        if (!companyName.unify(__t.companyName)) 
                            continue;
                    }
                    if (__k) 
                        return __i;
                    if (numShares == null) {
                        if (__tuple.numShares != __t.numShares) 
                            continue;
                    }
                     else {
                        if (!numShares.unify(__t.numShares)) 
                            continue;
                    }
                    if (sharePrice == null) {
                        if (__tuple.sharePrice != __t.sharePrice) 
                            continue;
                    }
                     else {
                        if (!sharePrice.unify(__t.sharePrice)) 
                            continue;
                    }
                    if (percentageOfTotCompany == null) {
                        if (__tuple.percentageOfTotCompany != __t.percentageOfTotCompany) 
                            continue;
                    }
                     else {
                        if (!percentageOfTotCompany.unify(__t.percentageOfTotCompany)) 
                            continue;
                    }
                    if (netIncome == null) {
                        if (__tuple.netIncome != __t.netIncome) 
                            continue;
                    }
                     else {
                        if (!netIncome.unify(__t.netIncome)) 
                            continue;
                    }
                }
                catch (java.lang.Exception e) {
                    continue;
                }
                return __i;
            }
            return -1;
        }
        
        public int hash(int __i)
        {
            return (__tuple == null?0:__tuple.hash(__i));
        }
        
        public aos.jack.jak.logic.ChoicePoint getChoicePoint()
        {
            if (companyName != null) 
                return companyName.getEnv().newChoicePoint();
            if (numShares != null) 
                return numShares.getEnv().newChoicePoint();
            if (sharePrice != null) 
                return sharePrice.getEnv().newChoicePoint();
            if (percentageOfTotCompany != null) 
                return percentageOfTotCompany.getEnv().newChoicePoint();
            if (netIncome != null) 
                return netIncome.getEnv().newChoicePoint();
            return null;
        }
        
        public boolean isKeyGround()
        {
            if (companyName != null) 
                return false;
            return true;
        }
        
    }
}
