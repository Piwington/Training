C<-c("Name",1,2,"Reg")
B<-c("Nam",5,6,"WOOT")
A<-list("Pie",5,9,"Trap",4,B,C)
print(A)
for(G in A){
  print(G)
}
D<-as.numeric(A[2])+as.numeric(A[5])
E<-A[[3]]+A[[2]]