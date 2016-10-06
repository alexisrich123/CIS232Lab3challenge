
public class Employee {
String name;
String number;
int date;
// to help format the number
protected String l;
protected int n;

public Employee (String name,String number, int data,String l,int n){
	this.name=name;
	this.date=data;
	this.number=number;
	this.l=l;
	this.n=n;

}
public void setname(String name){
	name=name;
}
public String getname(){
	return name;
}
public void setnumber(String number){
//number=number.format(l,n);
	number=number;
}

}
