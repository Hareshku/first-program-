class S{
String sName,sId, sDept;
S(){
sName="Jk";
sId="21sw09";
sDept="te";
}
S(String n,String id, String d){
sName=n;
sId=id;
sDept=d;
}
S(S ref){
this.sName=ref.sName;
this.sId=ref.sId;
this.sDept=ref.sDept;
}
void display(){
System.out.println(sName);
System.out.println(sId);
System.out.println(sDept);
}
}
class P{
public static void main(String[] args){
S s1=new S();
s1.display();
S s2=new S("Hk","21sw8","SW");
s2.display();
S s3=new S(s2);
s3.display();
}
}