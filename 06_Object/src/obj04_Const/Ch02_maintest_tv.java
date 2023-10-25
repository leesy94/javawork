package obj04_Const;

public class Ch02_maintest_tv {

	public static void main(String[] args) {
		Ch02_tv tv = new Ch02_tv("lg","하이퍼 울트라",70,23,72,false);
		Ch02_tv tv2 = new Ch02_tv("삼성","하이퍼 울트라 랄라",80,33,92,true);
		
		System.out.printf("제조사:%s\n모델명:%s\n인치:%d\n볼륨:%d\n채널:%d\n티비켰는지:%s\n\n",tv.com,tv.model,tv.inch,tv.val,tv.ch,tv.turn);
		System.out.printf("제조사:%s\n모델명:%s\n인치:%d\n볼륨:%d\n채널:%d\n티비켰는지:%s\n",tv2.com,tv2.model,tv2.inch,tv2.val,tv2.ch,tv2.turn);
	}

}
