Phy<-readline("Physics Marks: ")
Chem<-readline("Chemistry Marks: ")
Bio<-readline("Biology Marks: ")
PhyP<-as.numeric(Phy)/150*100
ChemP<-as.numeric(Chem)/150*100
BioP<-as.numeric(Bio)/150*100
C<-0
if(PhyP<40){
  C<-C+1
}
if(ChemP<40){
  C<-C+1
}
if(BioP<40){
  C<-C+1
}
if(C>0){
  if(C>1){
    if(C>2){
      print("Go Home")
    }else{print("Retake Year")}
  }else{
      print("Retake Exam")
    }
}else{print("Good Job")}