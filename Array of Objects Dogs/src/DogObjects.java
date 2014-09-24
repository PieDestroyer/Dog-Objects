import java.util.ArrayList;

public class DogObjects
	{
	private String name;
	private String breed;
	private int age;
	private double weight;

	public DogObjects(String n, String b, int a, double w)
		{
		name = n;
		breed = b;
		age = a;
		weight = w;

		}

	public String getName()
		{
		return name;
		}

	public String getBreed()
		{
		return breed;
		}

	public int getAge()
		{
		return age;
		}

	public double getWeight()
		{
		return weight;
		}

	public static void main(String[] args)
		{
		ArrayList<DogObjects> dog=new ArrayList<DogObjects>();
		dog.add(new DogObjects("Jimmy","Golden Retriever", 4, 40.7));
		dog.add(new DogObjects("Jack", "St. Bernard", 7, 70.3));
		dog.add(new DogObjects("Colin", "Poodle", 6, 15.3));
		dog.add(new DogObjects("Cole", "Tibetan Mastiff", 13, 60.9));
		dog.add(new DogObjects("Petie", "Jack Russel Chihuahua", 4, 13.4));
		
		for(DogObjects x:dog)
			System.out.println(x.getName()+" the "+x.getBreed()+ " who is "+x.getAge()+ " weighs "+ x.getWeight()+" lbs.");
		}

	}
