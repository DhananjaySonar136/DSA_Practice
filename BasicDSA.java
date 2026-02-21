import java.util.Arrays;

class BasicDSA{

// Print Numbers from n to 0 Without Loop (Using Recursion) *********
	// void print(int n){
	// 	if (n<0) {
	// 		return;
	// 	}
	// 	System.out.println(n);
	// 	print(n-1);
	// }

// Check if Two Strings are Anagrams ****************
	// Boolean isAnagram(String s1,String s2){
	// 	char[] ch1=s1.toLowerCase().toCharArray();
	// 	char[] ch2=s2.toLowerCase().toCharArray();

	// 	Arrays.sort(ch1);
	// 	Arrays.sort(ch2);

	// 	return Arrays.equals(ch1,ch2);
	// }


// Check if String is Palindrom **************
	// boolean palindrom(String str){
	// 	String sb=new StringBuilder(str).reverse().toString();
	// 	return sb.equals(str);
	// }


//Reverse Array / String **********************
	// char[] reverseArray(char[] a){
	// 	int i=0;
	// 	int j=a.length-1;

	// 	while(i<j){
	// 		char temp=a[i];
	// 		a[i]=a[j];
	// 		a[j]=temp;

	// 		i++;
	// 		j--;
	// 	}
	// 	return a;
	// }



	// void reverseArray(String str){
	// 	StringBuilder sb=new StringBuilder(str).reverse();
	// 	System.out.println(sb);

	// }

//Count of Every Letter in a String ****************************
	// Map<Character,Integer> countFrequency(String str){

	// 	char[] ch=str.toCharArray();
	// 	Map<Character,Integer> map=new HashMap<>();
	// 	for(char c:ch){
	// 		if(map.containsKey(c)){
	// 			map.put(c,map.get(c)+1);
	// 		}
	// 		else{
	// 			map.put(c, 1);
	// 		}
	// 	}

	// 	return map;
	// }

//**************************************** */
	int[] count(String str){
		char[] ch=str.toCharArray();
		int[] alpha=new int[26];
		int[] beta=new int[26];

		for(char c:ch){
			if((int)c>=97 && (int)c<=123)
				alpha[c-'a']++;
		}
		for(char c:ch){
			if((int)c>=65 && (int)c<=91)
				beta[c-'A']++;
		}

		for(int i=0;i<beta.length;i++){
			if(beta[i]!=0){
				System.out.println((char)(i+'A')+":"+beta[i]);
			}
		}
		return alpha;
	}

//factorial by recursion
	int fact(int n){
		if(n==0 || n==12)
			return 1;
		return n*fact(n-1);
	}

	char[] reverseString(String str){
		char ch[]=str.toCharArray();
		int a=0,b=ch.length-1;
			while(a<b){
				char temp=ch[a];
				ch[a]=ch[b];
				ch[b]=temp;

				a++;
				b--;
			}
		return ch;
	}

//******************************************** */
	Boolean checkpalindrom(int n){
		int original=n;
		int reverse=0;
		int digit;

		while(n>0){
			digit=n%10; //extract last digit
			reverse=reverse*10+digit; //reverse number
			n=n/10;   //remove digit
		}

		if(original==reverse){
			return true;
		}
		else
			return false;
	}

//********************************************
	void fabinnaci(int n){
		int a=0;
		int b=1;
		for(int i=0;i<n;i++){
			System.out.println(a);
			int temp=b+a;
			a=b;
			b=temp;
		}
	}

//reverse String without using 3rd Variable
	String reverseStr(String str){
		String reverse="";
		for(int i=str.length()-1;i>=0;i--){
			reverse=reverse+str.charAt(i);
		}

		return reverse;
	}


	//Find largest / second largest element
	int findlargestandsecdlargest(int[] n){
		int max=0;
		int second=0;
		int third=0;
		for(int i:n){
			if(i>max){
				second=max;
				max=i;
			}
			if(i>second && i != max){
				third=second;
				second=i;
			}
			if(i>third && i< second && i!=max){
				third=i;
			}
		}
		System.out.println("Second largest :"+second);
		System.out.println("Third largest :"+third);
		return max;
	}

	int[] frequencyCount(String str){
		int frequency[]=new int[26];
		char[] ch=str.toCharArray();

		for(char c:ch){
			frequency[c-'a']++;
		}

		return frequency;
	}

	void bubblesort(int[] arr){
		int n=arr.length;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i : arr){
			System.out.println(i);
		}
	} 


	  int findmissingnumber(int [] arr,int n){
			int sum=0;
			int total=(n*(n+1))/2; //add all the number and substract the sum value of given array

			for(int i:arr){
				sum+=i;
			}

			int res=total-sum;
			return res;		
	  }


	  void checkanagram(String str1,String str2){
			char[] ch1=str1.toLowerCase().toCharArray();
			char[] ch2=str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			System.err.println(ch1);
			System.err.println(ch2);
			if(Arrays.equals(ch1, ch2)){
				System.err.println("String is anagram");
			}
			else{
				System.err.println("Not Anagram..");
			}
	  }

	  boolean checkPrime(int n,int i){
		int count=0;

			if(n<=1){
				return false;
			}
			if(i*i > n){
				return true;
			}
			if(n%i==0)
				return false;
			
			return checkPrime(n, i+1);
	  }
	  
	  //swap two number without 3rd variable
	  void swap(int a,int b){
		a=a-b;
		b=b+a;
		a=b-a;

		System.out.println("a :"+a);
		System.out.println("b :"+b);
	  }

	public static void main(String args[]){
		BasicDSA d=new BasicDSA();
		d.swap(2, 3);
		//System.err.println(d.checkPrime(16,2));
		
		// StringBuilder s1= new StringBuilder("Dhananjay");
		// System.out.println(s1);
		//d.checkanagram("Dhananjay", "jayDhanan");

		// int arr[]={1,2,4,5};
		// System.out.println(d.findmissingnumber(arr,5));
		
		// int[] arr={4,3,5,2,1};
		// d.bubblesort(arr);

		// int[] freq=d.frequencyCount("dhananjay");
		// for(int i=0;i<freq.length;i++){
		// 	if(freq[i]!=0){
		// 		System.out.println((char)('a'+i)+":"+freq[i]);
		// 	}
		// }

		// int[] arr={10,2,30,4,52};
		// System.out.println(d.findlargestandsecdlargest(arr));
		
		//System.out.println(d.reverseStr("dHANANJAY"));
		
		//d.fabinnaci(5);

		// System.out.println("Palindrome :"+(d.checkpalindrom(211112)));
		// System.out.println(d.reverseString("Dhananjay"));
		
		// System.out.println(ch);



		// String str="Dhananjay";
		// int[] frequency=d.count(str);
		// for(int i=0;i<frequency.length;i++){
		// 	if(frequency[i]!=0){
		// 		System.out.println((char)(i+'a')+":"+frequency[i]);
		// 	}
		
		// }


	}
}