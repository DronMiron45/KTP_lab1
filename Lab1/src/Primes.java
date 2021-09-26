public class Primes
{ 
	public static void main(String[] args)
	{
		int n = 100;
		isPrime(n);		
	}
		
		// Проверка аргумента на принадлежность к простым числам
		public static void isPrime(int n)
		{				
			boolean b = true;
			for(int i = 2; i <= n; i++) 
			{				
				for(int j = 2; j < i; j++) 
				{						
					if(i % j == 0) 
					{
						b = false;
					}
				}	
				if(b) System.out.println(i);
				else b = true;												
			}
		}
}