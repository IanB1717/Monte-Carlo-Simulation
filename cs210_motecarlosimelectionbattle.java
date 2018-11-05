import java.util.*; //imoort so can use the Random() function
public class cs210_motecarlosimelectionbattle {
public static void main(String args[])
{
	double d1=ElectionSim(10000); // double variable returned from the ElectionSim method
	//System.out.println(d1);  // print the variabl
	double d2=ElectionSim2(10000);
	double d3=ElectionSim3(10000);
	double d4=ElectionSim4(10000);
	double d5=ElectionSim5(10000);
	double d6=ElectionSim6(10000);

	 double probs = (d1+d2+d3+d4+d5+d6)/6;
	 System.out.println(probs);
}
  public static double ElectionSim(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
		//double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.98)
		{
			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.029)
		{
			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.012)
		{
			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }
    public static double ElectionSim2(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
		//double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.98)
		{
			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.012)
		{
			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.029)
		{
			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }
    public static double ElectionSim3(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
		//double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.029)
		{

			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.98)
		{
			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.012)
		{
			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }
    public static double ElectionSim4(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
	//	double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.029)
		{

			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.012)
		{

			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.098)
		{

			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }
    public static double ElectionSim5(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
		//double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.012)
		{
			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.029)
		{
			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.98)
		{

			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }
    public static double ElectionSim6(int numTrials)
  {
  	//read in the probability of the candidates chances of winning the election
  	    double M = 0.98;
		double S = 0.04;//dragon
		double P = 0.012;//dragon
		 double J = 0.012;
		double L = 0.029;
		 double G = 0.009;//dragon
		int number=0;
		double result=0;
		double probs[]={M,S,P,J,L,G};
		//double [] elect = new double[6]; // array to list the candidates in winning oreder
		Random rand = new Random();   // variable random created for ease
		for(int i=0;i<numTrials;i++)
		{
			//election simulation battle

		double pres = (double) (Math.random() * 1.0);
		if(pres>0&&pres<=0.012)
		{
			number++;
		}
		double pres2 = (double) (Math.random() * (1.0-pres));
		if(pres2>0&&pres2<=0.98)
		{
			number++;
		}

		double pres3 = (double) (Math.random() * (1.0-(pres+pres2)));
		if(pres3>0&&pres3<=0.012)
		{
			number++;
		}
		if(number%3==0) // check if the non dragons have come top three
		{
			result++;
		}


		}


		return result/numTrials; //returning proability that they come in last three positions.

    }




}