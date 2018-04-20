import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Vector;


public class MonteCarlo {
	private int volume;
	private int numSampleRuns;
	private int numPoints;
	private int dimension;
	//Constructor
	public MonteCarlo(int dim, int n,int p)
	{
		this.dimension = dim;
		this.numSampleRuns=n;
		this.numPoints=p;	
	}
	//Get functions
	public int getDimension(){
		return dimension;
	}
	public int getSampleRuns(){
		return numSampleRuns;
	}
	public int getPoints(){
		return numPoints;
	}
	public void runSim()
	{
		long startTime = System.currentTimeMillis();
		double sum=0.0;
		for(int i=0;i<numSampleRuns;i++)
			sum+=nSphereVolume(dimension,numPoints);
		System.out.println("Volume: "+sum/numSampleRuns);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Time: "+totalTime);
	}
	public static double nSphereVolume(int d, int N)
	{		
		Vector<Double> x = new Vector<Double>(d); //create a vector for all the x1,x2,x3..etc for each dimension
		Vector<Double> results = new Vector<Double>(d); //results vector
		Random rand = new Random();
		double[] sqSum = new double[2];
		int[] myCounter = new int[2];
		myCounter[0]=0;
		myCounter[1]=0;
		rand.setSeed(System.currentTimeMillis()); //set the seed for randomness
		for(int i=1;i<=N;i++)
		{
			sqSum[0]=0.0;
			sqSum[1]=0.0;
			for(int j=0;j<d;j++)
				x.add(j, rand.nextDouble()); //add random point to vector		
			for(int k=0;k<d;k++) //square all points then add to vector
			{
				results.add(k,Math.pow(x.get(k), 2)); //add to result vector
				double num = x.get(k);
				sqSum[0]+=num*num; // variance reduction
				sqSum[1]+=(1-num)*(1-num);
			}
		    if (sqSum[0] <= 1) //check if both in the circle
		    	++myCounter[0];
		    if (sqSum[1] <= 1) 
		    	++myCounter[1];

			x.clear();//resetting values
			results.clear();			
		}		
		double volume = Math.pow(2,d)*myCounter[0] / (double)N; //calculate the volume 
		double volume2 = Math.pow(2,d)*myCounter[1] / (double)N;
		double realVolume = (volume+volume2)/2;
		//System.out.println(realVolume);			
		return realVolume;
	}	
	//recursive n-sphere calc
	public static double dimVol(double d)
	{
		if(d==1)
			return 2.0;
		else if(d ==2)
			return Math.PI;
		
		if(d%2!=0)
			return dimVol(d-2)*2.0*Math.PI/d; //2R*2*PI /N
		else
			return dimVol(d-2)*2.0*Math.PI/d;
		
	}

}
