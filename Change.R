Bill<-as.numeric(readline("Bill: "))
Paid<-as.numeric(readline("Paid: "))
Change<-Paid-Bill
Change<-round(Change*100)/100
Z<-Change
P<-round((Change%%1)*100)
X<-nchar(Z*100)
Y=0
String=""
if(Z==0){
  String<-"No Change"
}
if(Z<0){
  E<-1
  Z<-Z^2
  Z<-Z^0.5
}else{
  E<-0
}
while(Z>0){
  A<-trunc(Z%%10)
  Z<-Z/10
  B<-trunc(Z%%10)
  Z<-Z/10
  C<-trunc(Z%%10)
  
  if((B==1)&(A!=0)){
    String<-c(switch(A,"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"),String)
  }
  if(B!=1){
    String<-c(switch(A,"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"),String)
  }
  if((B!=1)|((B==1)&(A==0))){
    String<-c(switch(B,"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"),String)
  }
  if(C!=0){
    if((B!=0)&(A!=0)){
      String<-c("And",String)
    }
    String<-c("Hundred",String)
  }
  String<-c(switch(C,"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"),String)
  Z<-Z/10
  if(Z>1){
    Y<-Y+1
    String<-c(switch(Y,"Thousand","Million","Billion","Trillion","Quadrillion"),String)
  }
}
String<-c(String,"Pounds")
String2<-""
while(P>0){
  A<-trunc(P%%10)
  P<-P/10
  B<-trunc(P%%10)
  
  if((B==1)&(A!=0)){
    String2<-c(switch(A,"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"),String2)
  }
  if(B!=1){
    String2<-c(switch(A,"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"),String2)
  }
  if((B!=1)|((B==1)&(A==0))){
    String2<-c(switch(B,"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"),String2)
  }
  P<-0
}
String2<-c(String2,"Pence")
String<-c("",String,String2)
if(E==1){
  String<-c("Still Owed ",String)
}
String<-paste(String, collapse=" ")

print(paste(c("Change: £",Change,String),collapse=""))
Count<-0
while(Change>=50){
  Change<-Change-50
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<50)&(Count!=0)){
    print(paste(c("£50 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=20){
  Change<-Change-20
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<20)&(Count!=0)){
    print(paste(c("£20 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=10){
  Change<-Change-10
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<10)&(Count!=0)){
    print(paste(c("£10 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=5){
  Change<-Change-5
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<5)&(Count!=0)){
    print(paste(c("£5 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=2){
  Change<-Change-2
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<2)&(Count!=0)){
    print(paste(c("£2 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=1){
  Change<-Change-1
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<1)&(Count!=0)){
    print(paste(c("£1 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=0.50){
  Change<-Change-0.50
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<0.50)&(Count!=0)){
    print(paste(c("£0.50 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=0.20){
  Change<-Change-0.20
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<0.20)&(Count!=0)){
    print(paste(c("£0.20 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=0.10){
  Change<-Change-0.10
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<0.10)&(Count!=0)){
    print(paste(c("£0.10 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=0.05){
  Change<-Change-0.05
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<0.05)&(Count!=0)){
    print(paste(c("£0.05 = ",Count),collapse=""))
  }
}
Count<-0
while(Change>=0.02){
  Change<-Change-0.02
  Count<-Count+1
  Change<-round(Change*100)/100
  if((Change<0.02)&(Count!=0)){
    print(paste(c("£0.02 = ",Count),collapse=""))
  }
}
if(Change==0.01){
    print("£0.01 = 1")
}