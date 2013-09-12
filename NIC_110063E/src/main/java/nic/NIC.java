/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nic;

/**
 *
 * @author Bruntha
 */
public class NIC {
    
    String id;
int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int mo = 0, da = 0;
boolean res=true;

public void calculate(String nicnumber)
{
    id=nicnumber;
    if(validate())
    {
        setMonth();
    }
}
public boolean isVoter()
{
    boolean res=false;
    
    if(id.substring(9).equalsIgnoreCase("V"))
    {
        res=true;
    }
    return res;
}
public boolean validate()
{
        
    if(id.length()!=10)
    {
        res=false;
    }
    else if(id.substring(10).equalsIgnoreCase("v"))
    {
        res=false;
    }
    return res;
    
}
public String getResult()
{
    String ltres;
    if(res)
    {
        ltres="Nic[birthday=BirthDay[year"+getYear()+", month="+getMonth()+", date="+getDay()+"], gender="+getSex()+", isVoter="+isVoter()+"]";
     //   String l2=l1.concate+
    }
    else
    {
        ltres="NIC number is not valid";
    }
    return ltres;
}
public int getYear() {
    return (1900 + Integer.parseInt(id.substring(0, 2)));
}

public int getDays() {
    int d = Integer.parseInt(id.substring(2, 5));
    if (d > 500) {
        return (d - 500);
    } else {
        return d;
    }
}

public void setMonth() {
    
    int days = getDays();

    for (int i = 0; i < month.length; i++) {
        if (days < month[i]) {
            mo = i + 1;
            da = days;
            break;
        } else {
            days = days - month[i];
        }
    }
 //   System.out.println("Month : " + mo + "\nDate : " + da);

}
public int getMonth()
{
	return mo;
}
public int getDay()
{
	return da;
}
public String getSex() {
    String M = "Male", F = "Female";
    int d = Integer.parseInt(id.substring(2, 5));
    if (d > 500) {
        return F;
    } else {
        return M;
    }

    
}
}