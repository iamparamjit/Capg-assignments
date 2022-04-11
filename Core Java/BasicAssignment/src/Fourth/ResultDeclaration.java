package Fourth;

public class ResultDeclaration {
	 public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) 
	 {
		 double s1=subject1Marks;
		 double s2=subject2Marks;
		 double s3=subject3Marks;
		
		 if((s1+s2+s3)>60 && s1<60 && s2<60 && s3<60 && (s1+s2)<60 && (s2+s3)<60 && (s3+s1)<60)
		 {
			 return "Passed";
		 }
		 else if(((s1+s2)>60 || (s2+s3)>60 || (s3+s1)>60) && (s1<60  && s2<60 && s3<60))
		 {
			 return "Passed \nPromoted";
		 }
		 else if(s1>60 || s2>60 || s3>60)
		 {
			 return "Failed";
		 }
		 else if((s1+s2+s3)<60)
		 {
			 return "Failed";
		 }
		 else
		 {
			 return "";
		 }
		 
	 }
	 

}
