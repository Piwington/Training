Z<-readline("Number: ")
X<-nchar(Z)
Y=0
Z<-as.numeric(Z)
String=""
if(Z==0){
  String<-"Zero"
}
if(Z<0){
  E<-1
  Z<-Z^2
  Z<-Z^0.5
}else{
  E<-0
}
while(Z>0){
  A<-trunc((Z%%10))
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
if(E==1){
  String<-c("Negative",String)
}
print(paste(String, collapse=" "))