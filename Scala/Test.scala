var Physics:Int = 150
val Chemistry = 150
var Biology = 150
var Total = Physics+Chemistry+Biology
var Percentage=Total*100/450
println("Total Marks For All Three Exams: "+Total)
if (Percentage>=60){
	print("Pass " +Percentage+ "%")
}else{
	print("Fail " +Percentage+"%")
}