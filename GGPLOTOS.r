#install.packages("ggplot2")
print(OrchardSprays)
library(ggplot2)
ggplot(OrchardSprays,aes(treatment,decrease,fill=(treatment)))+geom_boxplot()+scale_x_discrete(limits=c())+ scale_color_gradient() + labs(fill="Treatment Type",x="Treatment Type",y="Size Of Decrease",title="Orchard Sprays",subtitle="How the Treatment Type Affects The Size Of Decrease",caption="Smaller Size Decreases Correspond To Small Range")


print(CO2)
colMeans(CO2["uptake"])
ggplot(CO2,aes(Type,uptake,fill=Type))+geom_boxplot()
quebec_CO2<-CO2[CO2$Type=="Quebec",]
mississippi_CO2<-CO2[CO2$Type=="Mississippi",]
mean_checker<-function(A,B){
  C<-colMeans(A["uptake"])
  D<-colMeans(B["uptake"])
  if(C>D){
    print(A[1,2])
    print(C)
  }else{
    print(B[1,2])
    print(D)
  }
}
mean_checker(quebec_CO2,mississippi_CO2)


print(ChickWeight)
ChWe<-ChickWeight[ChickWeight$Time=="21",]
ggplot(ChickWeight,aes(Diet,Chick,colour=Diet))+geom_point()
ggplot(ChickWeight,aes(Chick,Time,colour=Diet))+geom_dotplot(binwidth = 1)
ggplot(ChWe,aes(Diet,weight,fill=Diet))+geom_boxplot()
