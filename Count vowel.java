class Countvowels
{
public static void main(String arg[])
{
String a="Savvetha School of Engineering";
String b=a.toLowerCase();
char ch;
int n=b.length(),i,vcount=0;
for(i=0;i<n;i++)
{
ch=b.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
vcount++;
}
System.out.println("Number of vowels is:"+vcount);
}
}
}
