package programs;

public class SecondMax {

	public static void main(String[] args) {
	int a[]= {5,3,9,6,8,4,7};
	int temp=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-i-1;j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	System.out.println(a[a.length-1]+":"+a[a.length-2]);
	}

}	