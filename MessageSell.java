

/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.event.BDIMessageEvent;

/** Automatically generated class from 'null'. */
public class MessageSell extends aos.jack.jak.event.BDIMessageEvent implements aos.apib.Base, java.io.Serializable {

  public static final __SS streamer = new __SS();

  /** Automatically generated method. */
  public aos.apib.StreamerSupport getStreamer()
    { return streamer; }

  /** Automatically generated method. */
  public int hashCode() {
     streamer.setup();
     return aos.apib.Util.hashCode(this);
  }

  /** Automatically generated method. */
  public boolean equals(Object o) {
     if (!(o instanceof aos.apib.Base)) return false;
     return aos.apib.Util.equals(this, (aos.apib.Base)o);
  }

  public String	company;
  public int	price;
  public int	numberOfShares;
  final static java.lang.String[]	__eventVariableNames = {
    "company",
    "price",
    "numberOfShares"};
  final static java.lang.String[]	__eventVariableTypes = {
    "String",
    "int",
    "int"};


public java.lang.String getDocumentation()
{
    return "/**\n * \n */\n";
}



public stockMarket.MessageSell generateSellMessage(java.lang.String company, int price, int shares)
{
    stockMarket.MessageSell tmp = new stockMarket.MessageSell();
    tmp.init(this);
    return tmp.generateSellMessage_body(company,price,shares);
}



private stockMarket.MessageSell generateSellMessage_body(java.lang.String company, int price, int shares)
{
    this.company = company;
    this.price = price;
    this.numberOfShares = shares;
    message = "I want to sell " + shares + " shares of " + company + " for " + price;
    return this;
}



public java.lang.String stateInfo()
{
    return "stockMarket/MessageSell.event [" + super.stateInfo() + "]";
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
            return aos.util.ToObject.box(company);
        }
        case 1: 
        {
            return aos.util.ToObject.box(price);
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


  /** Automatically generated constructor. */
  public MessageSell() {
    streamer.setup();
    if (!getStreamer().initialized) return;
    __init__MessageSell();
  }

  /** Automatically generated method. */
  void __init__MessageSell() {

  }

  /** Automatically generated JACOB streamer class */
  static class __SS extends aos.apib.StreamerSupport {
    MessageSell __def = null;

    /** Return a static instance. */

    public aos.apib.Base getDefaultInstance() { return __def; }

    private String[] fn = {
    ":company",
    ":price",
    ":numberOfShares",
    ":__eventVariableNames",
    ":__eventVariableTypes",
    };

    private String[] dn = {
    ":company",
    ":price",
    ":numberOfShares",
    ":__eventVariableNames",
    ":__eventVariableTypes",
    };

    private boolean[] ftr = {
    false,
    false,
    false,
    false,
    false,
    };

    private boolean[] fst = {
    false,
    false,
    false,
    true,
    true,
    };

    private boolean[] fhd = {
    false,
    false,
    false,
    false,
    false,
    };

    private int[] ft = {
    11,
    3,
    3,
    14,
    14,
    };

    private aos.apib.EnumInfo[] fe = {
	null,
	null,
	null,
	null,
	null,
    };

    private String[] cm = {
    null,
    null,
    null,
    null,
    null,
    };


    private aos.apib.StreamerSupport[][] al = {
	null,
	null,
	null,
	null,
	null,
    };

    private String[] fsubt = {
    null, 
    null, 
    null, 
    "java.lang.String[]",
    "java.lang.String[]",
    };

    /** Construct the streamer. */
    public __SS() {
      __type = "MessageSell";
      __icon = null;
      __comment = "Auto generated by the JACK Agents Compiler";
      __field_names = fn;
      __display_names = dn;
      __field_types = ft;
      __field_static = fst;
      __field_hidden = fhd;
      __field_transient = ftr;
      __field_subtypes = fsubt;
      __field_comments = cm;
      __enuminfos = fe;
      __allowed = al;
      register(__type, this);
    }

    private boolean setup_done = false;

    /** Initialization. */
    protected void setup() {
      if ( setup_done ) return;

      setup_done = true; 

      __def = (MessageSell)newInstance();
      setStreamedType(__def.getClass());
      baseclasses = findBaseStreamer(__def.getClass());
    }

    /** Initialization. */
    protected void init() {
      setup();
      __def.__init__MessageSell();
    }

    /** JACOB method. */
    public boolean isDummy() { return false; }

    /** JACOB method. */
    public aos.apib.Base new_instance() {
      return new MessageSell();
    }

    /** JACOB method. */
    public aos.apib.Base[] new_array(int n) {
      return new MessageSell[n];
    }

    /** JACOB class reading method. */
    public boolean read(aos.apib.InStream in, aos.apib.Base o) {
      int i = -1;
      while ((i = in.nextField(i, this)) >= 0) {
        if ( !readField( in, o, i ) ) {
          return false;
        }
      }
      return true;
    }

    /** JACOB method to read fields. */
    public boolean readField(aos.apib.InStream in, aos.apib.Base o,int i) {
      if ( i > __field_names.length )
        return getBaseClassStreamer().readField( in, o, i - __field_names.length - 1 );
      MessageSell v = (MessageSell)o;
      switch (i) {
      case 0:
	v.company = in.getString(true);
	break;
   case 1:
	v.price = in.getInt();
	break;
   case 2:
	v.numberOfShares = in.getInt();
	break;
      case 5:
        in.readBaseClasses(o, this, 0);
        break;
      default:
        if (i >= 0 && i <= 5) break;
        in.error("Reader for MessageSell: illegal field number:"+i);
        return false;
      }
      return true;
    }

    /** JACOB class writing method. */
    public boolean write(aos.apib.OutStream out, aos.apib.Base o) {
      MessageSell v = (MessageSell)o;
      int i = -1;
      while ((i = out.nextField(i, this)) >= 0) {
        switch (i) {
      case 0:
	out.putString(v.company, i, __def.company, this);
	break;
   case 1:
	out.putInt(v.price, i, __def.price, this);
	break;
   case 2:
	out.putInt(v.numberOfShares, i, __def.numberOfShares, this);
	break;
        case 5:
          out.writeBaseClasses(o, this);
          break;
        default:
          if (i >= 0 && i <= 5) break;
          out.error("Writer for MessageSell: illegal field number:"+i);
          return false;
        }
      }
      return true;
    }

    /** JACOB method. */
    public boolean isDefault(aos.apib.Base o) {
      MessageSell v = (MessageSell)o;

	if (v.company != __def.company) {
	   if (v.company == null) return false;
	   if (__def.company == null) return false;
	   if (!v.company.equals(__def.company)) return false;
	}
	if (v.price != __def.price) return false;
	if (v.numberOfShares != __def.numberOfShares) return false;
      if (baseclasses != null && baseclasses.length == 1)
        return baseclasses[0].isDefault(o);
      return true;
    }

    /** JACOB method. */
    public void findNonApib(aos.apib.OutStream out, aos.apib.Base o) {
     MessageSell v = (MessageSell)o;

      if (baseclasses != null && baseclasses.length == 1)
        baseclasses[0].findNonApib(out, o);
    }
  }

}

