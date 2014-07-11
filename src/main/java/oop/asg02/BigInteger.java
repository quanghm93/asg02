package oop.asg02;
 
 public class BigInteger{
	 private String str;
 
     public BigInteger(int init) {
         str=init+"";
     }
 
     
     public BigInteger(String init) {
		while(init.startsWith("0")==true){
			if(init.length()==1) break;
			init=init.substring(1,init.length());
		}
		str=init;
	}
 
     // tra ve kieu String cua BigInt
     public String toString() { 
         return str;
    }
     
      // tra ve kieu Long cua BigInt
     public long toLong() {   
         return Long.parseLong(str);  
     }
 
     
	// tra ve doi tuong BigInt la tong cua hai BigInt	
     public BigInteger add(BigInteger other) {   
			String sum="";
			int i=str.length(),j=other.str.length();
			int nho=0;
			while(i>0&&j>0||nho==1){
					int a;
					if(i<=0)a=0;else a=Integer.parseInt(str.substring(i-1,i));
					int b;
					if(j<=0)b=0;else b=Integer.parseInt(other.str.substring(j-1,j));
					int c=a+b+nho;
					if(a+b+nho>=10) {c=a+b+nho-10; nho=1;}else nho=0;
					sum=sum.concat(c+"");
					i--;j--;
			}
			sum=new StringBuffer(sum).reverse().toString();
			if(i>0){
				sum=str.substring(0,i).concat(sum);
			}else{
				sum=other.str.substring(0,j).concat(sum);
			}

			BigInteger s=new BigInteger(sum);
		 return s;
     }
 
  	// tra ve doi tuong BigInt la hieu cua hai BigInt
     public BigInteger subtract(BigInteger other) {
		 String sub="";
			int i=str.length(),j=other.str.length();
			int nho=0;
			while(i>0&&j>0||nho==1){
					int a=Integer.parseInt(str.substring(i-1,i));
					int b;
					if(j<=0)b=0;else b=Integer.parseInt(other.str.substring(j-1,j));
					int c=a-b-nho;
					if(a-b-nho<0) {c=a-b-nho+10; nho=1;}else nho=0;
					sub=sub.concat(c+"");
					i--;j--;
			}
			sub=new StringBuffer(sub).reverse().toString();
			sub=str.substring(0,i).concat(sub);
			BigInteger s=new BigInteger(sub);
		 return s;
     }
     
	// so danh gia tri cua hai so, tra ve keiu boolean
     public boolean equals(Object other) {
         return toString().equals(other.toString());
     }
 

 }
