package io.gatling.jsonbenchmark.serialization;

import org.boon.json.annotations.JsonIgnore;
import org.boon.json.annotations.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties ({"ignoreMe2","ignoreMe3"})
public class AllTypes implements Serializable {

    String ignoreMe3;
    String ignoreMe2;

    int myInt;
    boolean myBoolean;
    short myShort;
    long myLong;
    String string;
    String string2;
    BigDecimal bigDecimal;
    BigInteger bigInteger;
    Date date;

    float myFloat;
    double myDouble;
    byte myByte;

    FooEnum foo;
    FooEnum bar;

    @JsonIgnore
    String ingnoreMe;


    long someDate = new Date (  ).getTime ();

    AllTypes allType;

    List<AllTypes> allTypes = new ArrayList<> (  );

    public String getString2 () {
        return string2;
    }

    public void setString2 ( String string2 ) {
        this.string2 = string2;
    }

    public List<AllTypes> getAllTypes () {
        return allTypes;
    }

    public void setAllTypes ( List<AllTypes> allTypes ) {
        this.allTypes = allTypes;
    }

    public AllTypes getAllType () {
        return allType;
    }

    public void setAllType ( AllTypes allType ) {
        this.allType = allType;
    }

    public byte getMyByte () {
        return myByte;
    }

    public void setMyByte ( byte myByte ) {
        this.myByte = myByte;
    }

    public int getMyInt () {
        return myInt;
    }

    public void setMyInt ( int myInt ) {
        this.myInt = myInt;
    }

    public boolean isMyBoolean () {
        return myBoolean;
    }

    public void setMyBoolean ( boolean myBoolean ) {
        this.myBoolean = myBoolean;
    }

    public short getMyShort () {
        return myShort;
    }

    public void setMyShort ( short myShort ) {
        this.myShort = myShort;
    }

    public long getMyLong () {
        return myLong;
    }

    public void setMyLong ( long myLong ) {
        this.myLong = myLong;
    }

    public String getString () {
        return string;
    }

    public void setString ( String string ) {
        this.string = string;
    }

    public float getMyFloat () {
        return myFloat;
    }

    public void setMyFloat ( float myFloat ) {
        this.myFloat = myFloat;
    }

    public double getMyDouble () {
        return myDouble;
    }

    public void setMyDouble ( double myDouble ) {
        this.myDouble = myDouble;
    }

    public BigDecimal getBigDecimal () {
        return bigDecimal;
    }

    public void setBigDecimal ( BigDecimal bigDecimal ) {
        this.bigDecimal = bigDecimal;
    }

    public BigInteger getBigInteger () {
        return bigInteger;
    }

    public void setBigInteger ( BigInteger bigInteger ) {
        this.bigInteger = bigInteger;
    }


    public Date getDate () {
        return date;
    }

    public void setDate ( Date date ) {
        this.date = date;
    }


    public FooEnum getFoo () {
        return foo;
    }

    public void setFoo ( FooEnum foo ) {
        this.foo = foo;
    }

    public FooEnum getBar () {
        return bar;
    }

    public void setBar ( FooEnum bar ) {
        this.bar = bar;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( !( o instanceof AllTypes ) ) return false;

        AllTypes allTypes1 = ( AllTypes ) o;

        if ( myBoolean != allTypes1.myBoolean ) return false;
        if ( myByte != allTypes1.myByte ) return false;
        if ( Double.compare ( allTypes1.myDouble, myDouble ) != 0 ) return false;
        if ( Float.compare ( allTypes1.myFloat, myFloat ) != 0 ) return false;
        if ( myInt != allTypes1.myInt ) return false;
        if ( myLong != allTypes1.myLong ) return false;
        if ( myShort != allTypes1.myShort ) return false;
        if ( allType != null ? !allType.equals ( allTypes1.allType ) : allTypes1.allType != null ) return false;
        if ( bar != allTypes1.bar ) return false;
        if ( bigDecimal != null ? !bigDecimal.equals ( allTypes1.bigDecimal ) : allTypes1.bigDecimal != null )
            return false;
        if ( bigInteger != null ? !bigInteger.equals ( allTypes1.bigInteger ) : allTypes1.bigInteger != null )
            return false;
        if ( date != null ? !date.equals ( allTypes1.date ) : allTypes1.date != null ) return false;
        if ( foo != allTypes1.foo ) return false;
        if ( string != null ? !string.equals ( allTypes1.string ) : allTypes1.string != null ) return false;
        if ( string2 != null ? !string2.equals ( allTypes1.string2 ) : allTypes1.string2 != null ) return false;

        if (allTypes == null && allTypes1.allTypes.size () == 0) {
            return true;
        } else {

            if ( allTypes != null ? !allTypes.equals ( allTypes1.allTypes ) : allTypes1.allTypes != null ) return false;

        }
        return true;
    }

    @Override
    public int hashCode () {
        int result;
        long temp;
        result = myInt;
        result = 31 * result + ( myBoolean ? 1 : 0 );
        result = 31 * result + ( int ) myShort;
        result = 31 * result + ( int ) ( myLong ^ ( myLong >>> 32 ) );
        result = 31 * result + ( string != null ? string.hashCode () : 0 );
        result = 31 * result + ( string2 != null ? string2.hashCode () : 0 );
        result = 31 * result + ( bigDecimal != null ? bigDecimal.hashCode () : 0 );
        result = 31 * result + ( bigInteger != null ? bigInteger.hashCode () : 0 );
        result = 31 * result + ( date != null ? date.hashCode () : 0 );
        result = 31 * result + ( myFloat != +0.0f ? Float.floatToIntBits ( myFloat ) : 0 );
        temp = Double.doubleToLongBits ( myDouble );
        result = 31 * result + ( int ) ( temp ^ ( temp >>> 32 ) );
        result = 31 * result + ( int ) myByte;
        result = 31 * result + ( foo != null ? foo.hashCode () : 0 );
        result = 31 * result + ( bar != null ? bar.hashCode () : 0 );
        result = 31 * result + ( allType != null ? allType.hashCode () : 0 );
        result = 31 * result + ( allTypes != null ? allTypes.hashCode () : 0 );
        return result;
    }

    public String getIgnoreMe3 () {
        return ignoreMe3;
    }

    public void setIgnoreMe3 ( String ignoreMe3 ) {
        this.ignoreMe3 = ignoreMe3;
    }

    public String getIgnoreMe2 () {
        return ignoreMe2;
    }

    public void setIgnoreMe2 ( String ignoreMe2 ) {
        this.ignoreMe2 = ignoreMe2;
    }

    public String getIngnoreMe () {
        return ingnoreMe;
    }

    public void setIngnoreMe ( String ingnoreMe ) {
        this.ingnoreMe = ingnoreMe;
    }

    public long getSomeDate () {
        return someDate;
    }

    public void setSomeDate ( long someDate ) {
        this.someDate = someDate;
    }

    @Override
    public String toString () {
        return "AllTypes{" +
                "myInt=" + myInt +
                ", myBoolean=" + myBoolean +
                ", myShort=" + myShort +
                ", myLong=" + myLong +
                ", string='" + string + '\'' +
                ", string2='" + string2 + '\'' +
                ", bigDecimal=" + bigDecimal +
                ", bigInteger=" + bigInteger +
                ", date=" + date +
                ", myFloat=" + myFloat +
                ", myDouble=" + myDouble +
                ", myByte=" + myByte +
                ", foo=" + foo +
                ", bar=" + bar +
                ", allType=" + allType +
                ", allTypes=" + allTypes +
                '}';
    }
}
