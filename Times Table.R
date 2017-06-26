ST<-as.numeric(readline("Table Range Start: "))
EN<-as.numeric(readline("Table Range End: "))
RA<-as.numeric(readline("Table Length: : "))
repeat{
  cat("",ST," Times Table")
  for (A in seq(1,RA)){
    B<-A*ST
    cat("\n",A," x ",ST," = ",B)
  }
  cat("\n","\n")
  if(ST==EN){break}
  if(ST>EN){
    ST=ST-1
  }else{
    ST=ST+1
  }
}