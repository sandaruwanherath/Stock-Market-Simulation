

/*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*
  This code is generated by JAC version 5.6 by
  Agent Oriented Software. http://www.agent-software.com.au

    DO NOT ALTER THIS CODE AND DO NOT REMOVE THIS COMMENT
 *=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*/
package stockMarket;
import aos.jack.jak.beliefset.OpenWorld;
import aos.jack.jak.beliefset.Tuple;

/** Automatically generated class from 'null'. */
public class investors__Tuple extends aos.jack.jak.beliefset.Tuple implements aos.apib.Base, java.io.Serializable {

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

  public String	name;


public investors__Tuple(boolean v)
{
    super();
    isFree = v;
}



public java.lang.String name()
{
    return "investors__Tuple";
}



public java.lang.String toString()
{
    java.lang.StringBuffer __s = new java.lang.StringBuffer();
    __s.append(name);
    return __s.toString();
}



public int hash(int __i)
{
    int __r = 0;
    switch (__i) {
        case 0: 
        {
            __r ^= (name.hashCode() & (~(1 << 31)));
            return __r;
        }
        case 1: 
        {
            return __r;
        }
    }
    return 0;
}


  /** Automatically generated constructor. */
  public investors__Tuple() {
    streamer.setup();
    if (!getStreamer().initialized) return;
    __init__investors__Tuple();
  }

  /** Automatically generated method. */
  void __init__investors__Tuple() {
	name = null;

  }

  /** Automatically generated JACOB streamer class */
  static class __SS extends aos.apib.StreamerSupport {
    investors__Tuple __def = null;

    /** Return a static instance. */

    public aos.apib.Base getDefaultInstance() { return __def; }

    private String[] fn = {
    ":name",
    };

    private String[] dn = {
    ":name",
    };

    private boolean[] ftr = {
    false,
    };

    private boolean[] fst = {
    false,
    };

    private boolean[] fhd = {
    false,
    };

    private int[] ft = {
    11,
    };

    private aos.apib.EnumInfo[] fe = {
	null,
    };

    private String[] cm = {
    null,
    };


    private aos.apib.StreamerSupport[][] al = {
	null,
    };

    private String[] fsubt = {
    null, 
    };

    /** Construct the streamer. */
    public __SS() {
      __type = "investors__Tuple";
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

      __def = (investors__Tuple)newInstance();
      setStreamedType(__def.getClass());
      baseclasses = findBaseStreamer(__def.getClass());
    }

    /** Initialization. */
    protected void init() {
      setup();
      __def.__init__investors__Tuple();
    }

    /** JACOB method. */
    public boolean isDummy() { return false; }

    /** JACOB method. */
    public aos.apib.Base new_instance() {
      return new investors__Tuple();
    }

    /** JACOB method. */
    public aos.apib.Base[] new_array(int n) {
      return new investors__Tuple[n];
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
      investors__Tuple v = (investors__Tuple)o;
      switch (i) {
      case 0:
	v.name = in.getString(true);
	break;
      case 1:
        in.readBaseClasses(o, this, 0);
        break;
      default:
        if (i >= 0 && i <= 1) break;
        in.error("Reader for investors__Tuple: illegal field number:"+i);
        return false;
      }
      return true;
    }

    /** JACOB class writing method. */
    public boolean write(aos.apib.OutStream out, aos.apib.Base o) {
      investors__Tuple v = (investors__Tuple)o;
      int i = -1;
      while ((i = out.nextField(i, this)) >= 0) {
        switch (i) {
      case 0:
	out.putString(v.name, i, __def.name, this);
	break;
        case 1:
          out.writeBaseClasses(o, this);
          break;
        default:
          if (i >= 0 && i <= 1) break;
          out.error("Writer for investors__Tuple: illegal field number:"+i);
          return false;
        }
      }
      return true;
    }

    /** JACOB method. */
    public boolean isDefault(aos.apib.Base o) {
      investors__Tuple v = (investors__Tuple)o;

	if (v.name != __def.name) {
	   if (v.name == null) return false;
	   if (__def.name == null) return false;
	   if (!v.name.equals(__def.name)) return false;
	}
      if (baseclasses != null && baseclasses.length == 1)
        return baseclasses[0].isDefault(o);
      return true;
    }

    /** JACOB method. */
    public void findNonApib(aos.apib.OutStream out, aos.apib.Base o) {
     investors__Tuple v = (investors__Tuple)o;

      if (baseclasses != null && baseclasses.length == 1)
        baseclasses[0].findNonApib(out, o);
    }
  }

}

