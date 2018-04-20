
public class Integration {
	
	//Vars
	private int dimension;
	private int K;
	//Constructor
	public Integration(int dim, int K)
	{
		this.dimension = dim;
		this.K=K;	
	}
	//Get functions
	public int getDimension(){
		return dimension;
	}
	public int getK(){
		return K;
	}
	/*--------------------------------------*/
	/*		Volume of Cube Functions	    */
	/*--------------------------------------*/
	public static void dVol1(int d, int K)
	{
		double step = (double)1/K/2; //step size from origin
		long count=0;
		double x=0.0;
		for(int i=0;i<K;i++)
		{	
			x=(double)i/K+step; //generate point
			double point =  (Math.pow(x, 2));		
			if(point <= 1) //if less than the radius its in the circle
				count++;		
		}
		printVolCube(count, d, K);		
	}
	public static void dVol2(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z=0.0;
		for(int i=0;i<K;i++)
		{
			for(int j=0;j<K;j++)
			{				
				x=(double)i/K+step; //generate the point
				y=(double)j/K+step;				
				double point =  (Math.pow(x, 2)+Math.pow(y, 2));					
				if(point <= 1) //if less than the radius its in the circle
					count++;		
			}
			
		}
		printVolCube(count, d, K);		
	}
	public static void dVol3(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z=0.0;
		for(int i=0;i<K;i++)
		{

			for(int j=0;j<K;j++)
			{
				for(int k=0;k<K;k++)
				{				
					x=(double)i/K+step; //generate point
					y=(double)j/K+step;
					z=(double)k/K+step;
					double point =  (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));					
					if(point <= 1) //if less than the radius its in the circle
						count++;
				}
			}
			
		}
		printVolCube(count, d, K);		
	}
	public static void dVol4(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z,s=0.0;
		for(int i=0;i<K;i++)
		{
			for(int j=0;j<K;j++)
			{
				for(int k=0;k<K;k++)//for(int k=0;k<=K;k++)
				{
					for(int e=0;e<K;e++)
					{
						x=(double)i/K+step; //generate point
						y=(double)j/K+step;
						z=(double)k/K+step;
						s=(double)e/K+step;
						double point =  (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)+Math.pow(s, 2));					
						if(point <= 1) //if less than the radius its in the circle
							count++;
					}
				}
			}
			
		}
		printVolCube(count, d, K);		
	}
	public static void dVol5(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z,s,q=0.0;
		for(int i=0;i<K;i++)
		{
			for(int j=0;j<K;j++)
			{
				for(int k=0;k<K;k++)
				{
					for(int e=0;e<K;e++)
					{
						for(int g=0;g<K;g++)
						{
							x=(double)i/K+step; //generate point
							y=(double)j/K+step;
							z=(double)k/K+step;
							s=(double)e/K+step;
							q=(double)g/K+step;
							double point =  (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)+Math.pow(s, 2)+Math.pow(q, 2));					
							if(point <= 1) //if less than the radius its in the circle
								count++;
						}

					}
				}
			}
			
		}
		printVolCube(count, d, K);	
	}
	public static void dVol6(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z,s,q,t=0.0;
		for(int i=0;i<K;i++)
		{
			for(int j=0;j<K;j++)
			{
				for(int k=0;k<K;k++)
				{
					for(int e=0;e<K;e++)
					{
						for(int g=0;g<K;g++)
						{
							for(int h=0;h<K;h++)
							{
								x=(double)i/K+step; //generate point
								y=(double)j/K+step;
								z=(double)k/K+step;
								s=(double)e/K+step;
								q=(double)g/K+step;
								t=(double)h/K+step;
								double point =  (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)+Math.pow(s, 2)+Math.pow(q, 2)+Math.pow(t, 2));					
								if(point <= 1) //if less than the radius its in the circle
									count++;								
							}
						}

					}
				}
			}
			
		}
		printVolCube(count, d, K);
		
	}
	public static void dVol7(int d, int K)
	{
		double step = (double)1/K/2;
		long count=0;
		double x,y,z,s,q,t,v=0.0;
		for(int i=0;i<K;i++)
		{
			for(int j=0;j<K;j++)
			{
				for(int k=0;k<K;k++)
				{
					for(int e=0;e<K;e++)
					{
						for(int g=0;g<K;g++)
						{
							for(int h=0;h<K;h++)
							{
								for(int f=0;f<K;f++)
								{
									x=(double)i/K+step;
									y=(double)j/K+step;
									z=(double)k/K+step;
									s=(double)e/K+step;
									q=(double)g/K+step;
									t=(double)h/K+step;
									v=(double)f/K+step;
									double point =  (Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2)+Math.pow(s, 2)+Math.pow(q, 2)+Math.pow(t, 2)+Math.pow(v, 2));					
									//System.out.println("point "+point);
									if(point <= 1) //if less than the radius its in the circle
										count++;
								}
							}
						}

					}
				}
			}
			
		}
		printVolCube(count, d, K);	
	}


	public static void dCubeVol(int d, int K)
	{
		if(d==1)
			dVol1(d,K);
		else if(d==2)
			dVol2(d,K);
		else if(d==3)
			dVol3(d,K);
		else if(d==4)
			dVol4(d,K);
		else if(d==5)
			dVol5(d,K);
		else if(d==6)
			dVol6(d,K);
		else
			System.out.println("invalid d");
	}
	public static void printVolCube(long count, int d, int K)
	{
		double volPerCube = Math.pow(2.0/K,d);
		double vol =((double)count* volPerCube);		
		System.out.println("Dimension: "+d+"   Volume: "+ vol);
	}
	public void runSim()
	{
		dCubeVol(dimension,this.K);
	}
}
