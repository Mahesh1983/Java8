package com.example.reflection.declaringclass;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private long crmID;
	private int nameSpace;

	public Employee(long crmID, int nameSpace) {
	  super();
	  this.crmID = crmID;
	  this.nameSpace = nameSpace;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Object obj) {
	  //null instanceof Object will always return false
	  if (!(obj instanceof Employee))
	    return false;
	  if (obj == this)
	    return true;
	  return  this.crmID == ((Employee) obj).crmID &&
	          this.nameSpace == ((Employee) obj).nameSpace;
	}

	public int hashCode() {
	  int result = 0;
	  result = (int)(crmID/12) + nameSpace;
	  return result;
	}

	public static void main(String[] args) {
	  Map m = new HashMap();
	  Employee e1 = new Employee(2345891234L,0);
	  m.put(e1,"Jeff Smith");
	  Employee e2 = new Employee(2345891234L,0);
	  m.put(e2,"Jeff Smith");
	  System.out.println(m.get(e2));
	  
	  System.out.println(m.size());
	  
	  System.out.println(e1 == e2);
	}

}
