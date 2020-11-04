class Mynumber {
	int number;
}
class MyfirstJava{
	public static void main(String[] args){
		Mynumber[] b;			//宣告一個自行設計的物件的矩陣變數
		b = new Mynumber[2];	//用內建方法new 設定矩陣的長度，產生實體新物件
		b[0] = new Mynumber();	/*因為是自行設計的物件，
			   					  故須以內建方法new產生矩陣元素(cell)的新物件*/	
		b[1] = new Mynumber();	
		b[0].number = 23;		//才可賦予指定值
		b[1].number = 12;
		for(int i= 0; i<b.length; i++){
			System.out.println(b[i].number) ;
		}

		
	}
}