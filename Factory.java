public class Factory {
	public static void main(String[] args) {
		FacCall X,Y,Z,L;
		X=FacCall.Limit();
		Y=FacCall.Limit();
		Z=FacCall.Limit();
		L=FacCall.Limit();
		System.out.println(X+"  "+Y+"  "+Z+"  "+L);
	}
}